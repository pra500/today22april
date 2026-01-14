package paccccc;

import io.restassured.http.ContentType;
import org.json.JSONObject;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

public class Putreq {


    @Test(enabled = false)
    public void geeeTest() {

        JSONObject jo = new JSONObject();
        jo.put("userId", 1);
        jo.put("id", 1);
        jo.put("title", "sunt auedest facere repellat provident occaecati excepturi optio reprehenderit9999222");
        jo.put("body", "quia et suscipit\nsuscipit recusandae consequuntur expedita et cum\nreprehenderit molestiae ut ut quas totam\nnostrum rerum est autem sunt rem eveniet architecto");

        given().header("Content-Type", "application/json")
                .accept(ContentType.JSON).
                body(jo.toString()).when().put("https://jsonplaceholder.typicode.com/posts/1").then().statusCode(200).log().all();


    }


    @Test
    public void geeseTest() {

        given().auth().basic("user", "passwd").when()
                .get("https://httpbin.org/basic-auth/user/passwd").then().assertThat().statusCode(200)
                .log().all();


    }

}

