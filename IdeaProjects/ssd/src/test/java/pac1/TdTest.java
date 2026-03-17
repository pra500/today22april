package pac1;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class TdTest {
    WebDriver driver;
    // JavascriptExecutor js;

    WebDriverWait wait;

    @BeforeClass(alwaysRun = true)
    public void setup() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito-");
        options.addArguments("--headless-");
        // options.addArguments("-incognito");

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
        driver.manage().deleteAllCookies();
        driver.get("https://demowebshop.tricentis.com/");


    }

    @AfterClass
    public void tearDown() {
        driver.quit();

    }

    @Test
    public void TdwwwTest() {
        try {


            Assert.assertEquals("Demo Web Shop", driver.getTitle());

            Assert.assertEquals("https://demowebshop.tricentis.com/", driver.getCurrentUrl());
            boolean b =
                    driver.findElement(By.xpath("//input[starts-with(@id, 'small-')]")).isDisplayed();
            Assert.assertTrue(b);

            boolean b1 =
                    driver.findElement(By.xpath("//img[@alt='Tricentis Demo Web Shop']")).isDisplayed();
            Assert.assertTrue(b1);


            boolean b2 =
                    driver.findElement(By.xpath("(//div//li//a[normalize-space()='Electronics'])[1]")).isDisplayed();
            Assert.assertTrue(b2);
            boolean b22 =
                    driver.findElement(By.xpath("(//div//li//a[normalize-space()='Electronics'])[1]")).isDisplayed();
            Assert.assertTrue(b22);

        } catch (Exception e) {

            e.printStackTrace();
        }
    }
}
