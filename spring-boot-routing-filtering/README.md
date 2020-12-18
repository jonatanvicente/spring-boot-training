
# Spring Boot Routing Filtering


##### Funcionamiento

Se puede apreciar el enrutamiento correcto al microservicio pasando por Gateway, añadiendo filtro.

#### Book Service

Microservicio de libros a la venta.

To run this example:
+ Generate Gradle wrapper (parent directory)
+ Execute with command (from parent directory):

```
./gradlew :spring-boot-routing-filtering:book:bootRun
```

#### Gateway (Edge Service - Zuul Filtering)

To run this example:

```
./gradlew :spring-boot-routing-filtering:gateway:bootRun
```

#### Endpoints

+ URL / Endpoints available:
    - <b>Books microservice</b>:
        - http<nolink>://localhost:8090/available.
        - http<nolink>://localhost:8090/checked-out.
    - <b>Gateway</b>:
        - http<nolink>://localhost:8080/books/available.
        - http<nolink>://localhost:8080/books/checked-out.

#### Highlights

+ <b>Spring Cloud Netflix incluye un Zuul Proxy</b> que podemos habilitar con @EnableZuulProxy (gateway/App). Esto convertirá
Gateway en un proxy inverso que reenvia llamadas a otros servicios.
    -   Será necesario indicar a Zuul las rutas a observar y adónde reenviar las requests. Especificamos rutas estableciendo
        propiedades en zuul.routes. Cada uno de nuestros microservicios puede tener una entrada en zuul.routes.NAME, 
        donde NAME es el nombre de la aplicación (tal como se almacena en la propiedad spring.application.name).
    -   Spring Cloud Zuul establece automáticamente la ruta al nombre de la aplicación.
    -   Spring Cloud Netflix Zuul usa Ribbon para client-side load balancing. Configuramos ribbon a false para omitir el
        descubrimiento de servicios. Especificamos la url para el servicio de libros (al no usar Eureka para buscar
        servicios).

+ <b>Filter</b>. Filtros standard Zuul (véase filters.pre.SimpleFilter):
    - pre. Antes de enrutar
    - route. Enrutamiento actual
    - post. Tras enrutar
    - error. Si se produce en el manejo de la request        

+ Filtros pueden parametrizarse para ejecución. El método run() contiene la funcionalidad del filtro, en este caso para
acceder a información de estado (HttpServletRequest), y log de la petición (p.ej). Añadiremos referencia al filtro en 
App de arranque.