

### Docker Example

#### Funcionamiento

Microservicio igual que el del ejemplo spring-boot-initial, pero ejecutándose dentro de un container.


#### Proceso de creación y arranque del contenedor

+ Inicio de Docker daemon
```
sudo systemctl start docker
```
+ Build del proyecto (código del microservicio)
```
./gradlew :spring-boot-docker:build
```
+ Construcción de la imagen (en directorio con Dockerfile)
```
docker build --tag=spring-boot-training .
```
+ Arranque del container con comando docker (docker run -it -p [host_port]:[container_port]  [nombreImagen])
```
docker run -it -p 7777:8080 spring-boot-training
```
+ Arranque con docker-compose
```
docker-compose up
```

+ Endpoints available (dockerPort:7777 - springBootPort:8090):
    - GET http://[IP]:[PORT]/springbootdocker/v1/test
    - GET http://[IP]:[PORT]/springbootdocker/v1/user/{name}/{surname}/{gender}

+ Swagger endpoints:
    - http:<nolink>//localhost:[PORT]/springbootdocker/swagger-ui.html
    - http:<nolink>//localhost:[PORT]/v2/api-docs
    - http:<nolink>//localhost:[PORT]/swagger-resources/
    - http:<nolink>//localhost:[PORT]/springbootdocker/swagger-resources/configuration/ui


#### Highlights

+ Files Dockerfile y docker-compose.yml
+ Mapeo de puertos host/container
+ Configuración en application.properties con cambio de puerto del server y context-path
+ Utilización de Swagger UI

#### Comandos Docker útiles

+ docker images ls
+ docker ps -all
+ docker run hello-world (test de instalacion)
+ docker container ls
+ docker build --tag=[myTag] .
+ docker stop [containerId]
+ docker exec -it [containerId] /bin/bash
+ docker-compose up
+ docker run -it -p [host_port]:[container_port]  [nombreImagen]

