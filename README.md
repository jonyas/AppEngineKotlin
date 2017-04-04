# AppEngineKotlin
Example project setup for [Google App Engine](https://cloud.google.com/appengine/docs/) standard environment that uses [Google cloud endpoints](https://cloud.google.com/endpoints/), [Dagger2](https://github.com/google/dagger), [Kotlin](https://kotlinlang.org/) and Gradle

## System requirements

You need to have JDK8 installed.

## How to run?

- Clone project
- Inside project folder run ```./gradlew appengineRun``` More Gradle plugin [commands](https://github.com/GoogleCloudPlatform/gradle-appengine-plugin)
- Wait project to build
- Open in browser [http://localhost:8080/_ah/api/kotlin/v1/greetings/me](http://localhost:8080/_ah/api/kotlin/v1/greetings/me)
