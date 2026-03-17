package pac1;

import freemarker.core.NonStringOrTemplateOutputException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class LoginddedddTest {
    //  By loginid=By.id("")


//
//    cofig.properties - write   -   done
//    explicit practice
//    @datapro in api


    WebDriver driver;

    @BeforeClass
    public void setup() {

//
//        ChromeOptions co=new ChromeOptions();
//        co.addArguments("incognito");
//        co.addArguments("headless");
//        co.addArguments("disable-popup-blocking");
//        driver = new ChromeDriver(co);

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
        driver.manage().deleteAllCookies();
        //
        // driver.get("https://rahulshettyacademy.com/");
        //driver.get("https://www.wanderfly.in/");
        driver.get("https://practicetestautomation.com/practice-test-login/");
    }

    @AfterClass
    public void teardown() {
        driver.quit();
    }


    //@Test(priority = 0)
    public void teardoeeTest() {
        System.out.println(driver.getCurrentUrl());

    }



    //@Test(priority = 0)
    public void tesardoeeTest() {
        System.out.println(driver.getWindowHandle());
    }

    @Test(priority = 0)
    public void teardssoeeTest() {
        System.out.println(driver.getCurrentUrl());
    }





    @Test(priority = 0)
    public void teardsssoeeTest() {
        //System.out.println(driver.getCurrentUrl());

        //(//a[contains(text(), 'Practice')])[1]

        WebElement wb =
                driver.findElement(By.xpath("(//a[contains(text(), 'Practice')])[1]"));

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(8));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//a[contains(text(), 'Practice')])[1]")))
        ;
        String s =
                wb.getText();
        // System.out.println(s);
        Assert.assertEquals(s, "PRACTICE");

    }

/*
owner: Pragti
desciption: title of the page
functionality: verifying the title of the page
 */


   @Test(priority = 0)
    public void teardsssssoeeTest() {
        System.out.println(driver.getWindowHandle());
    //  driver.getWindowHandle()

    }


    @Test(priority = 0)
    public void teardSSsssssoeeTest() throws InterruptedException {
      driver.get("https://www.cult.fit/");
      Thread.sleep(8000);

List<WebElement> list=
driver.findElements(By.xpath("//a"));
        System.out.println(list.size());

        for(int i=0;i<=list.size()-1;i++)
        {
            System.out.println(list.get(i).getText());

        }

    }








}
