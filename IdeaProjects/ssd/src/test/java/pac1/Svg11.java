package pac1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class Svg11 {
    WebDriver driver;

    @BeforeClass
    public void setup() {

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
        driver.manage().deleteAllCookies();
        driver.get("https://www.wanderfly.in/");

    }

    @AfterClass
    public void afterClass() {
        driver.quit();
    }


    //@Test(priority = 0)
    public void test1Test() {
        boolean flag = driver.findElement(By.xpath("//a[starts-with(@id, 'contact_us_btn')]")).isDisplayed();
        boolean flag1 = driver.findElement(By.xpath("//a[starts-with(@id, 'contact_us_btn')]")).isDisplayed();
        Assert.assertEquals(flag, true);
        Assert.assertEquals(flag1, true);


    }


    @Test(priority = 0)
    public void test2Test() {
//boolean b=driver.findElement(By.xpath("//*[local-name()='svg' and @class='lucide lucide-sparkles-icon chat-provider__triggerIcon']")).isDisplayed();
//      Assert.assertTrue(b);

        boolean b =
                driver.findElement(By.xpath("(//*[local-name()='svg' and @stroke='currentColor'])[8]")).isDisplayed();
        Assert.assertTrue(b);

        boolean b1 =
                driver.findElement(By.xpath("//button[text()='Tools']//*[local-name()='svg']")).isDisplayed();
        Assert.assertTrue(b1);




    }


}
