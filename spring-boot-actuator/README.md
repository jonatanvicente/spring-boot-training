
### Spring Boot Actuator Example

+ Spring Boot includes a number of additional features to help you <b>monitor and manage your application when you push it
 to production</b>. You can choose to manage and monitor your application by using HTTP endpoints or with JMX. Auditing, 
 health, and metrics gathering can also be automatically applied to your application.

+ Habilitado Actuator en application.properties (<b>management.endpoints.web.exposure.include=*</b>, tanto para acceso HTTP 
como JMX (<b>spring.jmx.enabled=true</b>)

+ <b>Endpoints disponibles</b>
    - http<nolink>://localhost:8081/actuator/health> (debe responder {"status":"UP"})
    - http<nolink>://localhost:8081/actuator/auditevents
    - http<nolink>://localhost:8081/actuator/beans
    - http<nolink>://localhost:8081/actuator/conditions
    - http<nolink>://localhost:8081/actuator/configprops
    - http<nolink>://localhost:8081/actuator/env
    - http<nolink>://localhost:8081/actuator/heapdump (genera volcado de heap para descarga)
    - http<nolink>://localhost:8081/actuator/httptrace
    - http<nolink>://localhost:8081/actuator/info
    - http<nolink>://localhost:8081/actuator/loggers
    - http<nolink>://localhost:8081/actuator/metrics
    - http<nolink>://localhost:8081/actuator/mappings
    - http<nolink>://localhost:8081/actuator/scheduledtasks
    - http<nolink>://localhost:8081/actuator/threaddump

Para más info, véase https://docs.spring.io/spring-boot/docs/current/reference/html/production-ready-features.html
