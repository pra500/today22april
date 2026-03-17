package pac1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

import java.time.Duration;

public class Loginnnnnnnn5Test {

    WebDriver driver;


    @BeforeClass
    public void beforeClass() {

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
        driver.manage().deleteAllCookies();
        //  driver.get("https://www.abhibus.com/");
        driver.get("https://www.saucedemo.com/");


    }

    @AfterClass
    public void afterClass() {

        driver.quit();
    }

    @BeforeMethod
    public void beforeMethod() {


        System.out.println("start mtd");
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("end mtd");

    }

   // @Test(invocationCount = 3)
    public void testLoginTest() {
        boolean b =
                driver.findElement(By.xpath("//input[@class='submit-button btn_action']")).isDisplayed();
        System.out.println(b);

        String s =
                driver.findElement(By.xpath("//div[text()='Swag Labs']")).getAttribute("class");
        System.out.println(s);

        String s1 =
                driver.findElement(By.xpath("//div[text()='Swag Labs']")).getText();
        System.out.println(s1);

    }

    @Test(invocationCount = 2)
    public void loginTest() {

        //driver.findElement(By.id("user-name")).sendKeys("standard_user");
       // driver.findElement(By
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.saucedemo.com/inventory.html");
        System.out.println(driver.findElements(By.tagName("a")).size());
        System.out.println(driver.findElements(By.tagName("img")).size());
        System.out.println(driver.findElements(By.tagName("input")).size());
        System.out.println(driver.findElements(By.tagName("button")).size());
        System.out.println(driver.findElements(By.tagName("div")).size());
        // System.out.println(driver.findElements(By.tagName("a")).size());

        System.out.println(driver.findElement(By.xpath("//div[text()='Sauce Labs Backpack']")).getAttribute("class"));
        System.out.println(driver.findElement(By.xpath("//div[text()='Sauce Labs Backpack']")).getText());
        System.out.println(driver.findElement(By.xpath("//div[text()='Sauce Labs Backpack']")).getLocation());
        // driver.findElement(By.xpath("//div[text()='Sauce Labs Backpack']")).getAttribute("class");

    }


   // @Test(invocationCount = 2)
    public void testsLsoginTest() {
        driver.findElement(By.id("user-name")).sendKeys("standard_user");

    }
}


