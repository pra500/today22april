package pac1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class OpencarftPaTest {


    WebDriver driver;

    @BeforeClass
    public void beforeClass() {

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");

        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
        driver.manage().deleteAllCookies();
        driver.get("https://www.opencart.com/");
        //driver.get("https://www.hdfc.com/");

    }

    @AfterClass
    public void afterClass() {
        driver.quit();
    }


    @Test
    public void seTest()
    {
        System.out.println(driver.getCurrentUrl());

        //  System.out.println(driver.getTitle());


    }

    @Test
    public void sseTest()
    {
        System.out.println(driver.getWindowHandle());

        //  System.out.println(driver.getTitle());


    }


    @Test
    public void sesTest() {

//
//        ChromeOptions co=new ChromeOptions();
boolean title=
        driver.getTitle().contains("OpenCart - Open Source Shopping Cart Solution");
        Assert.assertTrue(title);

    }


    @Test
    public void sessswTest() {

//
//        ChromeOptions co=new ChromeOptions();
        boolean title=
                driver.getTitle().contains("OpenCart - Open Source Shopping Cart Solution");
        Assert.assertTrue(title);

    }



    @Test
    public void sessTest() {
//
//        ChromeOptions co=new ChromeOptions();
        boolean title=
                driver.getTitle().contains("OpenCart - Open Source Shopping Cart Solution");
        Assert.assertTrue(title);

    }




}

