package todayprac;

import org.checkerframework.framework.qual.DefaultQualifier;

import static io.restassured.RestAssured.*;



import org.hamcrest.Matchers.*;


public class Assertttlkl {

    public static void main(String[] args) {




        given().log().all().
                when().get("https://restful-api.dev/").then().assertThat()
                .statusCode(200).log().all();






    }
}
