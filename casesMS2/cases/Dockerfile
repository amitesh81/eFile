#Start with base image of Java Runtime Environment
FROM openjdk:17-jdk-slim

# User/Group who maintains the docker image
MAINTAINER amitesh81

# Copy packaged microservice into your image
COPY target/cases-0.0.1-SNAPSHOT.jar cases-0.0.1-SNAPSHOT.jar

#Java Command to run the microservice

ENTRYPOINT ["java", "-jar", "cases-0.0.1-SNAPSHOT.jar"]