package pac1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class ExpliwaitTest {

    WebDriver driver;
    JavascriptExecutor js;

    @BeforeClass(alwaysRun = true)
    public void setup() {

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
        driver.manage().deleteAllCookies();
        driver.get("https://www.makemytrip.com/");
    }

    @AfterClass(alwaysRun = true)
    public void teardown() {

        driver.quit();
    }

    //1) Verify Home Page Loads Successfully
    @Test(priority = 0)
    public void logoandtitlevSerifyTest() {



        driver.findElement(By.xpath("//input[@placeholder='Enter Mobile Number']"));
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@placeholder='Enter Mobile Number']")));

    }




    //1) Verify Home Page Loads Successfully
    @Test(priority = 0)
    public void logoandtitlevSaerifyTest() {

        System.out.println(driver.getTitle().contains("MakeMyTrip - #1 Travel Website 50% OFF on Hotels, Flights & Holiday"));
       // driver.getTitle().contains("MakeMyTrip - #1 Travel Website 50% OFF on Hotels, Flights & Holiday");


    }
}

