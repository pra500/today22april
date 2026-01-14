package pac12decc;

import static io.restassured.RestAssured.given;


public class Getsssd {

    public static void main(String[] args) {

        given().when().get("https://dummy-json.mock.beeceptor.com/todos/1")

                .then().statusCode(200).assertThat();
    }
}
