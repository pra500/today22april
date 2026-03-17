package pac1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class scTest {


    WebDriver driver;
    // JavascriptExecutor js;

    WebDriverWait wait;

    @BeforeClass(alwaysRun = true)
    public void setup() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito-");
        options.addArguments("--headless-");
       // options.addArguments("-incognito");

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        //  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
        driver.manage().deleteAllCookies();
        //  driver.get("https://www.abhibus.com/");

        //driver.get("https://www.yatra.com/");

        //  driver.get("https://www.wanderfly.in/");


        driver.get("https://www.cult.fit/");
    }

    @AfterClass(alwaysRun = true)
    public void teardown() {

        driver.quit();
    }

    //1) Verify Home Page Loads Successfully
    @Test(priority = 0)
    public void logoandtitlevSerifyTest() {

        // System.out.println(driver.getTitle().contains("Yatra.com – Best Travel Website. Book Flights, Hotels, Trains, Holidays &amp; Bus Tickets"));
        System.out.println(driver.getTitle());



    }
    //1) Verify Home Page Loads Successfully
    @Test(priority = 1)
    public void logoandastitlevSerifyTest() {

        // System.out.println(driver.getTitle().contains("Yatra.com – Best Travel Website. Book Flights, Hotels, Trains, Holidays &amp; Bus Tickets"));
        System.out.println(driver.getTitle());

        System.out.println(driver.getCurrentUrl());
       // driver.getCurrentUrl()

        int size=
        driver.findElements(By.tagName("a")).size();
        System.out.println(size);



    }

    @Test(priority = 1)
    public void logddTest() {

       // System.out.println(driver.getWindowHandle());
      //  System.out.println(driver.getCurrentUrl());

        System.out.println(driver.findElements(By.tagName("div")).size());

        System.out.println(driver.findElements(By.tagName("input")).size());
        System.out.println(driver.findElements(By.tagName("button")).size());

    }

    @Test(priority = 1)
    public void logddddTest() {

        // System.out.println(driver.getWindowHandle());
        //  System.out.println(driver.getCurrentUrl());

//        System.out.println(driver.findElements(By.tagName("div")).size());
//
//        System.out.println(driver.findElements(By.tagName("input")).size());
//        System.out.println(driver.findElements(By.tagName("button")).size());


        String s=
        driver.getWindowHandle();
        System.out.println(s);







    }



}
