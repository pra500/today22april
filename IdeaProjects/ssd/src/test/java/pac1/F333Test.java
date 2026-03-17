package pac1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class F333Test
{

    WebDriver driver;

@BeforeClass
public void setup()
{
    driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().deleteAllCookies();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
    driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(50));
    driver.get("https://juspay.io/in");
}


@AfterClass
public void teardown()
{
    driver.quit();
}

@Test(priority = 0)
public void geTest()
{
  boolean b=
    driver.findElement(By.xpath("(//img[@alt='Juspay'])[1]")).isDisplayed();
    System.out.println(b);

    boolean bd=
            driver.findElement(By.xpath("//span[normalize-space()='Products']")).isDisplayed();
    System.out.println(bd);

    boolean b33=
            driver.findElement(By.xpath("//span[normalize-space()='Juspay expands to the Middle East with new regional headquarters in Dubai!']")).isDisplayed();
    System.out.println(b33);


    boolean b33ww=
            driver.findElement(By.xpath("//span[normalize-space()='India']")).isDisplayed();
    System.out.println(b33ww);

    boolean b3355=
            driver.findElement(By.xpath("//a[normalize-space()='Contact us']")).isDisplayed();
    System.out.println(b3355);


//a[normalize-space()='Contact us']


}





}
