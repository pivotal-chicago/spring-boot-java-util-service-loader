# Spring Boot java.util.ServiceLoader

Example Spring Boot app using `java.util.ServiceLoader` to dynamically load all [SPI](https://docs.oracle.com/javase/tutorial/ext/basics/spi.html) implementations on the classpath.

* Multi-project Gradle build
  * 1 Spring Boot app
  * 1 SPI project
  * 2 SPI implementation projects

See `app/src/test/java/io/pivotal/chicago/ApplicationTest.java` for `java.util.ServiceLoader` usage.

See `src/main/resources/META-INF/services` in `basic-dictionary` and `extended-dictionary` projects for SPI registration.

## Tests

`./gradlew test` to run all tests