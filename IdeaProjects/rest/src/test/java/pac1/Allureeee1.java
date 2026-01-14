package pac1;

import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Step;
import jdk.jfr.Description;
import org.testng.annotations.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


//import java.time.Duration;


import java.time.Duration;

public class Allureeee1 {

    WebDriver driver;

    @Test
    @Description("verify login page title")
    @Step("loginnn")
    @Severity(SeverityLevel.BLOCKER)
    public void eeTest() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
        driver.manage().deleteAllCookies();
        driver.get("https://practicetestautomation.com/practice-test-login/");
        System.out.println(driver.getTitle());
      //  driver.getTitle()
        
        String s=
        driver.getWindowHandle();
        System.out.println(s);

    }


}
