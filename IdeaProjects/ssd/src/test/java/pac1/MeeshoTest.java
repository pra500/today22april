package pac1;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import java.time.Duration;

public class MeeshoTest {

    WebDriver driver;
    JavascriptExecutor js;

    @Test


    public void paytmtitleTest() {

        //ChromeOptions chromeOptions = new ChromeOptions();
       // chromeOptions.addArguments("--disable-popup-blocking");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(50));


        driver.get("https://www.meesho.com/");
        //driver.getTitle());
        System.out.println(driver.getCurrentUrl());

        System.out.println(driver.getWindowHandle());
       // driver.getWindowHandle()





    }

}

