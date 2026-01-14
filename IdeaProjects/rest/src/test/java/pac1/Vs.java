package pac1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class Vs {

    WebDriver driver;

    @Test
    public void geeTest() {

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
        driver.manage().deleteAllCookies();
        driver.get("https://practicetestautomation.com/practice-test-login/");
        System.out.println(driver.getTitle());


    }


    @Test
    public void geeFFFTest() {

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
        driver.manage().deleteAllCookies();
        driver.get("https://practicetestautomation.com/practice-test-login/");
        System.out.println(driver.getTitle());


    }

}
