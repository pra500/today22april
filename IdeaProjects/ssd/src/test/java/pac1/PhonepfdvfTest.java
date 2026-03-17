package pac1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class PhonepfdvfTest {

    WebDriver driver;


    @BeforeClass
    public void setup() {

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
        driver.manage().deleteAllCookies();
        //driver.get("https://juspay.io/in");

        //driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

//        driver.findElement(By.cssSelector(".IntegrationModal-viewDemoBtn")).click();
        driver.get("https://rahulshettyacademy.com/");

        driver.findElement(By.xpath("//span[text()='Close']")).click();
    }


    public void teardown() {
        driver.quit();

    }


    @Test
    public void meetupsTest() {

//        boolean b=
//       driver.findElement(By.xpath("//span[text()='Juspay raises $50 million in Series D follow-up.']")).isDisplayed();
//        System.out.println(b);

        String text =
                driver.findElement(By.xpath("(//a[text()='Meet ups'])[1]")).getText();
        System.out.println(text);
        Assert.assertEquals(text, "Meet ups");


    }


}


