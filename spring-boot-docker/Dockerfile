FROM openjdk:8-jre-alpine

ADD ["build/libs/spring-boot-docker-0.0.1-SNAPSHOT.jar", "/opt/spring-boot-docker/"]

ENTRYPOINT ["java", "-jar", "/opt/spring-boot-docker/spring-boot-docker-0.0.1-SNAPSHOT.jar"]

EXPOSE 7777