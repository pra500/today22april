package pac1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.Set;

public class WalmartlabsTest {


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
    public void searchTest() {
        String parent = driver.getWindowHandle();

        driver.findElement(By.xpath("//input[@id='job-keyword']")).sendKeys("java opening", Keys.ENTER);

        Set<String> set1 = driver.getWindowHandles();

        for (String ss : set1) {
            if (!ss.equalsIgnoreCase(parent)) {


                driver.switchTo().window(ss);
                break;

            }
        }



        driver.findElement(By.xpath("//div//a[normalize-space()='Go to homepage']")).click();

        String title = driver.getTitle();
        Assert.assertTrue(title.contains("Walmart Careers | Submit a Walmart Job Application Online"));


        driver.close();
        driver.switchTo().window(parent);


    }


}
