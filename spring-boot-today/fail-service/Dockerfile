FROM openjdk:8-jre-alpine

ADD ["build/libs/fail-service-0.0.1-SNAPSHOT.jar", "/opt/spring-boot-today-service-fail/"]

ENTRYPOINT ["java", "-jar", "/opt/spring-boot-today-service-fail/fail-service-0.0.1-SNAPSHOT.jar"]

EXPOSE 7777