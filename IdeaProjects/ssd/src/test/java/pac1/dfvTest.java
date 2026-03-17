package pac1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.html5.WebStorage;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.*;

import java.time.Duration;

import static org.assertj.core.api.BDDAssumptions.given;

public class dfvTest {
    WebDriver driver;

    @BeforeClass
    public void setup() {

        ChromeOptions options = new ChromeOptions();
        options.addArguments("disable-popup-blocking");
        options.addArguments("--incognito");
        //  options.addArguments("ac

        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
        driver.manage().deleteAllCookies();

        driver.get("https://www.wanderfly.in/");

//        driver.findElement(By.cssSelector(".IntegrationModal-viewDemoBtn")).click();


        // driver.get("https://www.opencart.com/");


    }

    @AfterClass
    public void teardown() {
        driver.quit();


    }

    //   @Test
    public void menuTest() {
        List<WebElement> list =

                driver.findElements(By.xpath("//a[text()='Pricing']"));

        System.out.println(list.size());

    }

    //@Test
    public void messnuTest() {

        List<WebElement> list =

                driver.findElements(By.xpath("//ul[@class='nav navbar-nav']"));

        System.out.println(list.size());

        for (WebElement wb : list) {
            System.out.println(wb.getText() + " ");
        }


    }


    @Test
    public void mexssnuTest() {

//        List<WebElement> list =
//
//                driver.findElements(By.xpath("//ul[@class='nav navbar-nav']"));
//
//        System.out.println(list.size());
//
//        for (WebElement wb : list) {
//            System.out.println(wb.getText() + " ");
//        }
//


        WebElement wellbeing =
                driver.findElement(By.xpath("//button[text()='Wellbeing']"));


        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(14));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div//a[text()='Mental'])[2]")));
        WebElement mental =
                driver.findElement(By.xpath("(//div//a[text()='Mental'])[2]"));


        //  WebElement mental=   driver.findElement(By.xpath("(//div//a[text()='Mental'])[2]"));

        Actions actions = new Actions(driver);
        actions.moveToElement(wellbeing).click(mental).build().perform();

        String text =
                driver.findElement(By.xpath("//div//h1[text()='When your brain has too many tabs open.']")).getText();
        Assert.assertEquals(text, "When your brain has too many tabs open.");


    }


    @Test
    public void mexddssnuTest() {

        boolean flag = driver.getCurrentUrl().contains("http");

        if (flag == true) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
    @Test
    public void mexddsxxdsnuTest() {


        System.out.println(driver.findElements(By.tagName("img")).size());


}

@Test
public void mexddszxxdsnuTest()  throws Exception {


        driver.get("https://www.geeksforgeeks.org/software-testing/how-to-use-dataprovider-in-testng-selenium/");
    driver.getTitle();
        Thread.sleep(9000);


    Thread.sleep(19000);


            // ❌ Mistake 1: Driver not initialized
            driver.get("https://www.saucedemo.com/");



            // ❌ Mistake 2: Wrong locator (username field id is 'user-name')
            WebElement user = driver.findElement(By.id("user-name"));
            user.sendKeys("standard_user");

            // ❌ Mistake 3: Wrong locator (password id: 'password')
            driver.findElement(By.id("password")).sendKeys("secret_sauce");

            // ❌ Mistake 4: Wrong locator for Login button
            driver.findElement(By.id("login-button")).click();
//
//            // ❌ Mistake 5: No wait — trying to read text before page loads
//            String title = driver.findElement(By.className("title")).getText();
//
//            // ❌ Mistake 6: Incorrect assertion (expected text wrong)
//            Assert.assertEquals(title, "Welcome");

            // ❌ Mistake 7: No driver quit
        }
    }











