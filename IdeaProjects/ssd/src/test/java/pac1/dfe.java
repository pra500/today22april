package pac1;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class dfe {

    WebDriver driver;

   @BeforeClass
   public void setup()
    {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(50));
        driver.get("https://cred.club/");
    }




@AfterClass
public void teardown()
{
driver.quit();
}


@Test(priority = 0)
public void geTest()
{
    Dimension d=
    driver.findElement(By.xpath("(//div//a[text()='privacy policy'])[1]")).getSize();
    System.out.println(d.getWidth());


    System.out.println(driver.getTitle());

}

}
