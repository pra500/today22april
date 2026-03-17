package pac1;

import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class ReTest {


    WebDriver driver;

    @BeforeClass
    public void setup() {


        ChromeOptions co=new ChromeOptions();
        co.addArguments("incognito");
        co.addArguments("headless");
        co.addArguments("disable-popup-blocking");
        driver = new ChromeDriver(co);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
        driver.manage().deleteAllCookies();
       //
        // driver.get("https://rahulshettyacademy.com/");
    //driver.get("https://www.wanderfly.in/");


    }





  //  @BeforeClass
    public void sestup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
        driver.manage().deleteAllCookies();
        driver.get("https://beeceptor.com/docs/sample-api-for-testing/");
        //     driver.getTitle().contains("Lovable - Build Apps & Websites with AI, Fast | No Code App Builder");
        //     driver.getTitle().contains("Lovable - Build Apps & Websites with AI, Fast | No Code App Builder");


    }
@AfterClass
    public void teardown() {
        driver.quit();

    }

    @Test(priority = 0)
    public void cDDddTest() {

        System.out.println( driver.getTitle());

    }


    @Test(priority = 1)
    public void cDddDddTest() {

        System.out.println( driver.getCurrentUrl());

    }



    @Test(priority = 1)
    public void cDssddDddTest() {

        System.out.println( driver.getCurrentUrl());



    }



    @Test(priority = 1)
    public void cDsssddDddTest() {

     //   System.out.println( driver.getCurrentUrl());

boolean b=
        driver.findElement(By.xpath("//h2[@id='ready-to-use-apis']")).isDisplayed();
        System.out.println(b);

    }



    @Test(priority = 1)
    public void RahulTest() {

               //   System.out.println( driver.getCurrentUrl());

        System.out.println(driver.getTitle());
//Assert.assertEquals("Rahul Shetty Academy | QA Automation, Playwright, AI Testing & QA Online Training");




    }



    }




