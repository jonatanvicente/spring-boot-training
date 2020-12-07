
# Spring Boot Gateway

##### Funcionamiento

Se enrutan todas las peticiones a /GET a https<nolink>://httpbin.org/ (mock). Se añade cabecera al enrutar.

To run this example:
+ Generate Gradle wrapper (parent directory)
+ Execute with command (from parent directory):

```
./gradlew :spring-boot-gateway:bootRun
```

+ URL / Endpoints available:
    - http<nolink>://localhost:9999/. Endpoint de API Gateway.
  
#### Highlights

+ Config port 9999 en application.yml
+ En la configuración de ruta añadimos encabezado "Spring" con el valor "Training"
+ Creación de url Fallback en Controller
+ Si ejecutamos 
```
curl http://localhost:9999/get
```
llamando a API Gateway, ésta enruta a https<nolink>://httpbin.org/ (como se describe en el filtro), y se añade cabecera. 
Pasados unos segundos, https<nolink>://httpbin.org/ responde. Response:
```
{
  "args": {}, 
  "headers": {
    "Accept": "*/*", 
    "Content-Length": "0", 
    "Forwarded": "proto=http;host=\"localhost:9999\";for=\"0:0:0:0:0:0:0:1%0:42996\"", 
    "Hello": "World", 
    "Host": "httpbin.org", 
    "User-Agent": "curl/7.71.1", 
    "X-Amzn-Trace-Id": "Root=1-5fce71af-535dd7f342950cab7edd0539", 
    "X-Forwarded-Host": "localhost:9999"
  }, 
  "origin": "0:0:0:0:0:0:0:1%0, 90.74.235.140", 
  "url": "http://localhost:9999/get"
}
```
+ Si forzamos una demora en la petición al host (pasando por Gateway), salta el FallbackUri añadido en los filtros de 
ruta (circuit breaker). Al ejecutar
```
curl --dump-header - --header 'Host: www.hystrix.com' http://localhost:9999/delay/3
```
el resultado es:
```
HTTP/1.1 200 OK
Content-Type: text/plain;charset=UTF-8
Content-Length: 8

fallback
```


