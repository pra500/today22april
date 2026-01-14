package pac12dec;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

public class ApiValidation {


    @Test
    public void ffTest()
    {
        given().when().get("https://dummy-json.mock.beeceptor.com/posts")
                .then().assertThat().statusCode(200)
                .body("", hasSize(10));






    }

}
