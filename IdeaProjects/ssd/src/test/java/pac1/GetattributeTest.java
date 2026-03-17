package pac1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class GetattributeTest {

    WebDriver driver;
//    JavascriptExecutor js;

    @BeforeClass
    public void setup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
        driver.manage().deleteAllCookies();
        //driver.get("https://www.hdfc.bank.in/");
        // driver.get("https://www.w3schools.com/graphics/svg_examples.asp");

        driver.get("https://www.tutorialspoint.com/selenium/practice/selenium_automation_practice.php");
    }


    @AfterClass
    public void teardown() {
        driver.quit();

    }

    @Test
    public void egeTest()
    {
        driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("pragti");
        String s=  driver.findElement(By.xpath("//input[@placeholder='First Name']")).getAttribute("value");
        System.out.println(s);
        Assert.assertEquals(s, "pragti");

        driver.findElement(By.xpath("//input[@type='email']")).sendKeys("prahhh2sfsds@gmail.com");
        String s1=  driver.findElement(By.xpath("//input[@type='email']")).getAttribute("value");
        System.out.println(s1);
        Assert.assertEquals(s1, "prahhh2sfsds@gmail.com");

        driver.findElement(By.xpath("//input[@id='mobile']")).sendKeys("9090977777");
        String sq1=  driver.findElement(By.xpath("//input[@id='mobile']")).getAttribute("value");
        System.out.println(sq1);
        Assert.assertEquals(sq1, "9090977777");
    }
}
