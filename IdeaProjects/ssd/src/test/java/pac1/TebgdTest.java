package pac1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class TebgdTest {


    WebDriver driver;
//    JavascriptExecutor js;

    @BeforeClass
    public void setup() {

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
        driver.manage().deleteAllCookies();
        driver.get("https://www.phonepe.com/");

    }


    @AfterClass
    public void teardown() {
        driver.quit();

    }

    @Test(priority = 0)
    public void urlTest() {
        String url =
                driver.getCurrentUrl();
        System.out.println(url);

        Assert.assertEquals("https://www.phonepe.com/", url);




    }

    @Test(priority = 1)
    public void titleTest() {
        String url =
                driver.getTitle();
        System.out.println(url);

        Assert.assertEquals("PhonePe: UPI Payments, Investment, Insurance, Recharges, DTH & More", url);



    }

    @Test(priority = 2)
    public void getwindowTest() {


        String url =
                driver.getWindowHandle();
        System.out.println(url);



    }



}