package pac1;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class TeeTest {


//
//
//    hasSize()/hasLength()
//
//    contains() vs containsInAnyOrder() vs hasItem() vs hasItems()
//
//
//    chromeoptions
//    "value"
//    get 5 func


    WebDriver driver;
//    JavascriptExecutor js;

    @BeforeClass
    public void setup() {


        ChromeOptions options=new  ChromeOptions();
        options.addArguments("headless");
      //  options.addArguments("headless");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
        driver.manage().deleteAllCookies();
        //driver.get("https://practicetestautomation.com/practice-test-login/");
driver.get("https://www.saucedemo.com/");
    }


    @AfterClass
    public void teardown() {
        driver.quit();

    }

    @Test(priority = 0)
    public void urlTest() {
        String url =
                driver.getCurrentUrl();
        System.out.println(url);

    }


    @Test(priority = 0)
    public void usrlTest() {

// Complete E-commerce Flow: Search → Filter → Add to Cart

        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();

        WebElement wb=
driver.findElement(By.xpath("//select[@class='product_sort_container']"));
        Select select=new Select(wb);
        select.selectByVisibleText("Name (Z to A)");


        driver.findElement(By.xpath("//button[@id='add-to-cart-test.allthethings()-t-shirt-(red)']")).click();
        driver.findElement(By.xpath("//span[@class='shopping_cart_badge']")).click();

        String textname=
        driver.findElement(By.xpath("//a//div[text()='Test.allTheThings() T-Shirt (Red)']")).getText();
        Assert.assertEquals(textname, "Test.allTheThings() T-Shirt (Red)");


    }





    @Test(priority = 0)
    public void ussrlTest() {

// Complete E-commerce Flow: Search → Filter → Add to Cart

        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();

        WebElement wb=
                driver.findElement(By.xpath("//select[@class='product_sort_container']"));
        Select select=new Select(wb);
        select.selectByVisibleText("Name (Z to A)");

        List<WebElement>list=
        driver.findElements(By.xpath("//div[@class='inventory_item_description']"));
        System.out.println("totel links" + list.size());


        for(int i=0;i<=list.size()-1;i++)
        {
            System.out.println(list.get(i).getText());

        }

        driver.findElement(By.xpath("//button[@id='add-to-cart-test.allthethings()-t-shirt-(red)']")).click();
        driver.findElement(By.xpath("//span[@class='shopping_cart_badge']")).click();

        String textname=
                driver.findElement(By.xpath("//a//div[text()='Test.allTheThings() T-Shirt (Red)']")).getText();
        Assert.assertEquals(textname, "Test.allTheThings() T-Shirt (Red)");


    }

}


