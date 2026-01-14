package pac12dec;

import io.restassured.http.ContentType;
import org.json.JSONObject;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

import static org.hamcrest.Matchers.*;

public class PutpracTest {

   @Test
   public void vfTest()
    {

//
//        {
//            "userId": 1,
//                "id": 1,
//                "title": "",
//                "body": ""
//        }
//


JSONObject jo=new JSONObject();
jo.put("userId", 1);
jo.put("id", 1);
jo.put("title", "");
jo.put("body", "");



      //  given().accept(ContentType.JSON).header("Content-Type, ""application/json")


    }
}
