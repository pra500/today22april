package pac1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class T5 {

    WebDriver driver;
    JavascriptExecutor js;

    @BeforeClass(alwaysRun = true)
    public void setup() {

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
        driver.manage().deleteAllCookies();
        driver.get("https://www4.tcsion.com/Login/Login.html");
    }

    @AfterClass(alwaysRun = true)
    public void teardown() {

        driver.quit();
    }


    @Test(priority = 0)
    public void logoandtitleverifyTest() {
        String logoname =

                driver.findElement(By.xpath("//img[@alsdt='TCS LOGO']")).getText();
        System.out.println(logoname);

    }


    @Test(priority = 0)
    public void logoandtsitleverifyTest() {
        WebElement logoname =
                driver.findElement(By.xpath("//div//h1[contains(text(), 'Experience the best')]"));


        driver.navigate().refresh();
        System.out.println(   logoname.isDisplayed());
     //   logoname.isDisplayed()




    }
}
