package pac1;

import org.openqa.selenium.By;
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

public class AbhibusddTest {

    WebDriver driver;
   // JavascriptExecutor js;

    WebDriverWait wait;

    @BeforeClass(alwaysRun = true)
    public void setup() {

        driver = new ChromeDriver();
        driver.manage().window().maximize();
      //  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
        driver.manage().deleteAllCookies();
        //  driver.get("https://www.abhibus.com/");

        //driver.get("https://www.yatra.com/");

      //  driver.get("https://www.wanderfly.in/");


        driver.get("https://slice.bank.in/");
    }

    @AfterClass(alwaysRun = true)
    public void teardown() {

        driver.quit();
    }

    //1) Verify Home Page Loads Successfully
   // @Test(priority = 0)
    public void logoandtitlevSerifyTest() {

        // System.out.println(driver.getTitle().contains("Yatra.com – Best Travel Website. Book Flights, Hotels, Trains, Holidays &amp; Bus Tickets"));
        System.out.println(driver.getTitle());
    }

   // @Test
    public void FaqsTest() {
//
//WebElement resources=
//        driver.findElement(By.xpath("//button[starts-with(text(), 'Resources')]"));
//boolean presence=
//resources.isDisplayed();
//        Assert.assertEquals(presence, true);
//        WebElement faq=
//        driver.findElement(By.xpath("//a[starts-with(text(), 'FAQ')]"));
//
//
//        Actions actions = new Actions(driver);
//        actions.moveToElement(resources).click(faq).build().perform();
//
//
//
//        String url= driver.getCurrentUrl();
//        Assert.assertEquals("https://www.wanderfly.in/faq", url);

    }




   // @Test
    public void FaqssTest() {
         System.out.println(driver.getCurrentUrl());

    }



    @Test
    public void FacdcqsTest() {

        driver.findElement(By.xpath("//a[contains(text(), 'Savings account')]")).click();
        driver.findElement(By.xpath("//a[contains(text(), 'UPI Credit Card')]")).click();

        Assert.assertEquals(driver.getCurrentUrl(), "https://slice.bank.in/credit-card/");

     WebElement whatweoffer= driver.findElement(By.xpath("//button[text()='What we offer']"));

        wait=new WebDriverWait(driver, Duration.ofSeconds(7));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='What we offer']")));

String s=
        whatweoffer.getText();
        Assert.assertEquals(s, "What we offer");

        String ssss=
                driver.findElement(By.xpath("//button[text()='What we offer']")).getAttribute("aria-label");
        Assert.assertEquals(ssss, "Open menu");




    }
    }
