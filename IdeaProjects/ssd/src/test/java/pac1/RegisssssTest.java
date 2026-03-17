package pac1;

import com.fasterxml.jackson.databind.annotation.JsonAppend;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

public class RegisssssTest {


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
        driver.get("https://demoqa.com/automation-practice-form");


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


        String filepath = "C:\\Users\\pragt\\IdeaProjects\\ssd\\src\\test\\resources\\a.properties";
        FileInputStream fip = new FileInputStream(filepath);
        Properties prop = new Properties();
        prop.load(fip);

        System.out.println(prop.getProperty("MobileNumber"));
        System.out.println(prop.getProperty("dateOfBirthInput"));

//        driver.findElement(By.id("firstName")).clear();
//        driver.findElement(By.id("firstName")).sendKeys(prop.getProperty("FirstName"));
//
//        driver.findElement(By.id("lastName")).clear();
//        driver.findElement(By.id("lastName")).sendKeys(prop.getProperty("LastName"));
//
//        driver.findElement(By.id("userNumber")).clear();
//        driver.findElement(By.id("userNumber")).sendKeys(prop.getProperty("MobileNumber"));

        driver.findElement(By.id("dateOfBirthInput")).clear();
        driver.findElement(By.id("dateOfBirthInput")).sendKeys(prop.getProperty("dateOfBirthInput"));


   }
}
