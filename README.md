POC REST-Assured
POC criada para testes de integração.

Foi utilizado o framework REST assured e a API https://reqres.in/

Pré-requisitos:
Versão Java: OpenJDK 8 e OpenJDK 11 de 64 bits com HotSpot (https://www.oracle.com/java/technologies/javase-jsp.html)

Ferramenta de Construção:

REST Assured para Spring Webflux - biblioteca do framework rest-assured;

Para Maven: usar a dependência <dependency>
                                     <groupId>io.rest-assured</groupId>
                                     <artifactId>spring-web-test-client</artifactId>
                                     <version>4.3.1</version>
                                     <scope>test</scope>
                               </dependency>
Para Gradle: usar a dependência testImplementation 'io.rest-assured:spring-web-test-client:4.3.1'

JsonPath - biblioteca responsável por ler as respostas das mensagens retornadas pela API.

Para Maven: usar a dependência <dependency>
                                     <groupId>io.rest-assured</groupId>
                                     <artifactId>json-path</artifactId>
                                     <version>4.3.1</version>
                                     <scope>test</scope>
                               </dependency>
Para Gradle: usar a dependência testImplementation 'io.rest-assured:json-path:4.3.1'

JSON Schema Validation - Biblioteca responsável por validar se a estrutura da resposta está correta.

Para Maven: usar a dependência <dependency>
                                     <groupId>io.rest-assured</groupId>
                                     <artifactId>json-schema-validator</artifactId>
                                     <version>4.3.1</version>
                                     <scope>test</scope>
                               </dependency>
Para Gradle: usar a dependência testImplementation 'io.rest-assured:json-schema-validator:4.3.1'

Executando o Teste

Em uma API simples de cadastro, fizemos os seguintes testes:

GET de lista de usários - response 200.

GET usuário único  - response 200.

CREATED criamos um usuario - response 201

UPDATE atualizamos um usuario - response 200

DELETE deletamos um usuario - response 201

