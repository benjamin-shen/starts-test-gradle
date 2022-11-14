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
- `./gradlew starts`, followed by `./gradlew startsClean`
  - if there are artifacts in `.starts/`, it should be deleted after this task runs
- `./gradlew starts`, followed by code changes, followed by `./gradlew startsDiff`
  - shows the changed classes

Core functionality of STARTS:
1. Run `./gradlew startsClean` if there are any leftover artifacts 
2. Run `./gradlew starts` and make sure all tests were run 
3. Run `./gradlew starts` again and make sure no tests were run 
4. Change something in the code that will affect a dependent test 
5. Run `./gradlew starts` again and make sure the test was run
