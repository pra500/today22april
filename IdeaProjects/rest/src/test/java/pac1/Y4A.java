package pac1;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class Y4A {

    @Test
    public void geTest() {
        // given().when().get("https://api.restful-api.dev/objects")
        //     .then().assertThat().statusCode(200);


        Response response = RestAssured.given().get("https://api.restful-api.dev/objects");
        System.out.println(response.getStatusLine());
        System.out.println(response.getBody().asString());
        System.out.println(response.getStatusCode());


    }


    @Test
    public void geddTest() {
        given().when().get("https://api.restful-api.dev/objects")
                .then().assertThat().statusCode(200);


    }


    @Test
    public void geTeeedTest() {
        given().when().get("https://api.restful-api.dev/objects")
                .then().assertThat().statusCode(200);


    }


    @Test
    public void gdeTest() {
        given().when().get("https://api.restful-api.dev/objects")
                .then().assertThat().statusCode(200);


    }
}

