package pac1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class pGSEEE {

    WebDriver driver;

    pGSEEE( WebDriver driver)
    {

        this.driver=driver;

    }


    By lname=By.name("lastname");


    public void enternamee()
    {

driver.findElement(lname).sendKeys("rao");
    }
}
