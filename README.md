[![Build Status](https://travis-ci.org/Mikbac/Searcher-last-updated-repository.svg?branch=master)](https://travis-ci.org/Mikbac/Searcher-last-updated-repository)

# Last updated repository

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

### API Endpoint

|Endpoints|Usage|Params|
|---|---|---|
|GET /user/{userName}/repository|return the name of the last modified repository|{userName} - repository owner|

#### An example: ```/user/Allegro/repository```

### Built With

* [JDK 8](https://www.oracle.com/technetwork/java/index.html)

* [Spring Boot](https://spring.io/projects/spring-boot) 

* [Maven](https://maven.apache.org/)

The server uses the [GitHub REST API](https://developer.github.com/v3/) . 
