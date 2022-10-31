To test:

1. Clone [benjamin-shen/starts](https://github.com/benjamin-shen/starts)
2. Run `git checkout starts-gradle-plugin`
3. Run `mvn clean install` in the root directory
4. Run `cd starts-gradle-plugin` and then `./gradlew publishToMavenLocal`
5. Clone benjamin-shen/starts-test-gradle (this repo)
6. Try out the Gradle tasks implemented in `starts/starts-gradle-plugin`

Example commands:
- `./gradlew startsHelp`
  - observe help message
- `./gradlew tasks`
  - observe list of Starts tasks
- `./gradlew help --task startsClean`
  - observe details about the `startsClean` task, including available options
- `./gradlew startsClean`
  - if you create a directory `.starts/` in the root of this project, it should be deleted after this task runs
