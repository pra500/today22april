package pac12decc;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;


public class Trdr {

    @Test
    public void TrdrTest(){
        given().when().get("https://dummy-json.mock.beeceptor.com/todos/1").then().statusCode(200).log().all();
    }
}
