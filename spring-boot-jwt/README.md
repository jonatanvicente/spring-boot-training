
# Spring Boot JWT

Ejemplo de autenticación JWT

##### Funcionamiento
+ Invocar http://localhost:8080/authenticate con las credenciales
```
{
	"username":"remoteUser",
	"password":"password"
}
```

+ Anexar JWT como Bearer en http://localhost:8080/request

## Endpoints

+ http://localhost:8080/authenticate
+ http://localhost:8080/request 


#### Highlights

+ Collection Postman disponible en directorio postman
+ Config JWT
+ Filtros de autenticación JWT