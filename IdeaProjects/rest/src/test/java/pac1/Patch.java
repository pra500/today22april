package pac1;

import io.qameta.allure.testng.TestInstanceParameter;
import io.restassured.http.ContentType;
import org.json.JSONObject;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;



public class Patch {

    @Test
    public void patchcallTest()
    {
        JSONObject  jsonObject = new JSONObject();
        jsonObject.put("userId", 1);
        jsonObject.put("id", 1);
        jsonObject.put("title", "fd");
        jsonObject.put("body", "dfvffb");


        given().header("Content-Type", "application/json").accept(ContentType.JSON).body(jsonObject.toString())
                .when().patch("https://jsonplaceholder.typicode.com/posts/1").then().assertThat().statusCode(anyOf(is(200), is(201)))
        .body("userId", equalTo(1));


    }
}

