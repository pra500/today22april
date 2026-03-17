package pac1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class Uber {

    WebDriver driver;
    JavascriptExecutor js;


    @BeforeClass
    public void setup()
    {

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        // driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
        driver.manage().deleteAllCookies();
        driver.get("https://www.wanderfly.in/");


    }

    @AfterClass
    public void teardown(){
        driver.quit();
    }


   @Test
    public void geeTestI()
    {
        System.out.println( driver.getTitle());
        driver.getTitle();

        driver.findElement(By.xpath("(//a[contains(text(), 'Job search')])[1]")).click();

        driver.findElement(By.xpath("(//a[contains(text(), 'Job search')])[1]"));

    }
}
