package prac444;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import java.time.Duration;

public class CTest {
    WebDriver driver;
    CPge cpa;

    @BeforeMethod
    public void setup() {

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));

        //  driver.get("https://www.cult.fit/");
        driver.get("https://practice.expandtesting.com/login");
       cpa=new CPge(driver);

    }

    @AfterMethod
    public void teardown() {
        driver.quit();
    }


    @Test
    public void egeTest()
    {
        System.out.println(driver.getTitle());
//driver.getTitle()


    }


}
