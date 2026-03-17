package pac1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

public class Make {

    WebDriver driver;

    Make(WebDriver driver) {

        this.driver = driver;

    }

    By search = By.xpath("//input[@placeholder='Search']");
    By documentation = By.xpath("//a[starts-with(text(), 'Documentation')]");
    By logo = By.xpath("//img[@alt='Beeceptor-Logo']");


    public void verifysearch() {
        driver.findElement(search).sendKeys("java", Keys.ENTER);
    }


    public boolean verifydocumentation() {

        boolean b = driver.findElement(documentation).isDisplayed();
        return b;
    }

    public boolean verifylogo() {

        boolean b = driver.findElement(logo).isDisplayed();
        return b;

    }


}








