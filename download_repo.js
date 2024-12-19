const {Octokit} = require('octokit');
const decompress = require('decompress');
const fs = require('node:fs');
const commandLineArgs = require('command-line-args');
const commandLineUsage = require('command-line-usage');

let octokit = new Octokit();
const zipPath = 'tmp.zip';
const dirPath = 'tmp';

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
        description: 'The tag of the github repository.',
        alias: 't',
        type: String,
        typeLabel: '{underline tag}'
    },
    {
        name: 'auth',
        description: 'Token for authorization.',
        alias: 'a',
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
        content: 'Download a GitHub repository'
    },
    {
        header: 'Synopsis',
        content: [
            'node download_repo.js {bold --owner} {underline owner} {bold --repo} {underline repo} [{underline options}]',
            'node download_repo.js {bold --help}'
        ]
    },
    {
        header: 'Options',
        optionList: optionDefinitions
    },
    {
        header: 'Examples',
        content: [
            {
                desc: '1. Download the latest BO4E-Schemas repository',
                example: 'node download_repo.js -o bo4e -r BO4E-Schemas'
            },
            {
                desc: '2. Download the BO4E-Schemas repository version 202401.4.0',
                example: 'node download_repo.js -o bo4e -r BO4E-Schemas -t v202401.4.0'
            }
        ]
    },
    {
        content: 'Project home: {underline https://github.com/TimoMolls/BO4E-Java-Generator}'
    }
];

/**
 * Download a zip of the given repository with the given tag (or latest)
 * @param owner {string} owner of the repository
 * @param repo {string} name of the repository
 * @param tag {string} tag to look for, defaults to latest
 * @return {Promise<void>}
 */
async function downloadGitHubZip(owner, repo, tag = 'latest') {
    let response;
    if (tag && tag.toLowerCase() !== 'latest') {
        response = await octokit.request('GET /repos/{owner}/{repo}/zipball/tags/{tag}', {
            owner: owner,
            repo: repo,
            tag: tag
        });
    }
    else {
        response = await octokit.request('GET /repos/{owner}/{repo}/zipball', {
            owner: owner,
            repo: repo
        });
    }
    if (response.status === 200) {
        const buffer = Buffer.from(response.data);
        fs.writeFileSync(zipPath, buffer);
    }
    else {
        throw Error('Unable to download file');
    }
}

/**
 * Download the content of the given repository
 * @param owner {string}
 * @param repo {string}
 * @param tag {string}
 * @return {Promise<void>}
 */
async function downloadFromRepo(owner, repo, tag = 'latest') {
    await downloadGitHubZip(owner, repo, tag);
    await decompress(zipPath, dirPath);
    fs.rmSync(zipPath);
    const dirContent = fs.readdirSync(dirPath);
    const dirName = dirContent.find(dir => dir.startsWith(`${owner}-${repo}`));
    if (dirName !== undefined) {
        fs.cpSync(`${dirPath}/${dirName}`, repo, {recursive: true});
    }
    else {
        throw Error(`Could not find directory starting with "${owner}-${repo}"`);
    }
    fs.rmSync(dirPath, {recursive: true});
}

async function main() {
    const options = commandLineArgs(optionDefinitions);
    if (options['help']) {
        console.log(commandLineUsage(sections));
        process.exit();
    }
    if (options['auth']) {
        octokit = new Octokit({auth: options['auth']});
    }
    const owner = options['owner'];
    const repo = options['repo'];
    const tag = options['tag'] ? options['tag'] : 'latest';
    if (!owner || !repo) {
        console.error('No repository provided.');
        process.exit(1);
    }
    await downloadFromRepo(owner, repo, tag);
}

main().then();
