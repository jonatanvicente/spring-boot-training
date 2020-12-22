FROM openjdk:8-jre-alpine

ADD ["build/libs/zuul-server-0.0.1-SNAPSHOT.jar", "/opt/spring-boot-today-zuul-server/"]

ENTRYPOINT ["java", "-jar", "/opt/spring-boot-today-zuul-server/zuul-server-0.0.1-SNAPSHOT.jar"]

EXPOSE 7777