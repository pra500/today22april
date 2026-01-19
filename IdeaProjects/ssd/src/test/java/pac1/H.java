package pac1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

import javax.crypto.spec.OAEPParameterSpec;
import java.time.Duration;

public class H {


    WebDriver driver;


    @Test
    public void bbjhTest()
    {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("incognito");
        options.addArguments("--disable-notifications");
        options.addArguments("disable-popup-blocking");
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
        driver.manage().deleteAllCookies();
        driver.get("https://www.zepto.com/");
        System.out.println(driver.getTitle());
        System.out.println(driver.getTitle().contains("Welcome to Zepto, India's Fastest Online Grocery Delivery App! Get all your groceries delivered to you in")
        );

        driver.quit();



    }






    @Test
    public void bdbjhTest() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("incognito");
        options.addArguments("--disable-notifications");
        options.addArguments("disable-popup-blocking");
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
        driver.manage().deleteAllCookies();
        driver.get("https://www.zepto.com/");
        System.out.println(driver.getTitle());
        System.out.println(driver.getTitle().contains("Welcome to Zepto, India's Fastest Online Grocery Delivery App! Get all your groceries delivered to you in"));
        boolean b = driver.getTitle().contains("Welcome");

        System.out.println(b);
        Assert.assertTrue(b);

        driver.quit();

    }









    }




