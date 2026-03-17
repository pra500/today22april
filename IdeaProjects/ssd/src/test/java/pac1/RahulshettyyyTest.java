package pac1;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import javax.swing.plaf.PanelUI;
import java.time.Duration;

public class RahulshettyyyTest {

    WebDriver driver;

    @BeforeClass
    public void sestup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
        driver.manage().deleteAllCookies();
        // driver.get("https://lovable.dev/");
        driver.get("https://developer.paypal.com/api/rest/");
        //driver.getTitle().co
        // ntains("Lovable - Build Apps & Websites with AI, Fast | No Code App Builder");

    }


    @AfterClass
    public void teardown() {
        driver.quit();

    }

/*
    @Test(priority = 0)
    public void cDDddTest() {

        String title = driver.getTitle();
        Assert.assertEquals(title, "CodePen Search");

    }


    @Test(priority = 1)
    public void cDDdsdsdddTest() {
        driver.findElement(By.xpath("//input[@type='search']")).sendKeys("circle");
        boolean b = driver.findElement(By.xpath("//div//a[contains(text(), 'Search')]")).isDisplayed();

        System.out.println(b);

    }


    @Test(priority = 2)
    public void cDDdsdsawdddTest() {

        System.out.println(driver.getTitle());



    }


    @Test(priority = 2)
    public void cDdDdsdsawdddTest() {

        System.out.println(driver.getCurrentUrl());
    //  driver.getCurrentUrl()

    }


    @Test(priority = 2)
    public void cDdDdsddsawdddTest() {

        System.out.println(driver.getCurrentUrl());
        //  driver.getCurrentUrl()

    }

    @Test(priority = 2)
    public void cDsdvdTest() {

       // System.out.println(driver.getCurrentUrl());
        //  driver.getCurrentUrl();

        boolean b=
        driver.findElement(By.xpath("//button[text()='Solutions']")).isDisplayed();
        System.out.println(b);


        boolean bss=
                driver.findElement(By.xpath("//button[text()='Solutions']")).isDisplayed();
        System.out.println(bss);

        String s=
        driver.findElement(By.xpath("(//a[text()='Enterprise'])[1]")).getText();
        Assert.assertEquals(s, "Enterprise");



    }



*/

    @Test(priority = 2)
    public void cDsdvdTest() {

        String s =
                driver.findElement(By.xpath("//ul//span[text()='REST APIs']")).getText();
        System.out.println(s);

        String s2w =
                driver.findElement(By.xpath("//div//span[text()='Authentication']")).getAttribute("class");
        System.out.println(s2w);

        Point p =
                driver.findElement(By.xpath("//div//span[text()='Authentication']")).getLocation();
        System.out.println(p);


        String s1 =
                driver.findElement(By.xpath("//div//span[text()='Authentication']")).getTagName();
        System.out.println(s1);


        String sd =
                driver.findElement(By.xpath("//div//span[text()='Authentication']")).getAccessibleName();
        System.out.println(sd);

    }

    @Test(priority = 3)
    public void cDsddcdvdTest() {


String url=
        driver.getCurrentUrl();
Assert.assertEquals(url, "https://developer.paypal.com/api/rest/");


String title=driver.getTitle();
        Assert.assertEquals(title, "Get Started with PayPal REST APIs");

String sd=
        driver.findElement(By.xpath("//h1[@id='get-started-with-paypal-rest-apis']")).getText();
        System.out.println(sd);

        String s=
        driver.findElement(By.xpath("(//div//a[text()='Support'])[1]")).getText();
        Assert.assertEquals(s, "Support");


        String see=
                driver.findElement(By.xpath("(//div//a[text()='Support'])[1]")).getAttribute("href");
        Assert.assertEquals(see, "/docs/support/");


        String seedd=
                driver.findElement(By.xpath("(//div//a[text()='Support'])[1]")).getAttribute("href");
        Assert.assertEquals(see, "/docs/support/");


    }




}
