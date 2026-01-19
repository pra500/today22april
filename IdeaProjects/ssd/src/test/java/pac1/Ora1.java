package pac1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class Ora1 {
    //nosuch java stale


    WebDriver driver;
    JavascriptExecutor js;

    @BeforeClass
    public void setup() {

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
        driver.manage().deleteAllCookies();
        driver.get("https://www.opencart.com/");

    }


    @AfterClass
    public void teardown() {
        driver.quit();

    }

    @Test(priority = 0)
    public void testvsdLoginTest() {


        WebElement wb =
                driver.findElement(By.xpath("//a[text()='Start now']"));

        driver.navigate().refresh();

        wb.click();

    }

    @Test(priority = 1)
    public void testvwwsssdLoginTest() {


        WebElement wb =
                driver.findElement(By.xpath("//a[text()='Starts now']"));


        wb.click();

    }

    @Test(priority = 2)
    public void testvsssdLoginTest() {

        WebElement wb =
                driver.findElement(By.xpath("//a[text()='Start now']"));
        js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click()", wb);



    }


}
