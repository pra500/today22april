package wrongscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class Wrong2 {

    WebDriver driver;

//    @Test
//    public void testvsdLoginTest() {
//
//        driver.findElement(By.id("uid")).sendKeys("admin");
//    }
//
//    @BeforeMethod
//    public void setup() {
//
//        driver = new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
//        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
//        driver.manage().deleteAllCookies();
//        driver.get("https://demo.testfire.net/login.jsp");
//
//
//    }



    @Test
 public void testvsdLoginTest() {


        driver = new ChromeDriver();
        driver.manage().window().maximize();
      //  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
        driver.manage().deleteAllCookies();
        driver.get("https://www.highcharts.com/demo");


        WebElement point = driver.findElement(By.xpath("//*[local-name()='svg']//*[name()='rect']"));
        point.click();


        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        wait.until(ExpectedConditions.elementToBeClickable(
                driver.findElement(By.id("loginBtn"))
        )).click();






        driver.quit();


    }

}


