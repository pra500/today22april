package pac1;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class fvTest {


    WebDriver driver;

    @BeforeClass
    public void setup()
    {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(50));
        driver.get("https://www.makemytrip.com/");
    }



    @AfterClass
    public void teardown()
    {
        driver.quit();
    }


    @Test(priority = 0)
    public void geTest()
    {
        System.out.println(driver.getTitle());
       }


    @Test(priority = 1)
    public void gesaTest()
    {
        System.out.println(driver.getCurrentUrl());
    }


}
