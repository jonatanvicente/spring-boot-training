
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

## Eureka Client

To run this example:
+ Generate Gradle wrapper (parent directory)
+ Execute with command (from parent directory):

```
./gradlew :spring-boot-registry:eureka-client:bootRun
```


## Endpoints

+ <b>Eureka</b> URL / Endpoints available:
    - http://localhost:8761/. <b>Eureka Service console</b>. Se pueden ver servicios registrados
 
+ <b>Client</b> URL / Endpoints available:
    - http://localhost:8080/service-instances/{name} (http://localhost:8080/service-instances/SPRING-CLOUD-EUREKA-CLIENT). 
    Obtención de info obtenida por cliente de endpoints registrados en Eureka. 
    En este caso, se ve el estado de la única registrada (ella misma, SPRING-CLOUD-EUREKA-CLIENT).
    
    <b>Actuator (client status)</b>
    - http://localhost:8080/actuator/health (debe responder {"status":"UP"})
    - http://localhost:8080/actuator/auditevents
    - http://localhost:8080/actuator/beans
    - http://localhost:8080/actuator/conditions
    - http://localhost:8080/actuator/configprops
    - http://localhost:8080/actuator/env
    - http://localhost:8080/actuator/heapdump (genera volcado de heap para descarga)
    - http://localhost:8080/actuator/httptrace
    - http://localhost:8080/actuator/info
    - http://localhost:8080/actuator/loggers
    - http://localhost:8080/actuator/metrics
    - http://localhost:8080/actuator/mappings
    - http://localhost:8080/actuator/scheduledtasks
    - http://localhost:8080/actuator/threaddump    




#### Highlights

+ Al arrancar, el registry intenta replicarse y traza error al no poder registrarse a sí mismo. Eliminamos trazado en 
application.properties.
+ Se pueden ver microservicios registrados en Eureka en http://localhost:8761/
+ ServiceInstanceRestController utiliza DiscoveryClient (Spring Cloud) para acceder al Eureka Server y obtener info de servicios
 registrados desde cliente
+ URL's de Actuator disponibles (JMX y endpoint)
+ Config en application.yml
+ Logs personalizados con logback.xml