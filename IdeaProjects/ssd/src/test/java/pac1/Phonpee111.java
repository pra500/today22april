package pac1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class Phonpee111 {

    WebDriver driver;

    @BeforeClass
    public void setup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
        driver.manage().deleteAllCookies();
        driver.get("https://www.phonepe.com/");
    }


    @AfterClass
    public void afterClass() {
        driver.quit();

    }

    @Test(priority = 0)
    public void startsavingTest() {

        //WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(8));
        // wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//a[text()='Start Saving'])[2]"))).click();

        WebElement oursolutions=
         driver.findElement(By.xpath("//div[@id='our-solutions']"));

        WebElement paymentgateway=
                driver.findElement(By.xpath("//div//span[text()='Payment Gateway']"));


Actions actions=new Actions(driver);
actions.moveToElement(oursolutions).click(paymentgateway).build().perform();

String url=
driver.getCurrentUrl();
        Assert.assertEquals(url, "https://business.phonepe.com/payment-gateway");




















    }





}
