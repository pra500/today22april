package pac12decc;

import io.restassured.http.ContentType;
import org.json.JSONObject;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.anyOf;
import static org.hamcrest.Matchers.is;



public class PatchTest {

    @Test(priority = 1)
    public void patchhhhTest()
    {

        JSONObject jsonObject = new JSONObject();
        jsonObject.put("userId", 1);
        jsonObject.put("id", 1);
        jsonObject.put("title", "sddddddunt444 edrfaust facere repellat provident occaecati excepturi optio reprehenderit99990222222");
        jsonObject.put("body",  "quia et suscipit\nsuscipit recusandae consequuntur expedita et cum\nreprehenderit molestiae ut ut quas totam\nnostrum rerum est autem sunt rem eveniet architecto");



        given().header("Content-Type", "application/json").accept(ContentType.JSON).body(jsonObject.toString()).
                when().patch("https://jsonplaceholder.typicode.com/posts/1").then().assertThat().statusCode(anyOf(is(200), is(201)
                , is(204)));
    }


    @Test(priority = 0)
    public void puthhhTest()
    {

        JSONObject jsonObject = new JSONObject();
        jsonObject.put("userId", 1);
        jsonObject.put("id", 1);
        jsonObject.put("title", "sddddddsdccesunt444 edrfaust facere repellat provident occaecati excepturi optio reprehenderit99990222222");
        jsonObject.put("body",  "quia et suscipit\nsuscipit recusandae consequuntur expedita et cum\nreprehenderit molestiae ut ut quas totam\nnostrum rerum est autem sunt rem eveniet architecto");



        given().header("Content-Type", "application/json").accept(ContentType.JSON).body(jsonObject.toString()).
                when().put("https://jsonplaceholder.typicode.com/posts/1").then().assertThat().statusCode(anyOf(is(200), is(201)
                        , is(204)));
    }
}
