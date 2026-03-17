package pac1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Cultpage {
//
//
//
//WebDriver driver;
//
//    Cultpage(WebDriver driver)
//    {
//        this.driver=driver;
//
//    }
//
//
//By sports= By.xpath("//h5[text()='SPORTS']");
//By = By.xpath("//h5[text()='SPORTS']");
//By sports= By.xpath("//h5[text()='SPORTS']");



    WebDriver driver;


    Cultpage(WebDriver driver)
    {
        this.driver=driver;


    }

    By sports=By.xpath("//h5[text()='SPORTS']");


    public void ge()

    {

        driver.findElement(sports).click();

    }


}
