FROM openjdk:8-jdk-alpine
MAINTAINER Jabito Javier <jabito.javier@gmail.com>
VOLUME /tmp
ARG JAR_FILE=build/docker/kotlin_swagger-0.0.1-SNAPSHOT.jar
ADD ${JAR_FILE} kotlin_swag.jar
RUN sh -c 'touch /kotlin_swag.jar'
EXPOSE 8080
CMD java -jar kotlin_swag.jar
