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

public class RTest {


    WebDriver driver;
    // pGSEEE p;

    @BeforeClass
    public void setup() {
//
//        ChromeOptions options = new ChromeOptions();
//        options.addArguments("disable-popup-blocking");
        //  options.addArguments("ac

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
        driver.manage().deleteAllCookies();
        driver.get("https://juspay.io/in");

   //     driver.get("https://proleed.academy/exercises/selenium/automate-the-signup-form-using-selenium-webdriver.php");

//        driver.findElement(By.cssSelector(".IntegrationModal-viewDemoBtn")).click();
        //    p = new pGSEEE(driver);


    }


    @AfterClass
    public void teardown() {
        driver.quit();

    }


    //javaexe

  //  @Test
    public void menuTest() {

//        boolean b=
//       driver.findElement(By.xpath("//span[text()='Juspay raises $50 million in Series D follow-up.']")).isDisplayed();

        JavascriptExecutor js=(JavascriptExecutor)driver;
        js.executeScript("window.scroddfllBy(300, 500)", "");



    }


//nosuch
   // @Test
    public void nsauTest() {

//        boolean b=
//       driver.findElement(By.xpath("//span[text()='Juspay raises $50 million in Series D follow-up.']")).isDisplayed();


//
//        boolean b=
//        driver.findElement(By.xpath("//spannormalize-space()='Products']")).isDisplayed();
//        System.out.println(b);


        boolean b2=
                driver.findElement(By.xpath("//span[normalize-space()='Produdddd    cts']")).isDisplayed();
        System.out.println(b2);

    }



  //  @Test
    public void nsaduTest() {
        WebElement b=
        driver.findElement(By.xpath("//span[normalize-space()='Products']"));

        driver.navigate().refresh();
        b.isDisplayed();

    }





    }

