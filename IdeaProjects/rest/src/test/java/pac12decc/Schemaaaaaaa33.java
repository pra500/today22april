package pac12decc;

import static io.restassured.RestAssured.given;


public class Schemaaaaaaa33 {
    public static void main(String[] args) {

        /*
        //wrong json schema:

        {
            "$schema": "http://json-schema.org/draft-07/schema#",
                "type": "object",
                "required": ["data"],
            "properties": {
            "data": {
                "type": "array",
                        "required": ["id", "email"],
                "properties": {
                    "id": { "type": "string" },
                    "email": { "type": "integer" }
                }
            }
        }
        }

*/






        given().when().get("https://dummy-json.mock.beeceptor.com/todos").
                then().assertThat().statusCode(200);














    }
}
