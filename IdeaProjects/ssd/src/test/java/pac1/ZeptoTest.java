package pac1;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.Set;

public class ZeptoTest {

    WebDriver driver;
    JavascriptExecutor js;

    @BeforeClass
    public void setup() {


        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(50));
        driver.get("https://www.zepto.com/");

    }

    @AfterClass
    public void teardown() {
        driver.quit();
    }

    @Test
    public void feaadsffTest() {

        Assert.assertTrue(driver.findElement(By.xpath("//span[text()='Search for']")).isDisplayed());
        Assert.assertTrue(driver.findElement(By.xpath("//button[@aria-label='Cart']")).isDisplayed());
        Assert.assertTrue(driver.findElement(By.xpath("//button[@aria-label='login']")).isDisplayed());

String searchfor=
        driver.findElement(By.xpath("//span[text()='Search for']")).getText();
Assert.assertEquals("Search for", searchfor);


        System.out.println(driver.getTitle());







    }







}
