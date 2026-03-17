package pac1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class TitleTest {

   WebDriver driver;

    @BeforeClass
    public void setup() {

//        ChromeOptions options = new ChromeOptions();
//        options.addArguments("disable-popup-blocking");
//        //  options.addArguments("ac

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
        driver.manage().deleteAllCookies();
        driver.get("https://www.opencart.com/");

//        driver.findElement(By.cssSelector(".IntegrationModal-viewDemoBtn")).click();


        // driver.get("https://www.opencart.com/");


    }

    @AfterClass
    public void teardown() {
        driver.quit();

    }


    @Test
    public void menuTest() {

   boolean b=driver.findElement(By.xpath("//h2[text()='Community Support']")).isDisplayed();
Assert.assertTrue(b);

        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(8));
        WebElement wb=
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='Login']")));
    boolean b11=wb.isDisplayed();
Assert.assertTrue(b11);


//
//        WebElement wb=
//        driver.findElement(By.xpath("//a[text()='Login']"));
//
//        String url=
//        driver.getCurrentUrl();
//                //.contains("https://www.opencart.com/index.php?route=account/login");
//
//Assert.assertEquals(url, "https://www.opencart.com/index.php?route=account/login");
//

//       boolean b1=driver.findElement(By.xpath("//a[text()='Login']")).isDisplayed();
//        Assert.assertTrue(b1);
//
// boolean b2=driver.findElement(By.xpath("(//a[text()='Register'])[2]")).isDisplayed();
//Assert.assertTrue(b2);
//



    }
}
