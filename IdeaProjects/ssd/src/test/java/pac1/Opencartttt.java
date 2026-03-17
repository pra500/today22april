package pac1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class Opencartttt {

    public static WebDriver driver;

    @BeforeClass
    public void ge() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
        driver.manage().deleteAllCookies();
        driver.get("https://www.wanderfly.in/");
    }

    @AfterClass
    public void teardown() {
        driver.quit();
    }

    @Test
    public void etetTest() {

        System.out.println(driver.getTitle());
        System.out.println(getwidnwohandlesddd());

    }
    public static String getwidnwohandlesddd() {
        String s = driver.getWindowHandle();
        return s;

    }

}
