package prac444;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Regissss {
    WebDriver driver;


    Regissss(WebDriver driver) {

        this.driver = driver;
    }

    By emaillll = By.id("email");
    By subject = By.id("subjects");

    public void enteremail() {
        driver.findElement(emaillll).sendKeys("ptgadd34@gmail.com");
    }

    public void entersubject() {
        driver.findElement(subject).sendKeys("test test test");

    }






}
