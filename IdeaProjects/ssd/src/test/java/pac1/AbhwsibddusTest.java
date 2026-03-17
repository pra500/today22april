package pac1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;

public class AbhwsibddusTest {

    WebDriver driver;
    JavascriptExecutor js;

    @BeforeClass(alwaysRun = true)
    public void setup() {

        ChromeOptions options = new ChromeOptions();
        options.addArguments("headless");
        options.addArguments("incognito");
        // options.addArguments(");

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
        driver.manage().deleteAllCookies();
        //  driver.get("https://www.abhibus.com/");

        driver.get("https://www.saucedemo.com/");
        //nivaget
        //chromoptons


        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());

        System.out.println();
        driver.getWindowHandle();


        driver.getCurrentUrl();
        driver.getTitle();


    }

}
