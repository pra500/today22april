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

public class YTest {
    WebDriver driver;
    Ypage ypage;


    @BeforeClass
    public void setup() {

//        ChromeOptions co=new ChromeOptions();
//        co.addArguments("--incognito");
//        co.addArguments("--headless");
//        co.addArguments("--no-sandbox");
//        co.addArguments("start-maximized");
//        co.addArguments("disable-autofill");
//        co.addArguments("disable-extensions");
//        co.addArguments("disable-infobars");
//        co.addArguments("window-size=1920,1080");
//        co.addArguments("disable-password-manager-reauthentication");


        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
        driver.manage().deleteAllCookies();
        // driver.get("https://proleed.academy/exercises/selenium/automate-the-signup-form-using-selenium-webdriver.php");
        //driver.get("https://www.tutorialspoint.com/selenium/practice/selenium_automation_practice.php");

        driver.get("https://demo.automationtesting.in/Register.html");

        // rgpage = new RgPage(driver);

        ypage=new Ypage(driver);
    }

    @AfterClass
    public void teardown() {
        driver.quit();

    }

    @Test
    public void menuTest() {

ypage.getfd();


    }
}