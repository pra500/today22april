package py;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.json.JSONObject;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class Get {






    @Test
    public void getTest() {

        given().when().get("https://jsonplaceholder.typicode.com/posts").then().assertThat().statusCode(200);

        Response response = RestAssured.given().when().get("https://jsonplaceholder.typicode.com/posts");
        System.out.println(response.getBody().asString());

    }


    @Test
    public void postTest() {

        //   https://jsonplaceholder.typicode.com/posts


        JSONObject jo = new JSONObject();
        jo.put("title", "Test222");
        jo.put("body", "Hello1111");
        jo.put("userId", 1);


        given().body(jo.toString()).when().post("https://jsonplaceholder.typicode.com/posts").then().assertThat()
                .statusCode(201);


    }
}
