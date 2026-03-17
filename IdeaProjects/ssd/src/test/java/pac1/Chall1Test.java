package pac1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class Chall1Test {




//
//    Selenium Intermediate (11–20)
//1️⃣1️⃣ Switch to iframe and type text inside it.
//
//            1️⃣2️⃣ Open a link in new tab and switch to it.
//
//            1️⃣3️⃣ Count number of rows in a web table.
//
//            1️⃣4️⃣ Click dynamic element using XPath.
//
//1️⃣5️⃣ Scroll to bottom of page using JavaScriptExecutor.
//
//1️⃣6️⃣ Wait for element using WebDriverWait.
//
//1️⃣7️⃣ Upload a file using sendKeys().
//
//            1️⃣8️⃣ Take a screenshot.






    WebDriver driver;
    JavascriptExecutor js;

    @BeforeClass(alwaysRun = true)
    public void setup() {
//        ChromeOptions options = new ChromeOptions();
//        options.addArguments("--window-size=1920,1080");
//        options.addArguments("disable-infobars");
//

        // options.addArguments("disable-");
        // options.addArguments("--autofill-disabled=true");

        driver = new ChromeDriver();
        //driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
        driver.manage().deleteAllCookies();
        //  driver.get("https://www.abhibus.com/");

        //driver.get("https://www.yatra.com/");

        driver.get("https://practice-automation.com/iframes/");
    }

    @AfterClass(alwaysRun = true)
    public void teardown() {

        driver.quit();
    }

    //1) Verify Home Page Loads Successfully
    @Test(priority = 0)
    public void logoandtitlevSerifyTest() {

        //System.out.println(driver.getTitle());
        WebElement w=
driver.findElement(By.xpath("//iframe[@id='iframe-1']"));


        driver.switchTo().frame(w);

     String text= driver.findElement(By.xpath("//div//a[text()='Get started']")).getText();
      //      Assert.assertEquals(text, "Courses");


        driver.switchTo().defaultContent();
Assert.assertEquals(driver.getCurrentUrl(), "https://practice-automation.com/iframes/");
       // driver.getCurrentUrl(), "https://practice-automation.com/iframes/"









    }






    }
