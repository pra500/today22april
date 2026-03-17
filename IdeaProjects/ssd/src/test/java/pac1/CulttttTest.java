package pac1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class CulttttTest {

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
        driver.get("https://restful-api.dev/");
    }

    @AfterClass
    public void teardown() {
        driver.quit();
    }
//
//
//    @Test(priority = 0)
//    public void teardoee(){
//
//    WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(6));
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("")));
//
//
//
//
//}
//
//
//
//
//
//
//
//    @Test(priority = 0)
//
//        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(6));
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(""))
//
//    }
//
//@Test(priority = 0)
//
//WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(6));
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(""))
//
//        }


}


