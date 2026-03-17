package prac444;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class RegisTest {





    WebDriver driver;
    Regispage reg;

    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
        driver.get("https://www.techlistic.com/p/selenium-practice-form.html");

reg=new Regispage(driver);
    }

    @AfterMethod
    public void teardown() {
        driver.quit();

    }

    @Test
    public void sdcfffeTest() {

        reg.getusername();

    }



}
