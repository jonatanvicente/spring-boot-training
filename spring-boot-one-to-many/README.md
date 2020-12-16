
### One-To-Many Example

#### Creación de DB en container

+ Entramos en mysql dentro de container
+ Ejecutamos scripts con user root (en /home/scripts): mysql -u root -p < (schema.sql | data.sql)
+ Damos permisos a user
+ Entramos desde Spring Boot


#### Comandos útiles
    
+ docker container prune
+ docker-compose up [nombreServicio]. Levanta un sólo servicio de docker-compose.yml


#### Highlights
+ Relación unidireccional one-to-many Airport-Flights (departures de cada airport y filtrado por airport) unidireccional


### TO-DO
* Pte asignar un user NO root a DB (application.properties)