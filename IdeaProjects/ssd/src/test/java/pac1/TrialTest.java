package pac1;

import com.fasterxml.jackson.annotation.JsonEnumDefaultValue;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class TrialTest {


//
//
//    Selenium Intermediate (11–20)
//1️⃣1️⃣ Switch to iframe and type text inside it.
//
//            1️⃣2️⃣ Open a link in new tab and switch to it.
//
//            1️⃣3️⃣ Count number of rows in a web table.
//
//            1️⃣4️⃣ Click dynamic element using XPath.





    WebDriver driver;
 JavascriptExecutor js;
 WebDriverWait wait;


    @BeforeClass
    public void setup() {

        driver = new ChromeDriver();
        driver.manage().window().maximize();
       // driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
        driver.manage().deleteAllCookies();
    //    driver.get("https://www.phonepe.com/");

        driver.get("https://www.file.io/");

    }


    @AfterClass
    public void teardown() {
        driver.quit();

    }

    @Test(priority = 0)
    public void urlTest() throws InterruptedException {

//
//        driver.switchTo().newWindow(WindowType.TAB);
//        driver.get("https://www.cult.fit/");

//driver.switchTo().frame("courses-iframe");
//
//
//driver.findElement(By.xpath("(//ul/li//a[text()='Courses'])[1]")).click();
//
//        List<WebElement>list=
//driver.findElements(By.xpath("//table[@class='table-display']//tr"));
//        System.out.println(list.size());


//
//        driver.findElement(By.xpath("//p//a[text()='JQuery UI Menus']")).click();
//        Assert.assertEquals(driver.getTitle(), "Menu Widget | jQuery UI API Documentation");
//        driver.navigate().back();

//
//        Scroll to bottom of page using JavaScriptExecutor.
//
//        1️⃣6️⃣ Wait for element using WebDriverWait.
//
//        1️⃣7️⃣ Upload a file using sendKeys().



//
//         js=(JavascriptExecutor)driver;
//        js.executeScript("window.scrollBy(300, 600)", ""
//        );


//
//        wait=new WebDriverWait(driver, Duration.ofSeconds(9));
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='Learn More']"))).click();


//
//
//WebElement file1=
//
//        driver.findElement(By.xpath("//input[@type='file']"));
//                        .sendKeys("C:\\Users\\pragt\\OneDrive\\Documents\\ecommerce.html");


        wait=new WebDriverWait(driver, Duration.ofSeconds(9));
     WebElement fileee=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type='file']")));

     fileee.sendKeys("C:\\Users\\pragt\\OneDrive\\Documents\\ecommerce.html");
               // .sendKeys("C:\\Users\\pragt\\AppData\\Local\\Packages\\Microsoft.WindowsFeedbackHub_8wekyb3d8bbwe\\LocalState\\{f1805921-031b-47cc-b99d-e00a4dbf708c}\\Capture0.png");

   //     .sendKeys("C:\\Users\\pragt\\OneDrive\\Documents\\ecommerce.html");


//
//    WebElement wr=
//driver.findElement(By.xpath("//a[text()='Learn More']"));


//    wait=new WebDriverWait(driver, Duration.ofSeconds(10));
//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='Learn More']"))).click();
//Assert.assertEquals(driver.getCurrentUrl(), "https://www.file.io/about");



         }
    }