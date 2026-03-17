package prac444;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import java.time.Duration;

public class RegissssswcTest {
    WebDriver driver;
    Regissss reg;

    @BeforeClass
    public void gee() {

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
        driver.get("https://www.tutorialspoint.com/selenium/practice/selenium_automation_practice.php");
        reg = new Regissss(driver);
    }



    @AfterClass
    public void tear() {
        driver.quit();
    }


    @Test
    public void eeeTest() {
        reg.enteremail();
    }


    @Test
    public void eessessTest() {
        reg.entersubject();

    }


}
