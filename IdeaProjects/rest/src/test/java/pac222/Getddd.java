package pac222;

import io.restassured.http.ContentType;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.*; import static org.hamcrest.Matchers.*;


public class Getddd {

    @Test
    public void geeTest()
    {

        given().accept(ContentType.JSON).header("Content-Type", "application/json").

                when().get("https://jsonplaceholder.typicode.com/posts/1").then().assertThat().statusCode(200);

    }

    @Test
    public void gedddfeTest()
    {



        Map<Object, Object> map=new HashMap<Object, Object>();

        map.put("userId",1);
        map.put("id",1);
        map.put("title","sundddddddddd22dsdt aut facere repellat provident occaecati excepturi optio reprehenderit");
        map.put("body","");



        given().header("Content-Type", "application/json").
                accept("ContentType.JSON").body(map.toString()).when().
                put("https://jsonplaceholder.typicode.com/posts/1").then().assertThat()
                .statusCode(anyOf(is(200), is(201)));

    }
}


