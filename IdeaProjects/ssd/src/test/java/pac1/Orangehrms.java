package pac1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class Orangehrms {

    WebDriver driver;


    @BeforeClass
    public void setup() {

        ChromeOptions options = new ChromeOptions();
        options.addArguments("disable-popup-blocking");
        //  options.addArguments("ac

        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
        driver.manage().deleteAllCookies();
        //driver.get("https://juspay.io/in");

        // driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

//        driver.findElement(By.cssSelector(".IntegrationModal-viewDemoBtn")).click();


        //driver.get("https://rahulshettyacademy.com/");


        driver.get("https://codepen.io/search/pens?q=svg%20chart");


    }


    public void teardown() {
        driver.quit();

    }

    // @Test
    public void menuTest() {

//        boolean b=
//       driver.findElement(By.xpath("//span[text()='Juspay raises $50 million in Series D follow-up.']")).isDisplayed();
//        System.out.println(b);

        String s =

                driver.findElement(By.xpath("//img[@alt='company-branding']")).getAttribute("alt");
        System.out.println(s);


    }


    //@Test
    public void mendduTest() {

//        boolean b=
//       driver.findElement(By.xpath("//span[text()='Juspay raises $50 million in Series D follow-up.']")).isDisplayed();
//        System.out.println(b);


    }


    @Test
    public void titleTest() {

        String title = driver.getTitle();
        Assert.assertEquals(title, "CodePen Search");
    }


    @Test
    public void pageurlTest() {
        String url= driver.getCurrentUrl();
        Assert.assertEquals(url, "https://codepen.io/search/pens?q=svg%20chart");

    }




}
