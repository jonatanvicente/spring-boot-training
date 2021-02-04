
## Spring Boot Training

Environment:
+ JDK 8 (some later versions of Java not supported yet).


Sample Modules:
- [Spring Boot Initial](spring-boot-initial/README.md)
- [Spring Boot One-To-One](spring-boot-one-to-one/README.md)
- [Spring Boot One-To-Many](spring-boot-one-to-many/README.md)
- [Spring Boot Actuator](spring-boot-actuator/README.md)
- [Spring Boot Gateway](spring-boot-gateway/README.md)
- [Spring Boot Registry](spring-boot-registry/README.md)
- [Spring Boot Routing Filtering](spring-boot-routing-filtering/README.md)
- [Spring Boot Zuul Load Balancing](spring-boot-zuul-load-balancing/README.md)
- [Spring Boot Docker](spring-boot-docker/README.md)
- [Spring Boot Resilience4j](spring-boot-resilience4j/README.md)
- [Spring Boot JWT](spring-boot-jwt/README.md)

Utils:
JacksonMapper (see https://www.baeldung.com/jackson)

Notas TODO:
+ Netflix Ribbon tiene sus días contados (como muchos otros microservicios de Stack Netflix).
+ Spring Cloud ofrece como alternativa el módulo LoadBalancer. Véase https://spring.io/blog/2020/03/25/spring-tips-spring-cloud-loadbalancer
    + Hasta ahora el ejemplo spring-boot-today no hace que funcione bien la gateway. No hace las redirecciones (funcionando con Docker)
    + Necesario modificarla. Embeberle Zuul (añadida annotation) y ponerle load balancing.
+ Otra posibilidad en https://dzone.com/articles/create-an-api-gateway-with-load-balancer-in-java
