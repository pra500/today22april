package pac1;

import freemarker.core._ArrayEnumeration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RgPage {

    // https://proleed.academy/exercises/selenium/automate-the-signup-form-using-selenium-webdriver.php

    WebDriver driver;

    RgPage(WebDriver driver){
        this.driver=driver;
    }


    By date=By.id("date");



    public void enterdate()
    {
        driver.findElement(date).sendKeys("04/06/2028");
    }



}
