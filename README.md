# OpenRewrite vs Lombok

Minimal demo example of OpenRewrite's parsing issues when
dealing with Lombok's `@SuperBuilder` & `@Builder.Default`

Demonstrator class - `org.example.Test`.

## Demo

1. ` ./gradlew rewriteDryRun`
2. > There were problems parsing src/main/java/org/example/Test.java

Related Java exception is shown by - ` ./gradlew rewriteDryRun --debug`
