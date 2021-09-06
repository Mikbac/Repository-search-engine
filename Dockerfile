FROM maven:3.8.2-openjdk-11-slim as builder

WORKDIR /app
COPY pom.xml ./
COPY src ./src/

RUN mvn package -DskipTests

FROM adoptopenjdk/openjdk11:jdk-11.0.12_7-alpine-slim

COPY --from=builder /app/target/searchengine-*.war /searchengine.war

CMD ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/searchengine.war"]