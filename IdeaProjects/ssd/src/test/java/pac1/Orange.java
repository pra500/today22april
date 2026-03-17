package pac1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

public class Orange {

    WebDriver driver;

    @BeforeClass
    public void setup() {
//
//        ChromeOptions options = new ChromeOptions();
//        options.addArguments("disable-popup-blocking");
        //  options.addArguments("ac

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
        driver.manage().deleteAllCookies();
        //driver.get("https://juspay.io/in");

        driver.get("https://rahulshettyacademy.com/");

//        driver.findElement(By.cssSelector(".IntegrationModal-viewDemoBtn")).click();

    }


    public void teardown() {
        driver.quit();

    }

    //@Test
    public void menuTest() {

//        boolean b=
//       driver.findElement(By.xpath("//span[text()='Juspay raises $50 million in Series D follow-up.']")).isDisplayed();
//        System.out.println(b);

        System.out.println(driver.getWindowHandle());


    }


    //@Test
    public void mendduTest() {
        if (
                driver.getTitle().equalsIgnoreCase("Rahul Shetty Academy | QA Automation, Playwright, AI Testing & QA Online Training")) {
            System.out.println("yes");
        }


    }

    @Test
    public void mendsdduTest() {

        driver.getWindowHandle();
        driver.findElement(By.xpath("(//a[contains(text(), 'Meet ups')])[1]")).click();
        Set<String>set1=
driver.getWindowHandles();

        Iterator<String>itr=set1.iterator();
     String par=itr.next();
     String chi=itr.next();

    // driver.switchTo().window(chi);







    }
}
