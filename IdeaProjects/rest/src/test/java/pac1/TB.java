package pac1;

import io.restassured.http.ContentType;
import org.testng.annotations.Test;

import java.util.*;


import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;


public class TB {

    //403 2-3 practice set

    @Test
    public void geeTest() {

        Map<String, String> map1 = new HashMap<String, String>();
        map1.put("userId", "1");
        map1.put("id", "1");
        map1.put("title", "sunt ssaut facere repellat provident occaecati excepturi optio reprehenderit");
        map1.put("body", "quiaaaaa et suscipit\nsuscipit recusandae consequuntur expedita et cum\nreprehenderit molestiae ut ut quas totam\nnostrum rerum est autem sunt rem eveniet architecto");


        given().header("Content-Type", "application/json")
                .accept((ContentType.JSON)).body(map1.toString()).when().put("https://jsonplaceholder.typicode.com/posts/1")
                .then().statusCode(anyOf(is(200), is(204), is(201)));


    }
}
