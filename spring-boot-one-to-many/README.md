
### One-To-Many Example



#### Creación de DB en container

+ Entramos en mysql dentro de container
+ Ejecutamos scripts con user root (en /home/scripts): mysql -u root -p < (schema.sql | data.sql)
+ Damos permisos a user
+ Entramos desde Spring Boot


#### Comandos útiles

+ docker container prune