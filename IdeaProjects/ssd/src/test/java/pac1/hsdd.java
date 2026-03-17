package pac1;

import org.apache.commons.collections.bidimap.DualHashBidiMap;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class hsdd {

    WebDriver driver;
    JavascriptExecutor js;

    @BeforeClass(alwaysRun = true)
    public void setup() {

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
        driver.manage().deleteAllCookies();
       // driver.get("https://www.hdfc.com/");

        driver.get("https://rahulshettyacademy.com/mentorship");
    }

    @AfterClass(alwaysRun = true)
    public void teardown() {

        driver.quit();
    }


   @Test(priority = 0)
    public void logoandtitleverifyTest() {
        String title =
                driver.getTitle();
        Assert.assertEquals(title, "Housing Finance | Home Finance Company | HDFC Bank Ltd");


        String url =
                driver.getCurrentUrl();
        Assert.assertEquals(url, "https://www.hdfc.com/");

        List<WebElement> list =
                driver.findElements(By.xpath("//ul[@class='primary-menu-list']"));
        System.out.println(list.size());


        boolean searchexist =
                driver.findElement(By.xpath("//span[text()='Search']")).isDisplayed();
        Assert.assertTrue(searchexist);

        boolean loginexist =
                driver.findElement(By.xpath("(//a[starts-with(normalize-space(), 'Login')])[2]")).isDisplayed();
        Assert.assertTrue(loginexist);
        }


    @Test
    public void eheTest() {
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());


    }





}



