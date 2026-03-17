package pac1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class DisableautofillmobilenumberTest {


    WebDriver driver;

    @BeforeClass
    public void setup() {

        ChromeOptions options = new ChromeOptions();
        options.addArguments("disable-popup-blocking");
        options.addArguments("incognito");
        //options.addArguments("headless");
        options.addArguments("--disable-autofill");  // ✅ Critical for mobile fields
        options.addArguments("--disable-password-manager-reauthentication");


        driver = new ChromeDriver(options);
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
    public void egeg() {
        driver.quit();
    }

    @Test
    public void geTest() throws InterruptedException {
        driver.findElement(By.xpath("//input[@name='mobile']")).sendKeys("9090423388");
        Thread.sleep(4000);

//input[@name='mobile']

    }
}
