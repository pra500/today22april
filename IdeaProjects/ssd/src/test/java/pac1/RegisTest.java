package pac1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class RegisTest {

    WebDriver driver;
    RegisPage reg;

    @BeforeMethod
    public void setup() {

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().deleteAllCookies();
        driver.get("https://www.tutorialspoint.com/selenium/practice/selenium_automation_practice.php");

         // page object created
        reg=new RegisPage(driver);
    }


    @AfterMethod
    public void tearDown() {
        driver.quit();
    }



    @Test
    public void loginTest() {
reg.enteruser();
reg.enterpass();
reg.entermobile();
    }


}


