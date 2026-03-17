package pac1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

public class TcvbTest {


    WebDriver driver;

    @BeforeClass
    public void setup() {

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(50));

        //  driver.get("https://www.cult.fit/");
        driver.get("https://www.cult.fit/");

    }

    @AfterClass
    public void teardown() {
        driver.quit();
    }
//
//    //@Test(priority = 0)
//    public void titleTest() {
//        System.out.println(driver.getTitle());
//        Assert.assertEquals("Browse thousands of Cart Page images for design inspiration | Dribbble", driver.getTitle());
//
//
//    }
//    @Test(priority = 1)
//    public void urlTest() {
//        System.out.println(driver.getCurrentUrl());
//      //  Assert.assertEquals("Browse thousands of Cart Page images for design inspiration | Dribbble", driver.getTitle());
//
//
//    }
//    @Test(priority = 0)
//    public void windowhandleTest() {
//        System.out.println(driver.getWindowHandle());
//    }
//



    @Test(priority = 0)
    public void titleTest() {
        System.out.println(driver.getTitle());

        Assert.assertEquals("Get the Best Fitness Workouts, Gyms and Sports in India | cult.fit", driver.getTitle());


    }


    @Test(priority = 1)
    public void tietleTest() {
        System.out.println(driver.getTitle());

        Assert.assertEquals("Get the Best Fitness Workouts, Gyms and Sports in India | cult.fit", driver.getTitle());


    }

    @Test(priority = 2)
    public void urlTest() {
        System.out.println(driver.getTitle());

        Assert.assertEquals("https://www.cult.fit/", driver.getCurrentUrl());


    }
    @Test(priority = 3)
    public void titdleTest() {
        System.out.println(driver.findElements(By.xpath("//a")).size());
     // driver.findElements(By.xpath("//a")).size();

    }




}
