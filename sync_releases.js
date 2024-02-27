const {Octokit} = require("octokit");

if (!process.argv[2]) {
    throw new Error("Argument required")
}
const auth_octokit = new Octokit({
    auth: process.argv[2]
});
const octokit = new Octokit()

/**
 *
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
          return response.data
      } else {
          throw new Error("Request failed: " + response.status)
      }
}

async function main() {
    const schema_releases = await getReleases(octokit, "bo4e", "BO4E-Schemas");
    const java_releases = await getReleases(auth_octokit, "TimoMolls", "BO4E-Java");
    const date = new Date()
    for (const release of schema_releases) {
        if (release['tag_name'].startsWith("v" + date.getFullYear())) {
            const index = java_releases.findIndex(java_release => java_release['tag_name'] === release['tag_name']);
            if (index < 0) {
                console.log(release['tag_name']);
                return;
            }
        }
    }
    console.log("none")
}

main().then();
