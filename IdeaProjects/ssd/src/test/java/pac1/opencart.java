package pac1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class opencart {


    WebDriver driver;


    @BeforeClass
    public void setup() {

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
        driver.manage().deleteAllCookies();
        driver.get("https://www.opencart.com/");


    }


    public void teardown() {
        driver.quit();

    }

    @Test
    public void menuTest() {

        int size =
                driver.findElements(By.xpath("//ul[@class='nav navbar-nav']")).size();
        System.out.println(size);
        if (size == 1) {
            System.out.println("correct size");
        } else {
            System.out.println("incorrect size");
        }


    }

    @Test
    public void loginTest() {

        boolean login =
                driver.findElement(By.xpath("(//a[text()='Login'])[2]")).isDisplayed();
        Assert.assertTrue(login);
    }

    @Test
    public void copyrightTest() {

        boolean copyright =
                driver.findElement(By.xpath("//li[normalize-space()='© Copyright 2026 OpenCart']")).isDisplayed();
        Assert.assertTrue(copyright);
    }


}
