package pac1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Ypage {

    WebDriver driver;

    Ypage(WebDriver driver)
    {
        this.driver=driver;
    }

    //      //input[@placeholder='First Name']
    By firstname= By.xpath("//input[@placeholder='First Name']");


public  void getfd()
{
driver.findElement(firstname).sendKeys("test");




}









}




