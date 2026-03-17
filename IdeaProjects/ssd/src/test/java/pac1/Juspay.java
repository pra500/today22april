package pac1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class Juspay {


    WebDriver driver;


    @BeforeClass
    public void setup() {

        ChromeOptions options = new ChromeOptions();
        options.addArguments("disable-popup-blocking");
        //  options.addArguments("ac

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
        driver.manage().deleteAllCookies();
        //driver.get("https://juspay.io/in");

        driver.get("https://www.wanderfly.in/");

//        driver.findElement(By.cssSelector(".IntegrationModal-viewDemoBtn")).click();


    }


    public void teardown() {
        driver.quit();

    }

   @Test
    public void menuTest() {

//        boolean b=
//       driver.findElement(By.xpath("//span[text()='Juspay raises $50 million in Series D follow-up.']")).isDisplayed();
//        System.out.println(b);




       driver.findElement(By.xpath("//span[starts-with(text(), 'Take the Quiz Now')]")).click();




/*
       WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
       wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='truncate']"))).click();

      // driver.findElement(By.xpath("//span[@class='truncate']")).click();



       driver.findElement(By.xpath("//div//p[text()='This is fine.']")).click();
       driver.findElement(By.xpath("//span[text()='Next']")).click();

*/


   }




/*
    //@Test
    public void startnowTest() {

        boolean b=
                driver.findElement(By.xpath("//button[contains(text(), 'Start Now')]")).isDisplayed();
        System.out.println(b);
        Assert.assertTrue(b);

    }



   // @Test
    public void staddrtnowTest() {

        boolean b=
                driver.findElement(By.xpath("//button[contains(text(), 'Start Now')]")).isDisplayed();
        System.out.println(b);
        Assert.assertTrue(b);

    }


 //   @Test
    public void startssnowTest() {

        boolean b=
                driver.findElement(By.xpath("//button[contains(text(), 'Start Now')]")).isDisplayed();
        System.out.println(b);
        Assert.assertTrue(b);

    }

    //@Test
    public void staxzrtnowTest() {

        boolean b=
                driver.findElement(By.xpath("//button[contains(text(), 'Start Now')]")).isDisplayed();
        System.out.println(b);
        Assert.assertTrue(b);

    }

   // @Test
    public void starsstnowTest() throws InterruptedException {

        boolean b=
                driver.findElement(By.xpath("//button[contains(text(), 'Start Now')]")).isDisplayed();
        System.out.println(b);
        Assert.assertTrue(b);

        WebElement products=
        driver.findElement(By.xpath("//span[starts-with(normalize-space(), 'Products')]"));



    }
*/



}