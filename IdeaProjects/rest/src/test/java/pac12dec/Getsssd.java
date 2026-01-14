package pac12dec;

import static io.restassured.RestAssured.*;


public class Getsssd {

    public static void main(String[] args) {

        given().when().get("https://dummy-json.mock.beeceptor.com/todos/1")

                .then().statusCode(200).assertThat();
    }
}
