package pac1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisPage {

    WebDriver driver;

    RegisPage(WebDriver driver) {

        this.driver = driver;

    }

    By firstname = By.id("name");

    By email = By.id("email");

    By mobile = By.id("mobile");

    public void enteruser() {


        driver.findElement(firstname).sendKeys("test");


    }


    public void enterpass() {

        driver.findElement(email).sendKeys("test@1233");
    }


    public void entermobile() {


        driver.findElement(mobile).sendKeys("9009334455 ");
    }


}
