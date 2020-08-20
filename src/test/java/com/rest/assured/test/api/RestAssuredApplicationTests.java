package com.rest.assured.test.api;

import net.minidev.json.JSONObject;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;


@SpringBootTest
class RestAssuredApplicationTests {


    @Test
    public void getListUser() {
        given().
                param("page", "2").
        when().
                get("https://reqres.in/api/users?page=2").
        then().
                statusCode(200).
                body("page", equalTo(2)).
                log().all();

    }

    @Test
    public void getSingleUser() {
        given().
                get("https://reqres.in/api/users/2").
        then().
                statusCode(200).
                body("data.id", equalTo(2)).
                log().all();
    }

    @Test
    public void createUserTest() {
        JSONObject requestParams = new JSONObject();
        requestParams.put("name", "Pedro");
        requestParams.put("job", "DevJava");

        given().
                body(requestParams.toJSONString()).
        when().
                post("https://reqres.in/api/users").
        then().
                statusCode(201).
                body(containsString("createdAt")).
                log().all();
    }

    @Test
    public void updateUser() {
        JSONObject requestParams = new JSONObject();
        requestParams.put("name", "Marcelo A.");
        requestParams.put("job", "DevOps/UI");

        given().
                body(requestParams.toJSONString()).
        when().
                put("https://reqres.in/api/users/2").
        then().
                statusCode(200).
                body(containsString("updatedAt")).
                log().all();
    }

    @Test
    public void deleteUser() {
        when().
                delete("https://reqres.in/api/users/2").
        then()
                .statusCode(204).
                log().all();
    }
}
