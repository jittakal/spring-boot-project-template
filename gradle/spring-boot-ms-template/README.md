# Overview

Sample Spring Boot micro-services project using gradle build tool.

## Quick Commands

```
$ gradle build

$ gradle :spring-boot-ms-template-application:bootRun

$ curl http://127.0.0.1:8080/v1/hello
```

```
# Build docker image
$ set DOCKER_USER_NAME=jittakal

$ gradle :spring-boot-ms-template-application:bootBuildImage
```