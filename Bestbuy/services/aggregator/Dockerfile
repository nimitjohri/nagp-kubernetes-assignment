FROM openjdk:8-jdk-alpine

LABEL maintainer="nimit.johri@nagarro.com"

ADD target/aggregator-0.0.1-SNAPSHOT.jar app.jar

EXPOSE 8060

ENTRYPOINT ["java", "-jar","app.jar"]