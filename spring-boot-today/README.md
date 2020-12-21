
+ Portainer:
    - http:<nolink>//localhost:9500. User admin / K99ARjL5vFvpW7Ba

#### Highlights

+ Fijado timeout de la Gateway en config. Si fijamos redirección a /todayJsonDelayed de today-service, saltará timeout de Gateway antes.
+ Soluciones implementadas en Gateway
    - Ruta path_today_simple (evita respuesta NO Json redireccionando a URL de otro microservicio)
    - Ruta path_json_parameterized (fijamos response a forbidden)
    - Ruta retry_test (intentos de reconectar al recibir un 502 llamando a back, hasta finalmente mostrar el estado)
    - Hystrix no soporta redirect. Todos los forward habrán de ser en el mismo host.
     