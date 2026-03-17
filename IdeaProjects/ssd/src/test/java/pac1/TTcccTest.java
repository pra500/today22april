package pac1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class TTcccTest {
    WebDriver driver;
    JavascriptExecutor js;

    @BeforeClass
    public void setup() {

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(50));
       // driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        driver.get("https://www.google.com");


    }

    @AfterClass
    public void teardown() {
        driver.quit();
    }



  //  @Test
    public void ggTest() {

        String title = driver.getTitle();
        Assert.assertTrue(title.contains("Practice Page"));

        String uklr=
        driver.getCurrentUrl();
Assert.assertEquals("https://rahulshettyacademy.com/AutomationPractice/", uklr);

   }


    @Test
    public void gggTest() {

        Assert.assertEquals(driver.getTitle(), "Google");
//driver.getTitle(), "Google"

    }

    @Test
    public void ggdgTest() {
        int size=
driver.findElements(By.xpath("//input")).size();
        System.out.println(size);
    }

    @Test
    public void ggdsegTest() {
        int size=
                driver.findElements(By.xpath("//div")).size();
        System.out.println(size);
    }

    @Test
    public void ggdsddegTest() {
        int size=
                driver.findElements(By.xpath("//button")).size();
        System.out.println(size);
    }

    @Test
    public void ggddsddegTest() {
        int size=
                driver.findElements(By.xpath("//button")).size();
        System.out.println(size);
    }














    @Test
    public void ggdddegTest() {
        int size=
                driver.findElements(By.xpath("//button")).size();
        System.out.println(size);
    }


}