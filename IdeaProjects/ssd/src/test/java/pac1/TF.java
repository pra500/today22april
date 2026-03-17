package pac1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class TF {

    public static WebDriver driver;


    public static void main(String[] args) {

        ChromeOptions options = new ChromeOptions();
        options.addArguments("incognito");
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
        driver.manage().deleteAllCookies();
        // driver.get("https://www.opencart.com/");
        //driver.get("https://beeceptor.com/");
        driver.get("https://www.joshwcomeau.com/svg/friendly-introduction-to-svg/");

        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());





    }
}
