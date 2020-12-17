package com.springbootgateway;

import reactor.core.publisher.Mono;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class Application {

    final String httpUri = "http://httpbin.org:80";//stub
    //final String httpUri = "http://localhost:7777";//apuntando a otro microservicio del proyecto...

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    /**
     * Añadimos dos filtros:
     *  - /get. Todas las peticiones irán a httpUri (http://httpbin.org:80), y se les añade encabezado
     *  - host hystrix.com (circuit breaker con Hystrix Command): ya que la API invocada puede tardar mucho en responder,
     *    añadimos filtro simple Hystrix. Añadimos fallbackUri si hay demora de tiempo.
     *
     *    Puede probarse la demora ejecutando una petición a hystrix.com (pagina test de la librería)
     *    con curl --dump-header - --header 'Host: www.hystrix.com' http://localhost:8080/delay/3 (petición al host
     *    indicado con segundos de demora).
     *    Al haber una url de fallo, el resultado es:
     *          HTTP/1.1 200 OK
     *          Content-Type: text/plain;charset=UTF-8
     *          Content-Length: 8
     *
     *          fallback
     * @param builder
     * @return
     */
    @Bean
    public RouteLocator myRoutes(RouteLocatorBuilder builder) {

        return builder.routes()
                .route(p -> p
                        //.path("/v1/*")
                        .path("/get")
                        .filters(f -> f.addRequestHeader("Spring", "Training"))
                        .uri(httpUri))
                .route(p -> p
                        .host("*.hystrix.com") //SIEMPRE que el anfitrión (host) sea hystrix.com, enrutaremos a httpUri
                        .filters(f -> f.hystrix(config -> config //y envolveremos esa solicitud en un HystrixCommand
                                       .setName("mycmd")
                                       .setFallbackUri("forward:/fallback")))//proveemos una respuesta en caso de timeout
                        .uri(httpUri))
                .build();
    }

}

