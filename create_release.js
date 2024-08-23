const {Octokit} = require("octokit");

if (!process.argv[2] || !process.argv[3]) {
    throw new Error("Argument required")
}
const auth_octokit = new Octokit({
    auth: process.argv[2]
});
const octokit = new Octokit()

/**
 *
 * @param response{OctokitResponse}
 * @param statuscode {number}
 */
function ensure_status_code(response, statuscode = 200) {
    if (response.status !== statuscode) {
        console.log(response.data)
        throw new Error("Request failed: got " + response.status);
    }
}

async function get_release_infos(version) {
    const response =  await octokit.request('GET /repos/{owner}/{repo}/releases/tags/{tag}', {
        owner: 'bo4e',
        repo: 'BO4E-Schemas',
        tag: version
    });
    ensure_status_code(response);
    return response.data;
}

async function get_latest_release_tag() {
    const response = await octokit.request('GET /repos/{owner}/{repo}/releases/latest', {
        owner: 'bo4e',
        repo: 'BO4E-Schemas'
    });
    ensure_status_code(response);
    return response.data['tag_name'];
}

/**
 *
 * @param version {string}
 * @param release_infos {string[]}
 * @param is_prerelease {boolean}
 * @param is_latest {boolean}
 * @param addon {string|null}
 * @returns {Promise<void>}
 */
async function create_release(version, release_infos, is_prerelease, is_latest, addon) {
    let target = 'master';
    if (addon != null) {
        version += "-wd"
        target = 'withDependencies';
    }
    const response = await auth_octokit.request('POST /repos/{owner}/{repo}/releases', {
        owner: 'TimoMolls',
        repo: 'BO4E-Java',
        tag_name: version,
        target_commitish: target,
        name: release_infos['name'],
        body: release_infos['body'],
        draft: false,
        prerelease: is_prerelease,
        make_latest: is_latest.toString()
    });
    ensure_status_code(response, 201);
}

async function main(version, addon = null) {
    const release_infos = await get_release_infos(version);
    const is_prerelease = (release_infos['prerelease'] || version.includes('-rc') || addon != null)
    const latest_release_tag = await get_latest_release_tag();
    const latest_is_prerelease = latest_release_tag.includes('-rc')
    const is_latest = !is_prerelease && (latest_is_prerelease || version === latest_release_tag);
    await create_release(version, release_infos, is_prerelease, is_latest, addon);
}

if (process.argv[4]) {
    main(process.argv[3], process.argv[4]).then();
} else {
    main(process.argv[3]).then();
}
