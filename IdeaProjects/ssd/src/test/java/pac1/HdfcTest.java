package pac1;

import com.sun.jdi.request.DuplicateRequestException;
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

public class HdfcTest {

    WebDriver driver;
//    JavascriptExecutor js;

    @BeforeClass
    public void setup() {

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
        driver.manage().deleteAllCookies();
        //driver.get("https://www.hdfc.bank.in/");
       // driver.get("https://www.w3schools.com/graphics/svg_examples.asp");

        driver.get("https://www.cult.fit/");
    }

    @AfterClass
    public void teardown() {
        driver.quit();

    }

    // @Test(priority = 0)
    public void testvsdLoginTest() {

        driver.findElement(By.xpath("//ul[@class='options']//li//a[text()='GIGA']")).click();

        boolean services =
                driver.findElement(By.xpath("//label[text()='Services']")).isDisplayed();
        Assert.assertTrue(services);


    }

    //@Test(priority = 0)
    public void testxsvsdLoginTest() {
        System.out.println(driver.getCurrentUrl());

        System.out.println(driver.getWindowHandle());

        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl().contains("https://www.hdfc.bank.in/"));

        System.out.println(driver.getPageSource().contains("div"));


    }


    @Test(priority = 0)
    public void eleTest() {
        boolean search2=
     driver.findElement(By.xpath("//*[local-name()='svg' and @id='tnb-google-search-icon']")).isDisplayed();
Assert.assertEquals(true, search2);

    }


    @Test(priority = 0)
    public void elSeTest() {
        boolean search2=
                driver.findElement(By.xpath("//*[local-name()='svg' and @id='tnb-google-search-icon']")).isDisplayed();
        Assert.assertEquals(true, search2);

    }

    @Test(priority = 0)
    public void elSdxdeTest() {
        WebElement store=
        driver.findElement(By.xpath("//div//h5[text()='STORE']"));

        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(8));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div//h5[text()='STORE']")));
        String s=
store.getAttribute("class");
        System.out.println(s);



    }

    @Test(priority = 0)
    public void elSdxssdeTest() {
     //getattribute






    }
}


