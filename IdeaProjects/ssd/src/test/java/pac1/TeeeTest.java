package pac1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;

public class TeeeTest {

    WebDriver driver;

    @BeforeClass
    public void setup() {

//        ChromeOptions options = new ChromeOptions();
//        options.addArguments("disable-popup-blocking");
//        //  options.addArguments("ac

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
        driver.manage().deleteAllCookies();
        driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");


//        driver.findElement(By.cssSelector(".IntegrationModal-viewDemoBtn")).click();


        // driver.get("https://www.opencart.com/");


    }

    @AfterClass
    public void teardown() {
        driver.quit();


    }


    @Test
    public void menuTest() throws Exception {

//
//        FirstName=pragti
//        LastName=gupta
//        MobileNumber=9054590000
//        dateOfBirthInput=12 Feb 2026

//
//        String filepath = "C:\\Users\\pragt\\IdeaProjects\\ssd\\src\\test\\resources\\a.properties";
//        FileInputStream fip = new FileInputStream(filepath);
//        Properties prop = new Properties();
//        prop.load(fip);

        boolean b = driver.getCurrentUrl().contains("http");
        Assert.assertTrue(b);


        boolean b1 = driver.getTitle().contains("Account Login");
        Assert.assertTrue(b1);

        boolean b2 =
                driver.findElement(By.xpath("//input[@name='search']")).isDisplayed();
        Assert.assertTrue(b2);

        boolean b3 =
                driver.findElement(By.xpath("//a[text()='Desktops']")).isDisplayed();
        Assert.assertTrue(b3);

        boolean b4 =
                driver.findElement(By.xpath("//img[@alt='naveenopencart']")).isDisplayed();
        Assert.assertTrue(b4);

    }
    @Test
    public void loDDginTest(){
        //System.out.println(driver.findElements(By.tagName("a")).size());

        System.out.println(driver.findElements(By.tagName("img")).size());




    }
}

