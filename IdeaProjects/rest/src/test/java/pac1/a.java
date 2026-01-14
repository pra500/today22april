package pac1;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

public class a {

    @Test
    public void aFTest() {

        given().when().get("https://jsonplaceholder.typicode.com/posts").then()
                .assertThat().statusCode(200)
                .log().all();

        given().when().get("https://jsonplaceholder.typicode.com/posts").then()
                .assertThat().statusCode(200)
                .log().all().body("id", hasItems(3, 4));

        given().when().get("https://jsonplaceholder.typicode.com/posts").then()
                .assertThat().statusCode(200)
                .log().all().body("id", hasItem(5));


        given().when().get("https://jsonplaceholder.typicode.com/posts").then()
                .assertThat().statusCode(200)
                .log().all().body("title", hasItem("sunt aut facere repellat provident occaecati excepturi optio reprehenderit"));


        given().when().get("https://jsonplaceholder.typicode.com/posts").then()
                .assertThat().statusCode(200).log().all();

        given().when().get("https://jsonplaceholder.typicode.com/posts").then()
                .assertThat().statusCode(200).log().all();


        given().when().get("https://jsonplaceholder.typicode.com/posts").then()
                .assertThat().statusCode(200).log().all();

















/*
    @Test
    public void awwxFTest()
    {

        //Response response= RestAssured.given().when().get("https://reqres.in/api/users?page=2");

        Response response= RestAssured.given().when().get("https://jsonplaceholder.typicode.com/posts/1/comments/1");

        System.out.println(response.getBody());
        System.out.println(response.getStatusCode());
        System.out.println(response.getCookies());

    }


   // @Test
    public void aw33wxFTest()
    {
        //Response response= RestAssured.given().when().get("https://reqres.in/api/users?page=2");

        Response response= RestAssured.given().when().get("https://jsonplaceholder.typicode.com/posts/1/comments/1");

        System.out.println(response.getBody());
        System.out.println(response.getStatusCode());
        System.out.println(response.getCookies());

    }


 */

    }
    }