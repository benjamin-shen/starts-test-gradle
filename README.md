To test:

1. Clone [starts](https://github.com/benjamin-shen/starts)
2. In `starts`, `git checkout gradle-plugin` and then `cd starts-gradle-plugin`
3. Run `./gradlew publishToMavenLocal`
4. Clone starts-test-gradle
5. In `starts-test-gradle`, run Gradle tasks implemented in `starts/starts-gradle-plugin`

Example commands:
- `./gradlew startsHelp`
  - observe help message
- `./gradlew tasks`
  - observe list of Starts tasks
- `./gradlew help --task startsClean`
  - observe details about the `startsClean` task, including available options
- `./gradlew startsClean`
  - if you create a directory `.starts/` in the root of this project, it should be deleted after this task runs