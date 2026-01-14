package pac12decc;

import static io.restassured.RestAssured.given;

public class Gedddd {

    public static void main(String[] args) {


        given().when().get("https://dummy-json.mock.beeceptor.com/posts").then().assertThat().statusCode(200).and().contentType("application/json");
    }
}
