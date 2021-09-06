![example workflow](https://github.com/Mikbac/Repository-search-engine/actions/workflows/maven.yml/badge.svg) [![Build Status](https://travis-ci.org/Mikbac/Repository-search-engine.svg?branch=master)](https://travis-ci.org/Mikbac/Repository-search-engine)

[![Language grade: Java](https://img.shields.io/lgtm/grade/java/g/Mikbac/Repository-search-engine.svg?logo=lgtm&logoWidth=18)](https://lgtm.com/projects/g/Mikbac/Repository-search-engine/context:java) [![Total alerts](https://img.shields.io/lgtm/alerts/g/Mikbac/Repository-search-engine.svg?logo=lgtm&logoWidth=18)](https://lgtm.com/projects/g/Mikbac/Repository-search-engine/alerts/)

![GitHub](https://img.shields.io/github/license/Mikbac/Repository-search-engine)

# Search engine of the last updated user repository.

# Table of contents
* [Installing](#installing)
* [API Endpoint](#api-endpoint)
* [Example](#an-example)
* [Built With](#built-with)

### Installing
1. Build and run the application:
```
mvn install
cd target
java -jar artifact-0.0.1-SNAPSHOT.war
```
or
```
docker build --tag mikbac/searchengine:1.0 -f Dockerfile .
docker container run -p 8080:8080 --ip 0.0.0.0 --name searchengine mikbac/searchengine:1.0
```
2. Open the browser and hit:
```
http://localhost:8080/repository/last-modified/Microsoft
```
or
```
http://localhost:8080/
```
### API Endpoint

|Endpoints|Usage|Params|
|---|---|---|
|GET /repository/last-modified/{organizationName}|return the name of the last modified repositoryModel|{organizationName} - repository owner|

### An example: 
#### ```GET /repository/last-modified/Microsoft```
##### Or open the browser and hit: ```/```

### Built With

* [JDK 8](https://www.oracle.com/technetwork/java/index.html)

* [Spring Boot - 2.3.0.RELEASE](https://spring.io/projects/spring-boot) 

* [Maven](https://maven.apache.org/)

* [Log4j2](https://logging.apache.org/log4j/2.x/)

* [JUnit 4](https://junit.org/junit4/)

* [Swagger 2](https://swagger.io/)

The application uses the [GitHub REST API](https://developer.github.com/v3/). 
