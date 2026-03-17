package pac1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class Paytm111 {


    WebDriver driver;


    @BeforeClass
    public void setup() {

        ChromeOptions options = new ChromeOptions();
        options.addArguments("disable-popup-blocking");
        //  options.addArguments("ac

        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
        driver.manage().deleteAllCookies();
        //driver.get("https://juspay.io/in");

        driver.get("https://paytm.com/");

//        driver.findElement(By.cssSelector(".IntegrationModal-viewDemoBtn")).click();

        
    }


    public void teardown() {
        driver.quit();

    }

    @Test
    public void menuTest() {

//        boolean b=
//       driver.findElement(By.xpath("//span[text()='Juspay raises $50 million in Series D follow-up.']")).isDisplayed();
//        System.out.println(b);

        System.out.println(driver.findElements(By.tagName("div")).size());

    }

    @Test
    public void mednuTest() {

//        boolean b=
//       driver.findElement(By.xpath("//span[text()='Juspay raises $50 million in Series D follow-up.']")).isDisplayed();
//        System.out.println(b);

        System.out.println(driver.findElements(By.tagName("image")).size());

    }


    @Test
    public void mednsduTest() {

//        boolean b=
//       driver.findElement(By.xpath("//span[text()='Juspay raises $50 million in Series D follow-up.']")).isDisplayed();
//        System.out.println(b);

        System.out.println(driver.findElements(By.tagName("input")).size());




    }


    @Test
    public void mednddsduTest() {

//        boolean b=
//       driver.findElement(By.xpath("//span[text()='Juspay raises $50 million in Series D follow-up.']")).isDisplayed();
//        System.out.println(b);


        System.out.println(driver.getWindowHandle());

    }


    @Test
    public void medndddsduTest() {

//        boolean b=
//       driver.findElement(By.xpath("//span[text()='Juspay raises $50 million in Series D follow-up.']")).isDisplayed();
//        System.out.println(b);


        System.out.println(driver.getWindowHandle());

    }

    @Test
    public void medneesduTest() {

//        boolean b=
//       driver.findElement(By.xpath("//span[text()='Juspay raises $50 million in Series D follow-up.']")).isDisplayed();
//        System.out.println(b);

        System.out.println(driver.findElements(By.tagName("input")).size());

    }
}
