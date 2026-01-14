package pac1;

import static io.restassured.RestAssured.given;

import static org.hamcrest.Matchers.*;

public class Sdddff {

    public static void main(String[] args) {

        given().when().get("https://api.restful-api.dev/objects?id=3&id=5&id=10")
                .then().assertThat().statusCode(200).body("[0].name"
                        , containsString("Apple iPhone 12 Pro Max"));






    }
}
