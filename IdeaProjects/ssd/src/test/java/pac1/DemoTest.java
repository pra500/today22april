package pac1;


import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class DemoTest {

    WebDriver driver;

    @BeforeClass
    public void setup() {
        ChromeOptions options = new ChromeOptions();
        //options.addArguments("--disabelpopup-blocking");
        options.addArguments("--headless");
        // options.addArguments("--disable-autofilled");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        // driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
        driver.manage().deleteAllCookies();
        driver.get("https://demowebshop.tricentis.com/apparel-shoes");
        // driver.get("https://demowebshop.tricentis.com/apparel-shoes");

    }


    @AfterClass
    public void teardown() {


        driver.quit();
    }

    @Test
    public void TSdTest() {

        driver.findElement(By.xpath("(//a[@href='/computers'])[1]")).click();
        //driver.findElement(By.xpath("(//a[@href='/computers'])[1]")).click();
        Assert.assertEquals(driver.getCurrentUrl(), "https://demowebshop.tricentis.com/computers");


        driver.findElement(By.xpath("(//a[normalize-space()='Electronics'])[1]")).click();
        Assert.assertEquals(driver.getCurrentUrl(), "https://demowebshop.tricentis.com/electronics");


        driver.findElement(By.xpath("(//a[normalize-space()='Apparel & Shoes'])[1]")).click();
        Assert.assertEquals(driver.getCurrentUrl(), "https://demowebshop.tricentis.com/apparel-shoes");

    }


    @Test
    public void TdSdTest() {

        try {

            driver.findElement(By.xpath("//input[starts-with(@id, 'small-searchterms')]"))
                    .sendKeys("computer");

            Thread.sleep(5000);
            driver.findElement(By.xpath("//ul//li//a[text()='Build your own cheap computer']")).click();
            ;

            String text =
                    driver.findElement(By.xpath("//h1[normalize-space()='Build your own cheap computer']")).getText();
            boolean b =
                    text.contains("computer");
            Assert.assertTrue(b);


//            String text = driver.findElement(By.xpath("//a[text()='Build your own cheap computer']")).getText();
//            boolean b =
//                    text.contains("computer");
//
//            Assert.assertTrue(b);

            driver.navigate().back();


            driver.findElement(By.xpath("//input[starts-with(@id, 'small-searchterms')]"))
                    .sendKeys("laptop", Keys.ENTER);


            Thread.sleep(5000);
            driver.findElement(By.xpath("//a[text()='14.1-inch Laptop']"));

            //  String text12 = driver.findElement(By.xpath("//a[text()='14.1-inch Laptop']")).getText();


            boolean b1 =
                    text.contains("Laptop");

            Assert.assertTrue(b1);


            driver.findElement(By.xpath("//input[starts-with(@id, 'small-searchterms')]"))
                    .sendKeys(Keys.ENTER);

            Alert alt =
                    driver.switchTo().alert();
            System.out.println();
            Assert.assertEquals(alt.getText(), "Please enter some search keyword");
            alt.accept();


        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}