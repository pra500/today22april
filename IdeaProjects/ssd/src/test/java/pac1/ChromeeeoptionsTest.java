package pac1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class ChromeeeoptionsTest {


    WebDriver driver;
    JavascriptExecutor js;

    @BeforeClass(alwaysRun = true)
    public void setup() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        options.addArguments("--autofill-disabled=true");

        driver = new ChromeDriver(options);
        //driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
        driver.manage().deleteAllCookies();
        //  driver.get("https://www.abhibus.com/");

        //driver.get("https://www.yatra.com/");

        driver.get("https://slice.bank.in/");
    }

    @AfterClass(alwaysRun = true)
    public void teardown() {

        driver.quit();
    }

    //1) Verify Home Page Loads Successfully
    @Test(priority = 0)
    public void logoandtitlevSerifyTest() {

        System.out.println(driver.getTitle());
    }



    @Test(priority = 0)
    public void logoandtditlevSerifyTest() {

        boolean b=
driver.findElement(By.xpath("//a[text()='Savings account']")).isDisplayed();
        System.out.println(b);


        boolean b2=
                driver.findElement(By.xpath("//a[text()='UPI Credit Card']")).isDisplayed();
        System.out.println(b2);


//        boolean web2=
//                driver.findElement(By.xpath("//button[text()='Get slice']")).isDisplayed();
//        System.out.println(web2);



        boolean b2ww=
                driver.findElement(By.xpath("//a[text()='UPI Credit Card']")).isDisplayed();
        System.out.println(b2ww);






    }




}
