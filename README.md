**POC REST-Assured**

POC criada para testes de integração, utilizando o framework REST assured e a API publica https://reqres.in/

**Pré-requisitos:**

Versão Java: OpenJDK 8 e OpenJDK 11 de 64 bits com HotSpot (https://www.oracle.com/java/technologies/javase-jsp.html)

**Ferramenta de Construção:**

REST Assured para Spring Webflux

Gradle:

 testImplementation 'io.rest-assured:spring-web-test-client:4.3.1'
 
 testImplementation 'io.rest-assured:json-path:4.3.1'
 
 testImplementation 'io.rest-assured:json-schema-validator:4.3.1'

**Executando o Teste:**

Em uma API simples de cadastro, fizemos os seguintes testes:

_GET_ de lista de usários - response 200.

_GET_ usuário único  - response 200.

_CREATED_ criamos um usuario - response 201

_UPDATE_ atualizamos um usuario - response 200

_DELETE_ deletamos um usuario - response 201

