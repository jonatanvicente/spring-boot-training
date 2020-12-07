
# Spring Boot Registry - Eureka

Ejecutar 1º eureka-service y después eureka-client.

##### Funcionamiento
Al iniciar <b>eureka-service</b> se inicia el Registry. Al arrancar <b>eureka-client</b>, el microservicio se registra,
tal como lo muestra la consola de Eureka Service (con General Info, Instance Info, etc).
Client-side service discovery allows services to find and communicate with each other without hard-coding hostname and port.
El único 'fixed point' (punto fijo) es el registry donde cada servicio se registra.
Al utilizar Neflix Eureka:
+ Cada cliente obtiene una lista de pares conectados al registry y realiza las peticiones a otros servicios sobre un
algoritmo de balanceo de carga.

## Eureka Service

To run this example:
+ Generate Gradle wrapper (parent directory)
+ Execute with command (from parent directory):

```
./gradlew :spring-boot-registry:eureka-service:bootRun
```

+ URL / Endpoints available:
    - http<nolink>://localhost:8761/. <b>Eureka Service console</b>.
    
#### Highlights

+ Al arrancar, el registry intenta replicarse y traza error al no poder registrarse a sí mismo. Eliminamos trazado en 
application.properties.
+ Se pueden ver microservicios registrados en http<nolink>://localhost:8761/


## Eureka Client

To run this example:
+ Generate Gradle wrapper (parent directory)
+ Execute with command (from parent directory):

```
./gradlew :spring-boot-registry:eureka-client:bootRun
```

+ URL / Endpoints available:
    - http:<nolink>//localhost:8080/service-instances/{name} (http:<nolink>//localhost:8080/service-instances/A-BOOTIFUL-CLIENT). 
    Estado de la app registrada en Eureka. En este caso, se ve el estado de la única registrada (A-BOOTIFUL-CLIENT).
    
    <b>Actuator (client status)</b>
    - http<nolink>://localhost:8080/actuator/health> (debe responder {"status":"UP"})
    - http<nolink>://localhost:8080/actuator/auditevents
    - http<nolink>://localhost:8080/actuator/beans
    - http<nolink>://localhost:8080/actuator/conditions
    - http<nolink>://localhost:8080/actuator/configprops
    - http<nolink>://localhost:8080/actuator/env
    - http<nolink>://localhost:8080/actuator/heapdump (genera volcado de heap para descarga)
    - http<nolink>://localhost:8080/actuator/httptrace
    - http<nolink>://localhost:8080/actuator/info
    - http<nolink>://localhost:8080/actuator/loggers
    - http<nolink>://localhost:8080/actuator/metrics
    - http<nolink>://localhost:8080/actuator/mappings
    - http<nolink>://localhost:8080/actuator/scheduledtasks
    - http<nolink>://localhost:8080/actuator/threaddump    
    
#### Highlights

+ Nombre de la app definido en resources/bootstrap.properties
+ ServiceInstanceRestController utiliza DiscoveryClient (Spring Cloud) para acceder al Eureka Server y revisar servicios
 registrados 
+ URL's de Actuator disponibles