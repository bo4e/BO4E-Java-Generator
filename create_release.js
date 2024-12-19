const {Octokit} = require('octokit');
const commandLineArgs = require('command-line-args');
const commandLineUsage = require('command-line-usage');
const fs = require('fs');

let octokit = new Octokit();
let input_octokit = new Octokit();

const optionDefinitions = [
    {
        name: 'owner',
        description: 'The owner of the github repository.',
        alias: 'o',
        type: String,
        typeLabel: '{underline owner}'
    },
    {
        name: 'repo',
        description: 'The name of the github repository.',
        alias: 'r',
        type: String,
        typeLabel: '{underline repo}'
    },
    {
        name: 'tag',
        description: 'The tag to be used for the release.',
        alias: 't',
        type: String,
        typeLabel: '{underline tag}'
    },
    {
        name: 'branch',
        description: 'The branch to be used for the release.',
        alias: 'b',
        type: String,
        typeLabel: '{underline branch}'
    },
    {
        name: 'auth',
        description: 'Token for authorization at the github repository.',
        alias: 'a',
        type: String,
        typeLabel: '{underline token}'
    },
    {
        name: 'input-file',
        description: 'Path to a file containing the release information.',
        alias: 'i',
        type: String,
        typeLabel: '{underline path}'
    },
    {
        name: 'prerelease',
        description: 'Mark release as prerelease.',
        alias: 'p',
        type: Boolean,
    },
    {
        name: 'latest',
        description: 'Mark release as latest.',
        alias: 'l',
        type: Boolean,
    },
    {
        name: 'input-owner',
        description: 'The owner of the input github repository.',
        type: String,
        typeLabel: '{underline owner}'
    },
    {
        name: 'input-repo',
        description: 'The name of the input github repository.',
        type: String,
        typeLabel: '{underline repo}'
    },
    {
        name: 'input-auth',
        description: 'Token for authorization at the input github repository.',
        type: String,
        typeLabel: '{underline token}'
    },
    {
        name: 'help',
        description: 'Display this usage guide.',
        alias: 'h',
        type: Boolean
    }
];

const sections = [
    {
        header: 'BO4E Java Generator',
        content: 'Create a release of a GitHub repository'
    },
    {
        header: 'Synopsis',
        content: [
            'node create_release.js [{underline options}] {bold -o} {underline owner} {bold -r} {underline repo} {bold -t} {underline tag} {bold -i} {underline path}',
            'node create_release.js [{underline options}] {bold -o} {underline owner} {bold -r} {underline repo} {bold -t} {underline tag} {bold --input-owner} {underline owner} {bold --input-repo} {underline repo}',
            'node create_release.js {bold --help}'
        ]
    },
    {
        header: 'Options',
        optionList: optionDefinitions
    },
    {
        content: 'Project home: {underline https://github.com/TimoMolls/BO4E-Java-Generator}'
    }
];

/**
 * Ensure that the response has the given status code
 * @param response{OctokitResponse}
 * @param statuscode {number}
 */
function ensure_status_code(response, statuscode = 200) {
    if (response['status'] !== statuscode) {
        console.log(response['data']);
        throw new Error('Request failed: got ' + response['status']);
    }
}

/**
 * Get the information about the release with the given tag
 * @param owner {string} owner of the repository
 * @param repo {string} name of the repository
 * @param tag {string} tag of the repository
 * @return {Promise<any>}
 */
async function get_release_infos(owner, repo, tag) {
    const response = await input_octokit.request('GET /repos/{owner}/{repo}/releases/tags/{tag}', {
        owner: owner,
        repo: repo,
        tag: tag
    });
    ensure_status_code(response);
    return response.data;
}

/**
 * Get the information about the latest release
 * @param owner {string} owner of the repository
 * @param repo {string} name of the repository
 * @return {Promise<any>}
 */
async function get_latest_release_infos(owner, repo) {
    const response = await input_octokit.request('GET /repos/{owner}/{repo}/releases/latest', {
        owner: owner,
        repo: repo
    });
    ensure_status_code(response);
    return response.data;
}

/**
 * Create a release for the given repository
 * @param owner {string} owner of the repository
 * @param repo {string} name of the repository
 * @param tag {string} tag of the repository
 * @param release_info {string} information about the release
 * @param branch {string} branch of the repository
 * @param is_prerelease {boolean} whether release is prerelease
 * @param is_latest {boolean} whether release is latest
 * @returns {Promise<void>}
 */
async function create_release(owner, repo, tag, release_info, branch = 'main', is_prerelease = false, is_latest = true) {
    const target = branch;
    if (branch !== 'main') {
        branch[0] = branch[0].toLowerCase();
        tag += '-' + branch.at(0) + branch.match(RegExp('[A-Z][a-z]*', 'g')).map(value => value.toLowerCase().at(0)).join('');
    }
    const response = await octokit.request('POST /repos/{owner}/{repo}/releases', {
        owner: owner,
        repo: repo,
        tag_name: tag,
        target_commitish: target,
        name: tag,
        body: release_info,
        draft: false,
        prerelease: is_prerelease,
        make_latest: is_latest.toString()
    });
    ensure_status_code(response, 201);
}

async function main() {
    const options = commandLineArgs(optionDefinitions);
    if (options['help']) {
        console.log(commandLineUsage(sections));
        process.exit();
    }
    const owner = options['owner'];
    const repo = options['repo'];
    const tag = options['tag'];
    const branch = options['branch'] || 'main';
    if (options['auth']) {
        octokit = new Octokit({auth: options['auth']});
    }
    let latest_release_tag = '';
    let release_info;
    let is_prerelease = false;
    if (options['input-file']) {
        release_info = fs.readFileSync(options['input-file'], 'utf8');
    } else {
        const input_owner = options['input-owner'];
        const input_repo = options['input-repo'];
        if (options['input-auth']) {
            input_octokit = new Octokit({auth: options['input-auth']});
        }
        const release_infos = await get_release_infos(input_owner, input_repo, tag);
        is_prerelease = release_infos['prerelease'];
        release_info = release_infos['body'];
        latest_release_tag = (await get_latest_release_infos(input_owner, input_repo))['tag_name'];
    }
    is_prerelease = is_prerelease || !!options['prerelease'] || tag.includes('-rc') || branch !== 'main';
    const latest_is_prerelease = latest_release_tag.includes('-rc');
    const is_latest = !is_prerelease && (!!options['latest'] || latest_is_prerelease || tag === latest_release_tag);
    await create_release(owner, repo, tag, release_info, branch, is_prerelease, is_latest);
}

main().then();
