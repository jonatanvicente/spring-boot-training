
# Spring Boot Zuul Load Balancing


##### Funcionamiento



Arrancamos eurekca


```
./gradlew :spring-boot-zuul-load-balancing:eureka-service:bootRun
```
Arrancamos Zuul
```
./gradlew :spring-boot-zuul-load-balancing:zuul-server:bootRun
```

Vemos registro en localhost:8761 -> vemos Zuul (registrado)


Arrancamos client

```
./gradlew :spring-boot-zuul-load-balancing:eureka-client:bootRun
```

VEmos ambas registradas en Eureka (zuul y client)

http://localhost:8761/



#### Endpoints



#### Highlights

