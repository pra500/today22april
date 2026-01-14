package pac12dec;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class Gy {


    //5 remaining

    WebDriver driver;


    @AfterClass
    public void afterClass() {


        driver.quit();


    }

    @BeforeClass
    public void beforeClass() {
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
        driver.manage().deleteAllCookies();
        driver.get("https://www.makemytrip.com/");


    }

    @Test
    public void cTest() {

        boolean list =
                driver.findElement(By.xpath("//div[@class='specialFareTitle']")).isDisplayed();
        System.out.println(list);


        boolean b =
                driver.findElement(By.xpath("//span[@class='chNavIcon appendBottom2 chSprite chBuses inactive']")).isDisplayed();
        Assert.assertTrue(b);

        boolean b1 =
                driver.findElement(By.xpath("(//span[starts-with(normalize-space(), 'Buses')])[1]")).isDisplayed();
        Assert.assertTrue(b1);


    }


    @Test
    public void csdsTest() {
        boolean list =
                driver.findElement(By.xpath("//ul[@class='sliderItem-benefits']")).isDisplayed();
        System.out.println(list);

    }

    @Test
    public void cseeedsTest() {
        String list =
                driver.findElement(By.xpath("//ul[@class='sliderItem-benefits']")).getText();
        System.out.println(list);

    }


    @Test
    public void csdesTest() {

        String list =
                driver.findElement(By.xpath("//ul[@class='sliderItem-benefits']")).getAttribute("class");
        System.out.println(list);

    }

    @Test
    public void cseedsTest() {
        boolean list =
                driver.findElement(By.xpath("//ul[@class='sliderItem-benefits']")).isDisplayed();
        System.out.println(list);











    }

}
