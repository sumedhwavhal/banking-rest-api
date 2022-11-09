FROM openjdk:17-jdk-alpine
COPY target/banking-rest-api-0.0.1-SNAPSHOT.jar banking-rest-api-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/banking-rest-api-0.0.1-SNAPSHOT.jar"]