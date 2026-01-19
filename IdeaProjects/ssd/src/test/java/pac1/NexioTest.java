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

public class NexioTest {



    WebDriver driver;
    JavascriptExecutor js;

    @BeforeClass
    public void setup() {

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(50));
        driver.get("https://nex.io/");
        driver.findElement(By.xpath("//div//button[text()='Accept']")).click();

    }

    @AfterClass
    public void teardown() {
        driver.quit();
    }

    @Test
    public void titleTest() {
String title=
        driver.getTitle();
Assert.assertTrue(title.contains("Nexio | Vanquishing Payment Complexity for Merchants & SaaS"));
    }


    @Test
    public void urlTest() {
        String url=
                driver.getCurrentUrl();
        Assert.assertTrue(url.contains("https://nex.io/"));
    }




    @Test
    public void logoTest() {
        boolean logo=
                driver.findElement(By.xpath("//img[starts-with(@alt, 'Nexio Desktop Logo')]")).isDisplayed();
        Assert.assertTrue(logo);
    }





    @Test
    public void getstartedTest() {
        boolean getstarted=
                driver.findElement(By.xpath("(//a[contains(text(), 'GET STARTED')])[1]")).isDisplayed();
        Assert.assertTrue(getstarted);
    }




}



