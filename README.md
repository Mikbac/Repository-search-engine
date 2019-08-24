# Search engine of the last updated user repository.

# Table of contents
* [Installing](#nstalling)
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
|GET /last-modified-repository?organization={organizationName}|return the name of the last modified repositoryModel|{organizationName} - repositoryModel owner|

### An example: 
#### ```GET /last-modified-repository?organization=Microsoft```

### Built With

* [JDK 8](https://www.oracle.com/technetwork/java/index.html)

* [Spring Boot](https://spring.io/projects/spring-boot) 

* [Maven](https://maven.apache.org/)

* [Log4j2](https://logging.apache.org/log4j/2.x/)

* [JUnit 4](https://junit.org/junit4/)

* [Swagger 2](https://swagger.io/)

The server uses the [GitHub REST API](https://developer.github.com/v3/). 
