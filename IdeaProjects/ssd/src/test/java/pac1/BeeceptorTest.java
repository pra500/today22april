package pac1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class BeeceptorTest {

    WebDriver driver;

    @BeforeClass
    public void setup()
    {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
        driver.manage().deleteAllCookies();
        driver.get("https://beeceptor.com/docs/sample-api-for-testing/");
    }


    @AfterClass
    public void teardown() {

        driver.quit();
    }


    @Test
    public void hesseTest()
    {
        System.out.println(driver.getWindowHandle());
    }


    @Test
    public void hedsseTest()
    {
        System.out.println(driver.getCurrentUrl());
    }



    @Test
    public void hesdseTest()
    {
        System.out.println(driver.getTitle());
    }

}
