# Example of usage for libgdx gradle plugin


## How to use this sample?

```
git clone https://github.com/dwursteisen/libgdx-sample.git
cd libgdx-sample
./gradlew build
```

It will clone / build / download all mandatory dependencies to run.

![Run configuration](/docs/tasks.png)
You will have a new group `libgdx` with specific tasks.

```
./gradlew run # run the game
./gradlew run # create a self runnable jar
```
## IntelliJ

Open the project in intelliJ ( File > Open > build.gradle.kts )

![Run configuration](/docs/run.png)
After IntelliJ finished his works, you should be able a new run configuration.
(If not, just Edit configuration and close: it will then appears)
