const {Octokit} = require('octokit');
const commandLineArgs = require('command-line-args');
const commandLineUsage = require('command-line-usage');

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
        name: 'auth',
        description: 'Token for authorization at the github repository.',
        alias: 'a',
        type: String,
        typeLabel: '{underline token}'
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
        content: 'Synchronise releases of two GitHub repositories'
    },
    {
        header: 'Synopsis',
        content: [
            'node sync_releases.js [{underline options}] {bold -o} {underline owner} {bold -r} {underline repo} {bold --input-owner} {underline owner} {bold --input-repo} {underline repo}',
            'node sync_releases.js {bold --help}'
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
 * get the latest release of the given GitHub repository
 * @param http {Octokit}
 * @param owner {string}
 * @param repo {string}
 * @returns {Promise<any[]>}
 */
async function getReleases(http, owner, repo) {
    const response = await http.request('GET /repos/{owner}/{repo}/releases', {
        owner: owner,
        repo: repo
    });
    if (response.status === 200) {
        return response.data;
    }
    else {
        throw new Error('Request failed: ' + response.status);
    }
}

async function main() {
    const options = commandLineArgs(optionDefinitions);
    if (options['help']) {
        console.log(commandLineUsage(sections));
        process.exit();
    }
    const owner = options['owner'];
    const repo = options['repo'];
    if (options['auth']) {
        octokit = new Octokit({auth: options['auth']});
    }
    const input_owner = options['input_owner'];
    const input_repo = options['input_repo'];
    if (options['input-auth']) {
        input_octokit = new Octokit({auth: options['input-auth']});
    }
    const releases = await getReleases(octokit, owner, repo);
    const input_releases = await getReleases(input_octokit, input_owner, input_repo);
    const date = new Date();
    const tags = [];
    for (const input_release of input_releases) {
        if (input_release['tag_name'].startsWith('v' + date.getFullYear()) || input_release['tag_name'].startsWith('v' + (date.getFullYear() - 1))) {
            const index = releases.findIndex(release => release['tag_name'] === input_release['tag_name']);
            if (index < 0) {
                tags.push(input_release['tag_name']);
            }
        }
    }
    if (tags.length > 0) {
        console.log(tags[tags.length - 1]);
    }
    else {
        console.log('none');
    }
}

main().then();
