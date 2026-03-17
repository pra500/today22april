package pac1;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

import static org.assertj.core.api.BDDAssumptions.*;


public class TFFTest {

    WebDriver driver;

    @BeforeClass
    public void setup() {

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
        driver.manage().deleteAllCookies();
        // driver.get("https://www.tutorialspoint.com/selenium/practice/selenium_automation_practice.php");
//driver.get("https://shopify.dev/docs/api");

        // driver.get("https://docs.github.com/en/rest");
        driver.get("https://developer.paypal.com/api/rest/");
        //driver.get("https://www.opencart.com/");


    }

    @AfterClass
    public void teardown() {
        driver.quit();


    }

    //@Test
    public void menuTest() {
//
//        firstname=Tom
//        email=pra333@gmail.com

        WebElement wb =

                driver.findElement(By.xpath("//h1[text()='Shopify API, libraries, and tools']"));


        String g =
                driver.findElement(By.xpath("//h1[text()='Shopify API, libraries, and tools']")).getText();
        System.out.println(g);


//        String we=
//                driver.findElement(By.xpath("//h1[text()='Shopify API, libraries, and tools']")).getAttribute("class");
//        System.out.println(we);


        Point p =
                driver.findElement(By.xpath("//h1[text()='Shopify API, libraries, and tools']")).getLocation();
        System.out.println(p);

        String s =
                wb.getAriaRole();
        System.out.println(s);


        String sss =
                wb.getAccessibleName();
        System.out.println(sss);

        String sss2 =
                wb.getCssValue("border-color");
        System.out.println(sss2);

        String sp =
                wb.getTagName();
        System.out.println(sp);

        Rectangle r =
                wb.getRect();

        System.out.println(r.getX());

        System.out.println(r.getY());
    }


    //   @Test
    public void meddnuTest() {


        driver.findElement(By.xpath("(//button[@data-testid='search'])[1]")).click();

        driver.findElement(By.xpath("//input[@data-testid='overlay-search-input']")).sendKeys("repo");
        driver.findElement(By.xpath("(//span//span[text()='REST API endpoints for GitHub Actions permissions'])[2]"))
                .click();

        String s =
                driver.findElement(By.xpath("//h1[text()='REST API endpoints for GitHub Actions permissions']")).getText();
        Assert.assertEquals("REST API endpoints for GitHub Actions permissions", s);

        // (//span//span[text()='REST API endpoints for GitHub Actions permissions'])[2]

//input[@data-testid='overlay-search-input']


        String ss =
                driver.findElement(By.xpath("//div//p[text()='Use the REST API to interact with permissions for GitHub Actions.']")).getText();
        System.out.println(ss);


        Point p =
                driver.findElement(By.xpath("//*[local-name()='svg' and @class='octicon octicon-globe']")).getLocation();
        System.out.println(p);


//
//        Point w=
//                driver.findElement(By.xpath("//*[local-name()='svg' and @class='octicon octicon-globe']")).getLocation();
//        System.out.println(w);


    }

   // @Test
    public void mddfeddnuTest() {
        //rahul tc's //opencart
        String href =
                driver.findElement(By.xpath("//a[text()='Quick Guide']")).getAttribute("href");
        System.out.println(href);

        String href1 =
                driver.findElement(By.xpath("(//a[text()='Marketplace'])[2]")).getAttribute("href");
        System.out.println(href1);

        String href2 =
                driver.findElement(By.xpath("(//a[text()='Marketplace'])[2]")).getAttribute("href");
        System.out.println(href2);

    }


    @Test
    public void mddfdseddnuTest() {
        driver.findElement(By.xpath("(//div//a[text()='Support'])[1]")).click();
        Assert.assertEquals("https://developer.paypal.com/docs/support/", driver.getCurrentUrl());

    }


    @Test
    public void mddfddseddnuTest() {

List<WebElement> list=
        driver.findElements(By.xpath("//a"));

        System.out.println(list.size());

    }


    @Test
    public void mddfddsdsceddnuTest() {

        List<WebElement> list=
                driver.findElements(By.xpath("//img"));

        System.out.println(list.size());


    }



    @Test
    public void mddfddsdddsceddnuTest() {

        List<WebElement> list=
                driver.findElements(By.xpath("//img"));

        System.out.println(list.size());


    }

    }