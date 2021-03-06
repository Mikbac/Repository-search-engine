![example workflow](https://github.com/Mikbac/Repository-search-engine/actions/workflows/maven.yml/badge.svg) [![Build Status](https://travis-ci.org/Mikbac/Repository-search-engine.svg?branch=master)](https://travis-ci.org/Mikbac/Repository-search-engine)![GitHub](https://img.shields.io/github/license/Mikbac/Repository-search-engine)

# Search engine of the last updated user repository.

# Table of contents
* [Installing](#installing)
* [API Endpoint](#api-endpoint)
* [Example](#an-example)
* [Built With](#built-with)

### Installing
```
mvn install
```
```
cd target
```
```    
java -jar artifact-0.0.1-SNAPSHOT.war
```
Open the browser and hit 
```
http://localhost:8080//last-modified-repository?organization=Microsoft
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
