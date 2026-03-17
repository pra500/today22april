package pac1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class Gdd {

    WebDriver driver;


    @BeforeClass(alwaysRun = true)
    public void setup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
        driver.manage().deleteAllCookies();
        //  driver.get("https://www.makemytrip.com/");

        //driver.get("https://beeceptor.com/docs/sample-api-for-testing/");

        driver.get("https://coindcx.com/");

    }

    @AfterClass(alwaysRun = true)
    public void teardown() {

        driver.quit();
    }

    //1) Verify Home Page Loads Successfully
    // @Test(priority = 0)
    public void chatbotTest() {
        boolean b =

                driver.findElement(By.xpath("//textarea[@class='tp-dt-enhanced-input-box']"))
                        .isDisplayed();
        Assert.assertTrue(b);


    }

    @Test(priority = 0)
    public void chatDbotTest() {

        System.out.println(driver.getTitle());
        System.out.println( driver.findElements(By.tagName("input")).size());

    }


    @Test(priority = 1)
    public void dTest() {

        System.out.println(driver.getTitle());
        System.out.println( driver.findElements(By.tagName("a")).size());



    }


    @Test(priority = 2)
    public void chaddtDbotTest() {

        System.out.println( driver.findElements(By.tagName("div")).size());
        System.out.println(driver.getWindowHandle());

    }



    @Test(priority = 2)
    public void chaddddtDbotTest() {

        System.out.println( driver.findElements(By.tagName("div")).size());
        System.out.println(driver.getWindowHandle());
boolean b=
        driver.findElement(By.xpath("(//span[text()='Login'])[2]")).isDisplayed();
       Assert.assertTrue(b);
       Assert.assertEquals(driver.getCurrentUrl(), "https://account.coindcx.com/login");

       boolean url=
       driver.findElement(By.xpath("//p[contains(normalize-space(), 'https://')]")).isDisplayed();
        Assert.assertTrue(url);

        boolean emailid=
        driver.findElement(By.xpath("(//input[@name='inputElement'])[1]")).isDisplayed();

        Assert.assertTrue(emailid);

       // (//input[@name='inputElement'])[1]


    }



}






