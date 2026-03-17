package pac1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

public class Rahulshettyyyy333 {


    WebDriver driver;

    @BeforeClass
    public void setup() {

//        ChromeOptions options = new ChromeOptions();
//        options.addArguments("disable-popup-blocking");
//        //  options.addArguments("ac

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
        driver.manage().deleteAllCookies();
        driver.get("https://rahulshettyacademy.com/");

//        driver.findElement(By.cssSelector(".IntegrationModal-viewDemoBtn")).click();


        // driver.get("https://www.opencart.com/");


    }

    @AfterClass
    public void teardown() {
        driver.quit();


    }



    @Test
    public void menuTest() {
            //    driver.findElement(By.xpath(
                driver.findElement(By.xpath(
                        "//a[text()='Browse Courses']")).click();

                Set<String> set1=
       driver.getWindowHandles();
        Iterator<String>itr=set1.iterator();
       String parent= itr.next();
      String child=  itr.next();

      driver.switchTo().window(child);

      driver.findElement(By.xpath("//input[@type='search']")).sendKeys("java", Keys.ENTER);
       boolean b= driver.findElement(By.xpath("//h2[text()='Selenium Webdriver with Java  (Basics+Advanced+Interview Guide)']"
                )).isDisplayed();
        Assert.assertTrue(b);

        driver.close();
        driver.switchTo().window(parent);
    }



    }
