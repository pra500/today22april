package pac222;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.openqa.selenium.interactions.SourceType;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

public class ddcd3 {


     @Test
    public void testxvTest(){

//
//
//         given().when().get("https://fake-json-api.mock.beeceptor.com/users").
//                 then().assertThat().statusCode(200).body(
//                         "[0].id", equalTo(1), "", hasSize(10), "id", hasItems(1, 6));



         Response response= RestAssured.given().when().get("https://jsonplaceholder.typicode.com/posts/6");
         System.out.println(response.getBody().asString());
         System.out.println(response.getStatusCode());








     }
}
