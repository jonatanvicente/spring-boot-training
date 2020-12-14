FROM openjdk:8-jre-alpine

ADD ["build/libs/spring-boot-today-0.0.1-SNAPSHOT.jar", "/opt/spring-boot-today/"]

ENTRYPOINT ["java", "-jar", "/opt/spring-boot-today/spring-boot-today-0.0.1-SNAPSHOT.jar"]

EXPOSE 7777