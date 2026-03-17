package pac1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.*;

import java.time.Duration;
import java.util.List;

public class Makemy {

    WebDriver driver;

    @BeforeClass
    public void a() {

        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
        driver.manage().deleteAllCookies();
        driver.get("https://www.worldometers.info/coronavirus/country/india/");


    }


    @AfterClass
    public void tear() {
        driver.quit();
    }


    @Test
    public void geTest() {
        String text =
                driver.findElement(By.xpath("//img[@title='Worldometer']")).getAttribute("title");
        Assert.assertTrue(text.contains("Worldometer"));


    }


    @Test
    public void gddsswesTest() {

        List<WebElement> list =
                driver.findElements(By.xpath("//img)"));
        System.out.println(list.size()
        );


    }




    @Test
    public void gesTest() {

        List<WebElement> list =
                driver.findElements(By.xpath("//img)"));
        System.out.println(list.size()
        );


    }


    @Test
    public void gddesTest() {

        List<WebElement> list =
                driver.findElements(By.xpath("//img)"));
        System.out.println(list.size()
        );


    }
    @Test
    public void gswesTest() {

        List<WebElement> list =
                driver.findElements(By.xpath("//img)"));
        System.out.println(list.size()
        );

    }









}
