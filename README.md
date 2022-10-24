To test:

1. Clone [starts](https://github.com/benjamin-shen/starts)
2. In `starts/starts-gradle-plugin`, run `./gradlew publishToMavenLocal`
3. Clone starts-test-gradle
4. In `starts-test-gradle`, run Gradle tasks implemented in `starts/starts-gradle-plugin`

Example commands:
- `./gradlew startsHelp`
  - observe help message
- `./gradlew tasks`
  - observe there is a list of Starts tasks
- `./gradlew help --task startsClean`
  - observe details about the task, including available options
- `./gradlew startsClean`
  - if you create a directory `.starts/` in the root of this project, it should be deleted after this task runs