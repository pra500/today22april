package pac1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class Chromeoptions44Test {

    WebDriver driver;


    @BeforeClass
    public void setup() {



        ChromeOptions co=new ChromeOptions();
        co.addArguments("--incognito");
        co.addArguments("--headless");
        co.addArguments("--no-sandbox");
        co.addArguments("start-maximized");
        co.addArguments("disable-autofill");
        co.addArguments("disable-extensions");
        co.addArguments("disable-infobars");
        co.addArguments("window-size=1920,1080");
        co.addArguments("disable-password-manager-reauthentication");



        driver = new ChromeDriver(co);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
        driver.manage().deleteAllCookies();
       // driver.get("https://proleed.academy/exercises/selenium/automate-the-signup-form-using-selenium-webdriver.php");
        driver.get("https://www.tutorialspoint.com/selenium/practice/selenium_automation_practice.php");

       // rgpage = new RgPage(driver);
    }


    @AfterClass
    public void teardown() {
        driver.quit();

    }


    @Test
    public void menuTest() {

boolean widget=
        driver.findElement(By.xpath("//button[normalize-space()='Widgets']")).isDisplayed();
        Assert.assertTrue(widget);

    }


}
