package pac1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class GFTest {

    WebDriver driver;
    @Test
    public void heeTest()
    {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
        driver.manage().deleteAllCookies();
        driver.navigate().to("https://www.yatra.com/");
        System.out.println(driver.getWindowHandle());
driver.quit();
        
    }



    @Test
    public void hesseTest()
    {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
        driver.manage().deleteAllCookies();
        driver.navigate().to("https://www.yatra.com/");
        System.out.println(driver.getWindowHandle());
driver.quit();

    }



    @Test
    public void heseseTest()
    {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
        driver.manage().deleteAllCookies();
        driver.navigate().to("https://practice.expandtesting.com/login");
        System.out.println(driver.getWindowHandle());
        driver.quit();

    }
}
