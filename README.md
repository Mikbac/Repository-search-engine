
# Search engine of the last updated user repositoryModel.

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
http://localhost:8080/organizationModel/Allegro/last-modified-repositoryModel
```

### API Endpoint

|Endpoints|Usage|Params|
|---|---|---|
|GET /organizationModel/{organizationName}/last-modified-repositoryModel|return the name of the last modified repositoryModel|{organizationName} - repositoryModel owner|

### An example: 
#### ```GET /organizationModel/Allegro/last-modified-repositoryModel```

### Built With

* [JDK 8](https://www.oracle.com/technetwork/java/index.html)

* [Spring Boot](https://spring.io/projects/spring-boot) 

* [Maven](https://maven.apache.org/)

* [HSQLDB](http://hsqldb.org/)

* [JUnit 4](https://junit.org/junit4/)

* [Swagger 2](https://swagger.io/)

The server uses the [GitHub REST API](https://developer.github.com/v3/). 
