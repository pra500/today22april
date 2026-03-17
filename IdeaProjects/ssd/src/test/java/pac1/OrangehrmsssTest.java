package pac1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class OrangehrmsssTest {

    WebDriver driver;


    @BeforeClass
    public void a() {
        ChromeOptions co=new ChromeOptions();
        co.addArguments("heaadless");
        driver = new ChromeDriver(co);
        driver.manage().window().maximize();
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
        driver.manage().deleteAllCookies();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

    }


    @AfterClass
    public void tear() {
        driver.quit();

    }



@Test
public void eeTest()
{
    WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(7));
    WebElement wb=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='username']")));
    Assert.assertTrue(wb.isDisplayed());

    WebDriverWait wait1=new WebDriverWait(driver, Duration.ofSeconds(7));
    WebElement wb1=wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='password']")));
    Assert.assertTrue(wb1.isDisplayed());

    WebDriverWait wait2=new WebDriverWait(driver, Duration.ofSeconds(7));
    WebElement login=
wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[contains(normalize-space(), 'Login')]")));
login.click();






}




}
