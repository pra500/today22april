package pac1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class RTTest {


    WebDriver driver;

    @BeforeClass
    public void setup() {

//
//        ChromeOptions co=new ChromeOptions();
//        co.addArguments("incognito");
//        co.addArguments("headless");
//        co.addArguments("disable-popup-blocking");
//        driver = new ChromeDriver(co);

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
        driver.manage().deleteAllCookies();
        //
        // driver.get("https://rahulshettyacademy.com/");
        //driver.get("https://www.wanderfly.in/");
        driver.get("https://www.tutorialspoint.com/selenium/practice/selenium_automation_practice.php");
    }

    @AfterClass
    public void teardown() {
        driver.quit();
    }


    //@Test(priority = 0)
    public void teardoeeTest() {
        System.out.println(driver.getCurrentUrl());

    }


    @Test(priority = 0)
    public void tesardoeeTest() {
        System.out.println(driver.getWindowHandle());
    }


}





