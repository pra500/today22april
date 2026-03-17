package prac444;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Regispage {

WebDriver driver;

    Regispage(WebDriver driver)
    {

        this.driver=driver;
    }
    //
    //

    By userr= By.name("firstname");


    public void getusername() {
        driver.findElement(userr).sendKeys("admin");




    }



}
