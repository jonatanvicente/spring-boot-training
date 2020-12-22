FROM openjdk:8-jre-alpine

ADD ["build/libs/gateway-0.0.1-SNAPSHOT.jar", "/opt/spring-boot-today-service-gateway/"]

ENTRYPOINT ["java", "-jar", "/opt/spring-boot-today-service-gateway/gateway-0.0.1-SNAPSHOT.jar"]

EXPOSE 9999