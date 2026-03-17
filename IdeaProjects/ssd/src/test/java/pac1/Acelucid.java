package pac1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class Acelucid {

    WebDriver driver;
    JavascriptExecutor js;

    @BeforeClass
    public void setup() {

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(50));
        driver.get("https://www.acelucid.com/");

    }

    @AfterClass
    public void teardown() {
        driver.quit();
    }

    @Test
    public void ggTest() {

        String title = driver.getCurrentUrl();
        Assert.assertTrue(title.contains("acelucid"));

        boolean logoexist =
                driver.findElement(By.xpath("(//a//img[@alt='Acelucid Logo'])[1]")).isDisplayed();
        Assert.assertTrue(logoexist);


        List<WebElement> list =
                driver.findElements(By.xpath("//ul[@class='navbar-nav mx-auto mb-lg-0']"));
        int size = list.size();
        Assert.assertEquals(size, 1);

        boolean b =
                driver.findElement(By.xpath("//button[contains(text(), 'Schedule a Call')]")).isDisplayed();
        Assert.assertTrue(b, "check the message");


        System.out.println("t");



//
//        Scroll to bottom of page using JavaScriptExecutor.
//
//        1️⃣6️⃣ Wait for element using WebDriverWait.
//
//        1️⃣7️⃣ Upload a file using sendKeys().
//
//        1️⃣8️⃣ Take a screenshot.
//
//        1️⃣9️⃣ Hover over a menu using Actions class.


//
//         js = (JavascriptExecutor) driver;
//        js.executeScript("window.scrollBy(400, 600)", "");
//
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(14));
//        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
//                "(//p[normalize-space()='Copyright © 2026 Acelucid, All rights reserved'])")));
//
//        boolean copyright =
//                element.isDisplayed();
//        Assert.assertTrue(copyright);


















    }
}
