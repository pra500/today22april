package pac12dec;


import static io.restassured.RestAssured.*;
        import static io.restassured.module.jsv.JsonSchemaValidator.*;
public class Geee {


    public static void main(String[] args) {


        given().when().get("https://jsonplaceholder.typicode.com/posts/1/").then().assertThat().statusCode(200)
                .body(matchesJsonSchemaInClasspath("s1.json"));


    }
}