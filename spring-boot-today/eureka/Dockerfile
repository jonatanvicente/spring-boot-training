FROM openjdk:8-jre-alpine

ADD ["build/libs/eureka-0.0.1-SNAPSHOT.jar", "/opt/spring-today-eureka/"]

ENTRYPOINT ["java", "-jar", "/opt/spring-today-eureka/eureka-0.0.1-SNAPSHOT.jar"]

EXPOSE 8761