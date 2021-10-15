#  BOUNDED CONTEXT IMPLEMENTATIONS FOR CARD OPERATIONS

Implementation for card operation service for ddd event storming exercise 

https://spring.io/blog/2018/04/11/event-storming-and-spring-with-a-splash-of-ddd

### Pre requisites

- [Spring Boot 2.5.5](https://spring.io/tools3/sts/all).
- [Maven 3.5.2](https://maven.apache.org/download.cgi).
- [Java 1.17.0](https://www.oracle.com/technetwork/java/javase/downloads/java-archive-javase8-2177648.html).
- [H2 Database](http://www.h2database.com/html/download.html).

### Functionaries 

![alt text](https://i.imgur.com/vBhouxJ.png)


### Data

Tables


| Table                     | Description |
| ------------------------- | ----------- |
| `cuenta`      | Tabla para almacenar los movimientos de la cuenta. |


### Api

Apis

 Endpoint                      | Method | Auth? | Description
 ----------------------------- | ------ | ----- | -----------
 `/retiro`                      | POST   | No    |  WITHDRAW.
 `/limite`                      | POST   | No   |  LIMIT ASSIGNED.
 `/reembolsar`                      | POST   | No   |  MONEY REPAIRED

 
 
### Deployment

* SPRING_PROFILES_ACTIVE    = [des, test, prod]
* GC_MAX_METASPACE_SIZE     = 256
* TZ                        = Europe/Madrid
