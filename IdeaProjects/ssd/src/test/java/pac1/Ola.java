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

public class Ola {

    WebDriver driver;
    JavascriptExecutor js;

    @BeforeClass
    public void setup() {

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
        driver.manage().deleteAllCookies();
        driver.get("https://www.olacabs.com/");


    }

    @AfterClass
    public void teardown() {
        driver.quit();
    }


    @Test
    public void geeTestI() {
        System.out.println(driver.getTitle());
        driver.getTitle();
        String url =

                driver.getCurrentUrl();

        System.out.println(url);

        String s = driver.getWindowHandle();
        System.out.println(s);

        int size =
                driver.findElements(By.xpath("//a")).size();

        System.out.println(size
        );


        int size1 =
                driver.findElements(By.xpath("//img")).size();

        System.out.println(size1
        );


        int size2 =
                driver.findElements(By.xpath("//div")).size();

        System.out.println(size2
        );

        WebElement a =
                driver.findElement(By.xpath("//a[text()='Book an Ola Cab']"));
        System.out.println(a.isDisplayed());

        String st = a.getAttribute("event-name");
        System.out.println(st);


//String st1=a.getText();


    }


}
