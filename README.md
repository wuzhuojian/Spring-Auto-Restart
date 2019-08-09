# Auto Restart and LiveReload

An example Spring Boot application with DevTools auto server restart.

## Get started locally

Ensure you have [JDK 12](https://www.oracle.com/technetwork/java/javase/downloads/jdk12-downloads-5295953.html) installed, then:

```bash
# Clone repository.
$ git clone
# Run application
$ mvn spring-boot:run
# Restart server
Ctrl+F9
```

### [Automatic Restart](https://docs.spring.io/spring-boot/docs/current/reference/htmlsingle/#using-boot-devtools-restart)

As DevTools monitors classpath resources, the only way to trigger a restart is to update the classpath. The way in which you cause the classpath to be updated depends on the IDE that you are using. In Eclipse, saving a modified file causes the classpath to be updated and triggers a restart. In IntelliJ IDEA, building the project (Build -> Build Project) has the same effect.

