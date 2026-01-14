package pac12dec;

import static io.restassured.RestAssured.*;

public class ddee {

    public static void main(String[] args) {


        given().when().get("https://opensource-demo.orangehrmlive.com/web/dist/img/blob.svg")
                .then().assertThat().statusCode(200);
    }
}
