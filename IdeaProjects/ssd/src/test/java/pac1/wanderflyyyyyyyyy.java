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

public class wanderflyyyyyyyyy {

    WebDriver driver;

    @BeforeClass
    public void setup() {

        ChromeOptions options=new ChromeOptions();
        options.addArguments("--disable-infobars");
        options.addArguments("--disable-extensions");
        options.addArguments("--start-maximized");
        options.addArguments("--window-size=1920, 1080");

       // options.addArguments("--disable-infobars");
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
        driver.manage().deleteAllCookies();
        driver.get("https://www.wanderfly.in/");
    }

        @AfterClass
        public void afterClass() {
            driver.quit();

        }

        @Test(priority = 0)
        public void startsavingTest() {

            //WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(8));
           // wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//a[text()='Start Saving'])[2]"))).click();

           boolean features= driver.findElement(By.xpath("(//a[text()='Features'])[1]")).isDisplayed();
            System.out.println(features);

        }

    @Test(priority = 0)
    public void startsssavingTest() {

        //WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(8));
        // wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//a[text()='Start Saving'])[2]"))).click();

        boolean features= driver.findElement(By.xpath("(//a[text()='Features'])[1]")).isDisplayed();
        System.out.println(features);

    }


    @Test(priority = 0)
    public void startssavingTest() {

        //WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(8));
        // wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//a[text()='Start Saving'])[2]"))).click();

        boolean features= driver.findElement(By.xpath("(//a[text()='Features'])[1]")).isDisplayed();
        System.out.println(features);

    }

       @Test(priority = 0)
    public void stardsdtssavingTest() {
        //WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(8));
        // wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//a[text()='Start Saving'])[2]"))).click();

        boolean features= driver.findElement(By.xpath("(//a[text()='Features'])[1]")).isDisplayed();
        System.out.println(features);

    }

    @Test(priority = 0)
    public void startsasvingTest() {

        //WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(8));
        // wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//a[text()='Start Saving'])[2]"))).click();

        boolean features= driver.findElement(By.xpath("(//a[text()='Features'])[1]")).isDisplayed();
        System.out.println(features);

    }




    @Test(priority = 0)
    public void startxssasvingTest() {











    }






}
