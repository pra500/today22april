package pac1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class Ora {
    //nosuch java stale


    WebDriver driver;
    JavascriptExecutor js;

    @BeforeClass
    public void setup() {

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
        driver.manage().deleteAllCookies();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

    }


    @AfterClass
    public void teardown() {
        driver.quit();

    }

    @Test
    public void testvsdLoginTest() {

        driver.findElement(By.xpath("//input[@name='userdssname']")).sendKeys("admin");

    }

    @Test
    public void testvsdLoginssdTest() {

        WebElement w=
        driver.findElement(By.xpath("//input[@name='userdssname']"));
        w.sendKeys("admin");


        driver.navigate().refresh();

     boolean b=   w.isDisplayed();

        System.out.println(b);

    }


    @Test
    public void testvssdLoginssdTest() {

        driver.findElement(By.xpath("//input[@name='userdssname']")).sendKeys("admin");
        System.out.println();

        driver.navigate().refresh();
        driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");

    }



    //@Test
    public void testvssdLsoginssdTest() {


        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
       // driver.manage().deleteAllCookies();
        driver.get("https://www.opencart.com/");


        driver.findElement(By.xpath("//a[text()='Start now']")).sendKeys("admin");
        System.out.println();

        driver.navigate().refresh();
        driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");

    }




}
