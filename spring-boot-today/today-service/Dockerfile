FROM openjdk:8-jre-alpine

ADD ["build/libs/today-service-0.0.1-SNAPSHOT.jar", "/opt/spring-boot-today-service/"]

ENTRYPOINT ["java", "-jar", "/opt/spring-boot-today-service/today-service-0.0.1-SNAPSHOT.jar"]

EXPOSE 7777