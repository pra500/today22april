package pac1;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class Wdv {

    WebDriver driver;
    JavascriptExecutor js;

    @BeforeClass
    public void setup() {

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(50));
        driver.get("https://tech.walmart.com/content/walmart-global-tech/en_us.html");

    }

    @AfterClass
    public void teardown() {
        driver.quit();
    }

    @Test
    public void titleTest() {
        String title =
                driver.getTitle();
        Assert.assertTrue(title.contains("- Walmart"));


    }


    @Test
    public void urlTest() {
        String url =
                driver.getCurrentUrl();
        Assert.assertTrue(url.contains("_us.html"));
    }

    @Test
    public void logoTest() {
        String url =
                driver.getCurrentUrl();
        Assert.assertTrue(url.contains("/tech"));

    }

    @Test
    public void totallinksTest() {


        List<WebElement> links =
                driver.findElements(By.tagName("//a"));
        System.out.println(links.size());


    }

    @Test
    public void totalimagesTest() {


        List<WebElement> images =
                driver.findElements(By.tagName("//img"));
        System.out.println(images.size());


    }


}
