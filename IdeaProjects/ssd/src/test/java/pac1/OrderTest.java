package pac1;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class OrderTest {
    WebDriver driver;

    @BeforeClass
    public void setup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(50));
        driver.get("https://developer.fastspring.com/docs/test-orders");
    }


    @AfterClass
    public void teardown() {
        driver.quit();

    }


    @Test(priority = 0)
    public void geTest() {

        driver.findElement(By.xpath("//div[text()='Search']")).click();
        driver.findElement(By.xpath("//input[@type='search']")).sendKeys("order");

        driver.findElement(By.xpath("//header//span[text()='Order Related Webhooks']")).click();

        String s = driver.findElement(By.xpath("//h1[text()='Order Related Webhooks']")).getText();
        System.out.println(s);
    }


    @Test(priority = 1)
    public void gddeTest() {
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getPageSource().contains("input"));

    }


    @Test(priority = 2)
    public void gdssdeTest() {
        System.out.println(driver.getWindowHandle());
     // driver.getWindowHandle()

List<WebElement> list=
        driver.findElements(By.xpath("//a"));
        System.out.println(list.size());


        List<WebElement> list2=
                driver.findElements(By.xpath("//img"));
        System.out.println(list2.size());

    }





    @Test(priority = 2)
    public void gdsddsdeTest() {





        // staleele
        //1 uri/path
        // pgm try catch finally combined
//nosuchele
//javaexe
        //before class uri


//        WebElement wb=
//        driver.findElement(By.xpath("//img[@class='rm-Logo-img Header-logo-img3YvV4lcGKkeb']"));
//
//        driver.navigate().refresh();
//
//        System.out.println(wb.isDisplayed());



//        WebElement wb=
//                driver.findElement(By.xpath("//img[@clddass='rm-Logo-img Header-loswwwsgo-img3YvV4lcGKkeb']"));
//
//        driver.navigate().refresh();
//
//        System.out.println(wb.isDisplayed());
//


        JavascriptExecutor js=(JavascriptExecutor)driver;
        js.executeScript("window.scddrofdfddfllBy(300, 400)", "");




    }


}

