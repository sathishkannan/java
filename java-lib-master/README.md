[![build status](https://gitlab.aws.s1lv.com/developers-us/java-lib/badges/master/build.svg)](https://gitlab.aws.s1lv.com/developers-us/java-lib/commits/master)
[![coverage report](https://gitlab.aws.s1lv.com/developers-us/java-lib/badges/master/coverage.svg)](https://gitlab.aws.s1lv.com/developers-us/java-lib/commits/master)

# README

Demo Maven dependency

## How to prepare

- clone this repository
- in **Settings ➔ General**, enable **Only allow merge requests to be merged if the pipeline succeeds**
- in **Settings ➔ Pipelines**, set a secret variable named **PACKAGECLOUD_TOKEN** to the [packagecloud API Token](https://packagecloud.io/api_token)
- in **Settings ➔ Pipelines**, set **Test coverage parsing** to `Code coverage is (\d+\%)`
- clone repository for the `demo-app`
- change the `demo-app` project id in the `curl` command (`trigger` job in `.gitlab-ci.yml`)
- create a pipeline for `master`
- create a pipeline for `break-tests` branch (it will fail)
- create a pipeline for `improve-code-quality` branch
- create a MR for `break-tests`
- create a MR for `improve-code-quality`