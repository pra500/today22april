package pac1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.Properties;

public class T {

    WebDriver driver;

    @BeforeClass
    public void setup() {

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
        driver.manage().deleteAllCookies();
        //driver.get("https://www.tutorialspoint.com/selenium/practice/selenium_automation_practice.php");
       // driver.get("https://docs.stripe.com/api");


       // driver.get("https://www.twilio.com/docs");
        //  driver.get();


        driver.get("https://shopify.dev/docs/api");

    }



    @AfterClass
    public void teardown() {
        driver.quit();


    }

    //@Test
    public void menuTest() {
//
//        firstname=Tom
//        email=pra333@gmail.com
//                mobile=9090889900
//        dob=12/19/2022

        System.out.println(driver.getTitle());

        driver.findElement(By.xpath("//div[text()='Find anything']")).click();
        driver.findElement(By.xpath("//input[@data-testid='docs-apiref-search-dialog-searchbar']")).sendKeys("java");
    //  String s=  driver.findElement(By.xpath("(//div//span[text()='string'])[2]")).getText();
       // System.out.println(s);
//boolean t=
//        driver.getTitle().contains("Stripe API Reference");
//Assert.assertTrue(t);
        //System.out.println(title);
    }



   // @Test
    public void mendduTest() {

        driver.findElement(By.xpath("(//span[@class='DocSearch-Button-Placeholder'])[3]")).click();
        driver.findElement(By.xpath("//input[@class='DocSearch-Input']")).sendKeys("voice");


    }

    @Test
    public void mendsdddduTest() {

        driver.findElement(By.xpath("//button[@id='open-search']")).click();
        driver.findElement(By.xpath("//input[@id='search-input']")).sendKeys("product");
        System.out.println(driver.getCurrentUrl());

   }


    @Test
    public void mendcddsdddduTest() {










    }






    }


