package pac1;

import static io.restassured.RestAssured.given;
import static org.assertj.core.api.BDDAssertions.then;
import static org.hamcrest.Matchers.*;

public class Gereeeet {

    public static void main(String[] args) {

        given().when().get("https://api.restful-api.dev/objects/9").then()
                .assertThat().statusCode(200).body("id", equalTo("9"));


    }


}
