package pac1;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

import static io.restassured.RestAssured.given;

public class V33 {

    public static void main(String[] args) {

        Response response= given().when().get("https://api.restful-api.dev/objects");
        String s1=
        response.getBody().asString();
        System.out.println(s1);

        given().when().get("https://api.restful-api.dev/objects").then().assertThat().statusCode(200);
        given().when().get("https://api.restful-api.dev/objects?id=3&id=5&id=11").then().assertThat().statusCode(200);
       // given().when().get("https://api.restful-api.dev/objects").then().assertThat().statusCode(200);















    }
}

