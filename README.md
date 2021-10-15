#  BOUNDED CONTEXT SERVICE FOR CARD OPERATIONS

Implementation for card operation service for ddd event storming excercise 

### Pre requisitos

- [Spring Boot 2.5.5](https://spring.io/tools3/sts/all).
- [Maven 3.5.2](https://maven.apache.org/download.cgi).
- [Java 1.17.0](https://www.oracle.com/technetwork/java/javase/downloads/java-archive-javase8-2177648.html).
- [H2 Database](http://www.h2database.com/html/download.html).

### Funcionamiento general

https://spring.io/blog/2018/04/11/event-storming-and-spring-with-a-splash-of-ddd

![alt text](https://i.imgur.com/vBhouxJ.png)


### Modelo de datos

A continuación mostramos los tablas utilizadas en el servicio de auditoria, llamada al microservicio responsable


| Table                     | Description |
| ------------------------- | ----------- |
| `cuenta`      | Tabla para almacenar los movimientos de la cuenta. |


### Api

A continuación mostramos una tabla con los endpoints disponibles del servicio. En el siguiente enlance encontraréis información detallada sobre el api [mdw-auth-bsn](https://wso2.ocs.inet/store/apis/info?name=mdw-auth-bsn&version=1.3.0&provider=admin)

 Endpoint                      | Method | Auth? | Description
 ----------------------------- | ------ | ----- | -----------
 `/retiro`                      | POST   | No    |  WITHDRAW.
 `/limite`                      | POST   | No   |  LIMIT ASSIGNED.
 `/reembolsar`                      | POST   | No   |  MONEY REPAIRED

 
 
### Despliegue

Para un despliegue correcto en los entornos de Openshift, se deberán de configurar las siguientes variables:

* SPRING_PROFILES_ACTIVE    = [des, test, prod]
* GC_MAX_METASPACE_SIZE     = 256
* TZ                        = Europe/Madrid
