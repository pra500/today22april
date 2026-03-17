package pac1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class Cdd {

    WebDriver driver;

    //@BeforeClass
    public void setup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
        driver.manage().deleteAllCookies();


        driver.get("https://codepen.io/search/pens?q=svg%20chart");


    }



    @BeforeClass
    public void sestup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
        driver.manage().deleteAllCookies();
        driver.get("https://lovable.dev/");
        driver.getTitle().contains("Lovable - Build Apps & Websites with AI, Fast | No Code App Builder");


    }

    public void teardown() {
        driver.quit();

    }


    @Test(priority = 0)
    public void cDDddTest() {

        String title = driver.getTitle();
        Assert.assertEquals(title, "CodePen Search");

    }


    @Test(priority = 1)
    public void cDDdsdsdddTest() {
        driver.findElement(By.xpath("//input[@type='search']")).sendKeys("circle");
      boolean b=  driver.findElement(By.xpath("//div//a[contains(text(), 'Search')]")).isDisplayed();

        System.out.println(b);



    }
    @Test(priority = 1)
    public void cDDdddsdddTest() {

        String url = driver.getCurrentUrl();

        Assert.assertEquals(url, "https://codepen.io/search/pens?q=svg%20chart");

    }





}
