package pac1;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

public class Autheeeee {

    @Test
    public void AuthefdfdTest() throws InterruptedException {

        given().when().get("https://api.restful-api.dev/objects")
                .then().assertThat().statusCode(200)
                .body("[1].id", equalTo("2"));



        given().when().get("https://api.restful-api.dev/objects")
                .then().assertThat().statusCode(200)
                .body("[1].name", notNullValue());




        given().when().get("https://api.restful-api.dev/objects")
                .then().assertThat().statusCode(200)
                .body("[2].data.color", containsString("Cloudy White"));




    }
}
