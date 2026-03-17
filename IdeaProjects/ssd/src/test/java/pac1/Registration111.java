package pac1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.Properties;

public class Registration111 {

    WebDriver driver;

    @BeforeClass
    public void setup() {

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
        driver.manage().deleteAllCookies();
        driver.get("https://www.tutorialspoint.com/selenium/practice/selenium_automation_practice.php");

    }



        @AfterClass
    public void teardown() {
        driver.quit();


    }

    @Test
    public void menuTest() {
//
//        firstname=Tom
//        email=pra333@gmail.com
//                mobile=9090889900
//        dob=12/19/2022


        String filepath="C:\\Users\\pragt\\IdeaProjects\\ssd\\src\\test\\resources\\ffd.properties";

        Properties prop = new Properties();

        
        
        
        
        String fir=prop.getProperty("firstname");
       String em= prop.getProperty("email");
        String mob=prop.getProperty("mobile");
     String dob=prop.getProperty("dob");



//
//        driver.findElement(By.id("name")).sendKeys(fir);
//        driver.findElement(By.id("email")).sendKeys(em);
//
//        driver.findElement(By.id("mobile")).sendKeys(mob);
//        driver.findElement(By.id("dob")).sendKeys(dob);
//
//
//






        






















    }
}
