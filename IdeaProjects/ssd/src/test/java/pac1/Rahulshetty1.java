package pac1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.time.Duration;
import java.util.Properties;

public class Rahulshetty1 {


    WebDriver driver;
    Properties prop;
    Properties prop1;
    String filepath = "C:\\Users\\pragt\\IdeaProjects\\ssd\\src\\test\\resources\\G.properties";


    @BeforeClass
    public void setup() throws Exception {

        // String filepath="C:\\Users\\pragt\\IdeaProjects\\ssd\\src\\test\\resources\\G.properties";
        FileInputStream fip = new FileInputStream(filepath);
        prop = new Properties();
        String url = prop.getProperty("url");


        ChromeOptions options = new ChromeOptions();
        options.addArguments("disable-popup-blocking");
        //  options.addArguments("ac

        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
        driver.manage().deleteAllCookies();
        driver.get(url);

        //driver.get("https://juspay.io/in");
        // driver.get("https://paytm.com/");

//        driver.findElement(By.cssSelector(".IntegrationModal-viewDemoBtn")).click();

    }


    public void teardown() {
        driver.quit();

    }

    @Test
    public void menuTest() {

        String firstname = prop.getProperty("fir");
        String lastname = prop.getProperty("last");

        driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys(firstname);
        driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys(lastname);

    }


    @Test
    public void menu1Test() throws Exception {

//        String firstname= prop.getProperty("fir");
//        String lastname=  prop.getProperty("last");
//
//        driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys(firstname);
//        driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys(lastname);
//
        FileOutputStream fop = new FileOutputStream(filepath);
        prop1 = new Properties();

    }
}

