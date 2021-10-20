# android-boilerplate
This is a boilerplate project for android app.

### Get Started
Clone the repo and open project in Android Studio. Project is using [productFlavors](https://developer.android.com/studio/build/build-variants.html) for handling development and production builds. See **app/build.gradle** file for more detail. Before compile and run the build select your desire product flavour from **Build Variants** section.

### Architecture

Project follows [MVVM](https://developer.android.com/topic/libraries/architecture/viewmodel) architecture. Complement of the architecture is Dagger2-based dependency injection and also used coroutine and coroutine flow. Also package-by-feature name was used for project structure. All project code is written in Kotlin and Java, using standard Kotlin and Java coding conventions.

<img alt="screenshot" src="./mvvm_daigram.png" width="100%" />

## Git Conventions

### Commits

Commit Messages should be clear, concise and descriptive of the purpose of the commit. The commit body may be used to provide more detailed information such as links to user stories or explanation of the decision making process which led to the solution.

#### Standard Guidelines for Git Commits
(borrowed from Chris Beams)

* Separate subject from body with a blank line
* Limit the subject line to 50 characters
* Capitalize the subject line
* Do not end the subject line with a period
* Use the imperative mood in the subject line (e.g., "fix" instead of "fixed" or "fixing")
* Wrap the body at 72 characters
* Use the body to explain what and why vs. how

### Branching Model

* We are following [gitflow](https://nvie.com/posts/a-successful-git-branching-model/) branching model

* There is only one main branch, and that is master

* All other branches (feature, release, hot-fix, etc.) are temporary and might be removed once they have been merged with master


## Libraries

* [Hilt](https://developer.android.com/training/dependency-injection/hilt-android) Hilt is a dependency injection library for Android that reduces the boilerplate of doing manual dependency injection in your project.
* [Material Components](https://material.io/develop/android/) Google offical material design library for Android.
* [RetroFit](https://square.github.io/retrofit/) - A type-safe HTTP client for Android and Java
* [Room](https://developer.android.com/topic/libraries/architecture/room?gclid=CjwKCAjwo9rtBRAdEiwA_WXcFl0dpqQ4MlZAP9cW7a1tVxWgc2sy3eq5sn26_KpG8dAoRf9G3y1nmBoCmIQQAvD_BwE) - The Room persistence library provides an abstraction layer over SQLite to allow for more robust database access while harnessing the full power of SQLite.
* [Coroutine](https://kotlinlang.org/docs/reference/coroutines/coroutines-guide.html) Handle Threads and Asyn Jobs with concise syntax.

## Current Requirements

New updated version of Android Studio, Android SDK and Gradle.

