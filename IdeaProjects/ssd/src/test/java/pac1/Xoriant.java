package pac1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class Xoriant {


    WebDriver driver;


    @BeforeClass
    public void setup() {

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
        //  driver.manage().deleteAllCookies();
        driver.get("https://www.xoriant.com/");

        driver.findElement(By.xpath("//button[text()='Accept all cookies']")).click();
        driver.findElement(By.xpath("//span[@class='close-flash']")).click();


    }

@AfterClass
    public void teardown() {
        driver.quit();

    }

    @Test
    public void menuTest() {
        Assert.assertTrue(driver.getTitle().contains("Digital Engineering and Enterprise Solution Company | Xoriant"));


    }


    @Test
    public void bacdscestTest() {
        Assert.assertTrue(driver.getTitle().contains("Dig"));


    }


}
