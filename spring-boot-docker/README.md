

### Docker Example

#### Funcionamiento

Microservicio igual que el del ejemplo spring-boot-initial, pero ejecutándose dentro de un container.
Contiene además varios contenedores de ejemplo.
Para levantar el ejemplo, basta ejecutar (con parámetro -d daemon):
```
docker-compose up
```
Al iniciarlo, es posible detectar:
+ 4 Containers creados (docker container ls)
+ Entrar a bash de container Spring Boot
+ Conectar por línea de comandos a mysql (o bien usando Adminer). Es posible acceder también al server por cmd
+ Acceder a Portainer y visualizar el estado de todos los contenedores (creado con password K99ARjL5vFvpW7Ba)

#### Proceso de creación y arranque del contenedor Spring Boot

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

+ Portainer:
    - http:<nolink>//localhost:9500. User admin / K99ARjL5vFvpW7Ba
    
+ Adminer:
    - http:<nolink>//localhost:9090     

#### Highlights

+ docker-compose.yml (diversas imágenes)
    + Mapeo de puertos host/container en cada imagen
    + Mapeo de volumes
    + Gestión de credenciales mysql
    + Environment Java
+ Dockerfile
    + Inyección de ejecutable del microservicio
    + Entry Point e imagen base
+ Configuración en application.properties con cambio de puerto del server y context-path
+ Utilización de Swagger UI y endpoints disponibles


#### Comandos mysql útiles

+ mysql -h 127.0.0.1 -P 3307 -u root -p
+ mysql -h 127.0.0.1 -P 3307 -u admin -p

#### Comandos Docker útiles

+ docker images ls
+ docker ps -all
+ docker run hello-world (test de instalacion)
+ docker container ls
+ docker build --tag=[myTag] .
+ docker stop [containerId]
+ docker exec -it [containerId] bash (o bien /bin/bash o /bin/sh)
+ docker-compose up
+ docker run -it -p [host_port]:[container_port]  [nombreImagen]

