package pac1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginnnnnnPage {

    WebDriver driver;

    LoginnnnnnPage(WebDriver drive) {
        this.driver = driver;

    }

    By pass = By.id("password");
    By loginbtn = By.id("submit-login");

    public void enteruse() {

       // driver.findElement(us).sendKeys("admin");

    }

    public void enterpass() {

        driver.findElement(pass).sendKeys("admin@q123");

    }


    public void enterpssssassclick() {

        driver.findElement(loginbtn).click();

    }


}


