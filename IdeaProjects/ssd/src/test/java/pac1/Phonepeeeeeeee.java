package pac1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class Phonepeeeeeeee {

    WebDriver driver;
//    JavascriptExecutor js;

    @BeforeClass
    public void setup() {

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
        driver.manage().deleteAllCookies();
        //driver.get("https://www.phonepe.com/");

    }


    @AfterClass
    public void teardown() {
        driver.quit();

    }

    @Test(priority = 0)
    public void testvsdLoginTest() {

boolean flag=
        driver.findElement(By.xpath("//img[@alt='PhonePe | Logo']")).isDisplayed();
        Assert.assertTrue(flag);

    }


    @Test(priority = 0)
    public void saucedemoooTest() {

        driver.get("https://www.saucedemo.com/");
        String text=
        driver.findElement(By.xpath("//div[text()='Swag Labs']")).getAttribute("class");
Assert.assertEquals(text, "login_logo");

    }


    @Test(priority = 0)
    public void saucededdmoooTest() {



    }

}