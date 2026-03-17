package pac1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class Slice {



    WebDriver driver;
    JavascriptExecutor js;

    @BeforeClass
    public void setup() {

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
        driver.get("https://slice.bank.in/");


    }

    @AfterClass
    public void teardown() {
        driver.quit();
    }

    @Test
    public void titleTest() {

String title=
   driver.getTitle();
        Assert.assertEquals(title, "slice - A new bank, for a new India");
    }

    @Test
    public void urlTest() {

String url=
        driver.getCurrentUrl();

Assert.assertEquals(url, "https://slice.bank.in/");
    }








    @Test
    public void creditcardTest() {


        System.out.println(driver.getTitle());
    }









}
