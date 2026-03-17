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
import java.util.Arrays;

public class ddTest {


    WebDriver driver;
    //   JavascriptExecutor js;

    @BeforeClass(alwaysRun = true)
    public void setup() {

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
        driver.manage().deleteAllCookies();
        //  driver.get("https://www.abhibus.com/");

        //driver.get("https://www.yatra.com/");

        driver.get("https://www.opencart.com/");
    }

    @AfterClass(alwaysRun = true)
    public void teardown() {

        driver.quit();
    }
/*
    //1) Verify Home Page Loads Successfully
    @Test(priority = 0)
    public void logoandtitlevSerifyTest() {
   }

    @Test(priority = 1)
    public void logoandedtitlevSerifyTest() {
        System.out.println(driver.getCurrentUrl());

    }

    @Test(priority = 1)
    public void logoandddTest() {
        System.out.println(driver.getWindowHandle());

    }


    @Test(priority = 1)
    public void logoandddedtitlevSerifyTest() {
        System.out.println(driver.getPageSource().contains("div"));

    }

*/
    @Test
    public void ldogddTest() {

        boolean b=
        driver.findElement(By.xpath("(//li//a[text()='Demo'])[2]")).isDisplayed();
        Assert.assertEquals(b, true);

    }


    @Test
    public void logddddTest() {

        boolean b=
                driver.findElement(By.xpath("(//li//a[text()='Marketplace'])[2]")).isDisplayed();
        Assert.assertEquals(b, true);

    }


    @Test
    public void logddaddTest() {
        boolean b=
        driver.findElement(By.xpath("//input[@placeholder='Enter your email address']")).isDisplayed();
        Assert.assertEquals(b, true);
    }





    @Test
    public void logdddaddTest() {
        boolean b=
                driver.findElement(By.xpath("(//li//a[text()='Download'])[2]")).isDisplayed();
        Assert.assertEquals(b, true);
    }


    @Test
    public void logdddadsdTest() {
        boolean b=
                driver.findElement(By.xpath("//a[contains(text(), 'Resources')]")).isDisplayed();
        Assert.assertEquals(b, true);


    }

    @Test
    public void logdsssddadsdTest() {
        boolean b=
                driver.findElement(By.xpath("//a[contains(text(), 'Resources')]")).isDisplayed();
        Assert.assertEquals(b, true);


    }

@Test
    public void logssddd3dsssssddddsdTest() {
        int size=
                driver.findElements(By.xpath("//button")).size();
        System.out.println(size);





    }

    }
