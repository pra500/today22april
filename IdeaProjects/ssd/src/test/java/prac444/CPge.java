package prac444;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CPge {


    WebDriver driver;

    CPge(WebDriver driver) {

        this.driver = driver;

    }



    By usrname = By.id("username");


    public void enteru() {
        driver.findElement(usrname).sendKeys("test");
    }

}
