[![Build Status](https://travis-ci.org/Mikbac/Repository-search-engine.svg?branch=master)](https://travis-ci.org/Mikbac/Repository-search-engine)

# Search engine of the last updated user repository.

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
http://localhost:8080/user/Allegro/last-modified-repository
```

### API Endpoint

|Endpoints|Usage|Params|
|---|---|---|
|GET /user/{userName}/last-modified-repository|return the name of the last modified repository|{userName} - repository owner|

### An example: 
#### ```GET /user/Allegro/last-modified-repository```

### Built With

* [JDK 8](https://www.oracle.com/technetwork/java/index.html)

* [Spring Boot](https://spring.io/projects/spring-boot) 

* [Maven](https://maven.apache.org/)

* [HSQLDB](http://hsqldb.org/)

* [JUnit 4](https://junit.org/junit4/)

The server uses the [GitHub REST API](https://developer.github.com/v3/) . 
