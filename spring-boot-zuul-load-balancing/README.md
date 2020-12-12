
# Spring Boot Zuul Load Balancing

Demo de balanceo de carga con Eureka y Zuul - Ribbon.
Las peticiones son ejecutadas a Zuul, que enruta las peticiones mediante el registro efectuado en Eureka.

##### Funcionamiento

<b>Zuul</b> es un servidor que funciona como API Gateway / Edge Service siendo el punto de entrada.
Cuando Zuul recibe una request, toma una de las ubicaciones físicas disponibles y envía la request a la instancia disponible.
El almacenamiento en caché de la localización de las instancias y el reenvío de la request a la ubicación real se proporciona
de inmediato sin necesidad de ninguna otra configuración.
Internamente, Zuul utiliza <b>Ribbon</b> para buscar todas las instancias del servicio desde Eureka.

Procedimiento del ejemplo:
+ Arrancamos Eureka (http://localhost:8761)
```
./gradlew :spring-boot-zuul-load-balancing:eureka-service:bootRun
```
+ Arrancamos Zuul Server (http://localhost:8762)
```
./gradlew :spring-boot-zuul-load-balancing:zuul-server:bootRun
```
+ Podemos ver el registro de Zuul en Eureka
+ Arrancamos eureka-client
```
./gradlew :spring-boot-zuul-load-balancing:eureka-client:bootRun
```
+ Ahora podemos ver registradas en Eureka tanto Zuul Server como Eureka Client
+ Podemos invocar al microservicio a través de Zuul (http://localhost:8762/spring-cloud-eureka-client/greeting)
+ Para probar el balanceo de carga, arrancamos varias instancias:
    + Modificamos application.yml en eureka-client cada vez que arrancamos
+ Ahora, al invocar al microservicio a través de Zuul en varias ventanas del navegador (misma URL, o refrescando el navegador), 
podemos ver sucesivos trazados según el puerto de la instancia que lo atiende (balanceado por Zuul).
    + Zuul traza en el server cada vez que resuelve 'eureka endpoints'
    + Cada una de las instancias de eureka-client traza en server la request recibida por Zuul

#### Endpoints

+ Eureka Registry. http://localhost:8761
+ Zuul Server. http://localhost:8762
+ Invocación del servicio a través de Zuul. http://localhost:8762/spring-cloud-eureka-client/greeting

#### Highlights
+ Config eureka-client en application.yml
+ Trazado de eureka-client/Controller accediendo a propiedades
+ Config Zuul en zuul-server/ZuulConfig
+ Tanto eureka-client como zuul-server fijan en properties URL de Eureka Server

