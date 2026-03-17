package pac1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

import java.time.Duration;

public class paytmsddTest {


     WebDriver driver;



    @BeforeClass
    public void setup() {


        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
        driver.manage().deleteAllCookies();
      //  driver.get("https://www.wanderfly.in/");

        driver.get("https://jsonformatter.org/");




    }

    @AfterClass

    public void teardown() {

        driver.close();
    }
/*
    @Test(priority = 1, invocationCount = 3)
    public void GeTest() {

        System.out.println(driver.getCurrentUrl());

    }



    @Test(priority = 2, invocationCount = 3)
    public void GewwTest() {

        System.out.println(driver.getWindowHandle());

    }


    @Test(priority = 3, invocationCount = 3)
    public void logoTest() {

boolean flag=
       driver.findElement(By.xpath("(//img[@alt='Wanderfly Logo'])[1]")).isDisplayed();
        Assert.assertTrue(flag);



    }


    @Test(priority = 3, invocationCount = 3)
    public void sfvTest() {

        boolean flag1=
        driver.findElement(By.xpath("//div[contains(text(), '©')]")).isDisplayed();
        Assert.assertTrue(flag1);
    }




    @Test(priority = 3, invocationCount = 3)
    public void asdvest() {

        boolean flag1=
                driver.findElement(By.xpath("//div[contains(text(), '©')]")).isDisplayed();
        Assert.assertTrue(flag1);
    }



*/



    @Test
    public void asdvest() {
        System.out.println(driver.getCurrentUrl().contains("http"));
      //  driver.getCurrentUrl().contains("http");

    }


}
