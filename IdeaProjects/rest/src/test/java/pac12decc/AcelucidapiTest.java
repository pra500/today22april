package pac12decc;

import io.restassured.http.ContentType;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.get;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.lessThan;


public class AcelucidapiTest {


    @Test
    public void sdfTest()
    {

        given().when().accept(ContentType.HTML);
                get("https://acelucid.com/").then().assertThat().statusCode(200).time(lessThan(3000L));

        given().when().accept(ContentType.TEXT).
                get("https://acelucid.com/about-us").then().assertThat().statusCode(200);
        given().when().get("https://acelucid.com/terms").then().assertThat().statusCode(200);
        given().when().get("https://acelucid.com/hire").then().assertThat().statusCode(200);
        given().when().get("https://acelucid.com/our-work").then().assertThat().statusCode(200)
                .time(lessThan(3000L));


      //  https://acelucid.com/terms

      //  https://acelucid.com/hire
       // https://acelucid.com/our-work




    }

}
