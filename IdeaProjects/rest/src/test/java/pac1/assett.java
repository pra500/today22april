package pac1;

import org.checkerframework.checker.index.qual.LessThan;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

import static org.hamcrest.Matchers.*;


public class assett {
    @Test
    public void test() {


        given().log().all().when().get("https://api.restful-api.dev/objects?id=3&id=5&id=13").then().statusCode(200);
    }

    @Test
    public void tSSSest() {

        given().log().all().when().get("https://api.restful-api.dev/objects?id=3&id=5&id=13").then().assertThat().


                statusCode(200).time(lessThan(2000L));




    }


    @Test
    public void teSst() {

        given().log().all().when().get("https://api.restful-api.dev/objects?id=3&id=5&id=13").then().assertThat().

                statusCode(200).time(lessThan(2000L)).log().all();

    }

    @Test
    public void teSSSst() {

        given().log().all().when().get("https://api.restful-api.dev/objects?id=3&id=5&id=12").then().assertThat().

                statusCode(200).time(lessThan(2000L)).body("[0].name", equalTo("Apple iPhone 12 Pro Max"));


    }


    @Test
    public void teSSSSst() {


        given().log().all().when().get("https://api.restful-api.dev/objects?id=3&id=5&id=12").then().assertThat().

                statusCode(200).time(lessThan(2000L)).log().all().body("[0].data.color", equalTo("Cloudy White"));
    }



        @Test
        public void teSSddcSst() {

            given().log().all().when().get("https://api.restful-api.dev/objects?id=3&id=5&id=12").then().assertThat().

                    statusCode(200).time(lessThan(2000L)).body("[0].name", equalTo("Apple iPhone 12 Pro Max"));


        }














    }



