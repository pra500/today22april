package pac1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;
import java.util.SortedSet;

public class TryyyyyyTest {

//
//
//    hasSize()/hasLength()
//
//    contains() vs containsInAnyOrder() vs hasItem() vs hasItems()
//
//
//    chromeoptions
//    "value"
//    get 5 func


    WebDriver driver;
//    JavascriptExecutor js;

    @BeforeClass
    public void setup() {
//
//        ChromeOptions options = new ChromeOptions();
//        // options.addArguments("headless");
//        options.addArguments("incognito");
//        options.addArguments("--disable-gpu");
//        options.addArguments("--disable-autofilled");
//        options.addArguments("--disable-chrome-extensions");
//        options.addArguments("--start-maximized");
//        options.addArguments("--window-size=1920,1080");


        driver = new ChromeDriver();
         driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
        driver.manage().deleteAllCookies();
       // driver.get("https://proleed.academy/exercises/selenium/automate-the-signup-form-using-selenium-webdriver.php");
        //driver.get("https://the-internet.herokuapp.com/dropdown");
        driver.get("https://www.cult.fit/");
    }


    @AfterClass
    public void teardown() {
        driver.quit();

    }

    //@Test(priority = 0)
    public void urlTest() {
//        String url =
//                driver.getCurrentUrl();
//
//
//
//        System.out.println(url);


        driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("sd");

        String s =
                driver.findElement(By.xpath("//input[@name='firstname']")).getAttribute("value");
        Assert.assertEquals(s, "sd");


        //  driver.findElement(By.xpath("//input[@name='firstname']")).getAttribute("")


    }


   // @Test(priority = 0)
    public void dfgTest() {

        // Website: https://the-internet.herokuapp.com/dropdown
        //Goal: Select option and verify selection (5 minutes)

        WebElement selectdd=
        driver.findElement(By.xpath("//select[@id='dropdown']"));

        Select sel=new Select(selectdd);
        sel.selectByVisibleText("Option 1");
List<WebElement> list=
        sel.getOptions();
        System.out.println(list.size());

   }


    @Test(priority = 0)
    public void dfddgTest() {
String s= driver.getWindowHandle();
        System.out.println(s);

        String url=
        driver.getCurrentUrl();
        System.out.println(url);

        int size=
        driver.findElements(By.xpath("//a")).size();
        System.out.println(size);

        int size1=
                driver.findElements(By.xpath("//img")).size();
        System.out.println(size1);


        int size2=
                driver.findElements(By.xpath("//table")).size();
        System.out.println(size2);


        int size3=
                driver.findElements(By.xpath("//div")).size();
        System.out.println(size3);


        int size4=
                driver.findElements(By.xpath("//div")).size();
        System.out.println(size4);

    }
}




