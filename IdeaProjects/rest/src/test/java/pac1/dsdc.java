package pac1;

import org.json.JSONObject;
import org.openqa.selenium.json.Json;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import  static org.hamcrest.Matchers.*;



public class dsdc {

//
//    {
//        "userId": 1,
//            "id": 1,
//            "title": "Introduction to Artificial Intelligence",
//            "body": "Learn the basics of Artificial Intelligence and its applications in various industries.",
//            "link": "https://example.com/article1",
//            "comment_count": 8
//    },
//



    @Test
    public void geete()
    {

        given().
                when().get("https://dummy-json.mock.beeceptor.com/posts").then().assertThat().statusCode(200);


        }




}
