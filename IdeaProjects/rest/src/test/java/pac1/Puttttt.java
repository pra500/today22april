package pac1;

import io.restassured.http.ContentType;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

public class Puttttt {

    @Test
    public void puttttDDTest()
    {


given().header("Content-Type","application/json")
        .accept(ContentType.JSON).when().put("https://jsonplaceholder.typicode.com/posts/1")
        .then().statusCode(anyOf(is(200), is(201)));


    }
}
