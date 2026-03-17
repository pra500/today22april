package pac1;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.Properties;

public class fdaTest {

    WebDriver driver;
    //Properties

    @BeforeClass
    public void setup() {

        ChromeOptions  options=new ChromeOptions();
        options.addArguments("headless");
        driver = new ChromeDriver(options);

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
        driver.manage().deleteAllCookies();
        driver.get("https://rahulshettyacademy.com/");
        System.out.println(driver.getTitle());
        // driver.getTitle()

        Assert.assertEquals(driver.getTitle(), "Rahul Shetty Academy | QA Automation, Playwright, AI Testing & Online Training");

    }

    @AfterClass
    public void teardown() {
        driver.quit();


    }

    @Test
    public void urlTest() {


        Assert.assertEquals(driver.getCurrentUrl(),
                "https://rahulshettyacademy.com/");


    }

    @Test
    public void urdddlTest() {


        Assert.assertEquals(driver.getCurrentUrl(),
                "https://rahulshettyacademy.com/");
        String text = driver.findElement(By.xpath("//img[@alt='Rahul Shetty Academy']")).getText();
        System.out.println(text);
    }


    @Test
    public void uddrdlTest() {


        Assert.assertEquals(driver.getCurrentUrl(),
                "https://rahulshettyacademy.com/");
        String text = driver.findElement(By.xpath("//img[@alt='Rahul Shetty Academy']")).getAttribute("alt");
        System.out.println(text);
    }


    @Test
    public void urddlTest() {


        Assert.assertEquals(driver.getCurrentUrl(),
                "https://rahulshettyacademy.com/");
        Point p = driver.findElement(By.xpath("//img[@alt='Rahul Shetty Academy']")).getLocation();
        System.out.println(p);
    }


    @Test
    public void udrdlTest() {


        Assert.assertEquals(driver.getCurrentUrl(),
                "https://rahulshettyacademy.com/");
        String text = driver.findElement(By.xpath("//img[@alt='Rahul Shetty Academy']")).getText();
        System.out.println(text);
    }


    @Test
    public void urdlTest() {
        Assert.assertEquals(driver.getCurrentUrl(),
                "https://rahulshettyacademy.com/");
        boolean nb = driver.findElement(By.xpath("//img[@alt='Rahul Shetty Academy']")).isDisplayed();

        System.out.println(nb);
    }


    @Test
    public void urdddddlTest() {
        Assert.assertEquals(driver.getCurrentUrl(),
                "https://rahulshettyacademy.com/");
        boolean nb = driver.findElement(By.xpath("(//a[text()='Mentorship'])[2]")).isDisplayed();

        System.out.println(nb);
    }


    @Test
    public void urddddlTest() {
        Assert.assertEquals(driver.getCurrentUrl(),
                "https://rahulshettyacademy.com/");
        boolean nb = driver.findElement(By.xpath("//a[text()='Browse All Courses']")).isDisplayed();

        System.out.println(nb);
    }

    @Test
    public void u22rdddddlTest() {
        Assert.assertEquals(driver.getCurrentUrl(),
                "https://rahulshettyacademy.com/");
        boolean nb = driver.findElement(By.xpath("//a[text()='Browse All Courses']")).isDisplayed();

        System.out.println(nb);
    }

    @Test
    public void urdddddddlTest() {
        Assert.assertEquals(driver.getCurrentUrl(),
                "https://rahulshettyacademy.com/");
        boolean nb = driver.findElement(By.xpath("//a[text()='Browse All Courses']")).isDisplayed();

        System.out.println(nb);
    }

    @Test
    public void ur222dddddlTest() {
        Assert.assertEquals(driver.getCurrentUrl(),
                "https://rahulshettyacademy.com/");
        boolean nb = driver.findElement(By.xpath("//a[text()='Browse All Courses']")).isDisplayed();

        System.out.println(nb);
    }

    @Test
    public void u1Test() {
        Assert.assertEquals(driver.getCurrentUrl(),
                "https://rahulshettyacademy.com/");
        System.out.println(driver.findElements(By.xpath("//a")).size());
        //driver.findElements(By.xpath("//a")).size();


    }


    @Test
    public void u1dTest() {
        Assert.assertEquals(driver.getCurrentUrl(),
                "https://rahulshettyacademy.com/");
        System.out.println(driver.findElements(By.xpath("//img")).size());
        //driver.findElements(By.xpath("//a")).size();


    }


    @Test
    public void u2Test() {
        Assert.assertEquals(driver.getCurrentUrl(),
                "https://rahulshettyacademy.com/");
        System.out.println(driver.findElements(By.xpath("//div")).size());
        //driver.findElements(By.xpath("//a")).size();


    }

    @Test
    public void uss2Test() {
        Assert.assertEquals(driver.getCurrentUrl(),
                "https://rahulshettyacademy.com/");
        System.out.println(driver.findElements(By.xpath("//strong")).size());
        //driver.findElements(By.xpath("//a")).size();




    }


    @Test
    public void usss2Test() {
        Assert.assertEquals(driver.getCurrentUrl(),
                "https://rahulshettyacademy.com/");
        System.out.println(driver.findElements(By.xpath("//button")).size());
        //driver.findElements(By.xpath("//a")).size();
    }



    @Test
    public void ussss2Test() {
        Assert.assertEquals(driver.getCurrentUrl(),
                "https://rahulshettyacademy.com/");
        System.out.println(driver.findElements(By.xpath("//button")).size());
        //driver.findElements(By.xpath("//a")).size();


    }



    @Test
    public void usssss2Test() {
        Assert.assertEquals(driver.getCurrentUrl(),
                "https://rahulshettyacademy.com/");
        System.out.println(driver.findElement(By.xpath("//p[contains(text(), 'World-class QA &')]")).getText());
        //driver.findElements(By.xpath("//a")).size();


    }

    @Test
    public void ussassss2Test() {
        Assert.assertEquals(driver.getCurrentUrl(),
                "https://rahulshettyacademy.com/");
        System.out.println(driver.findElement(By.xpath("//p[contains(text(), 'World-class QA &')]")).getText());
        //driver.findElements(By.xpath("//a")).size();


    }



    @Test
    public void ussssss2Test() {
        Assert.assertEquals(driver.getCurrentUrl(),
                "https://rahulshettyacademy.com/");
        System.out.println(driver.findElement(By.xpath("//p[contains(text(), 'World-class QA &')]")).getLocation());
        //driver.findElements(By.xpath("//a")).size();


    }




}
