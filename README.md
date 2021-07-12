#Items APP
## Acceso a DB oracle y PagingAndSortingRepository
Microservicios realizado con Spring Boot, Swagger 2. También se utilizan otras librerías útiles como mapstruct, lombok.
Acede a una DB oracle y usa PagingAndSortingRepository

Microservicio Item

En cuanto al api, se quería realizar el siguiente endpoint:

---

> GET @GetMapping("/items")

Parámetros:

> **orderBy**: Enum (DESCRIPTION/PRICE)
>
> **pageNumber**: String(number)
>
> **sortBy**: Enum (ASCENT/DESCENT)

###Tecnologías
Apache Maven 3.6.3

Java 9

---

###Servicios disponibles
Una vez lanzado el microservicio y teniendo instalado la base de datos oracle se podrá acceder al API accediendo a la siguiente URL:

local: http://localhost:8080/swagger-ui/

---
