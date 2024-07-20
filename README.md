# Project Example Spring WebFlux

### Reference Documentation

For further reference, please consider the following sections:

* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/3.2.4/maven-plugin/reference/html/)
* [Create an OCI image](https://docs.spring.io/spring-boot/docs/3.2.4/maven-plugin/reference/html/#build-image)
* [Spring Reactive Web](https://docs.spring.io/spring-boot/docs/3.2.4/reference/htmlsingle/index.html#web.reactive)

### Guides

Build do projeto

```
mvn clean install
```

Run da aplicação

```
./mvnw spring-boot:run
```

Chamada para a endpoint reativo

```
curl -N "http://localhost:8080/api/heroes"

```