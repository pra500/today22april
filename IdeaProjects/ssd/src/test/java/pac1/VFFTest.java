package pac1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class VFFTest {

    WebDriver driver;
//    JavascriptExecutor js;

    @BeforeClass
    public void setup() {

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito-");
        options.addArguments("--disable-infobars-");
        options.addArguments("--disable-extensions-");
        options.addArguments("--headless-");

        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
        driver.manage().deleteAllCookies();


        driver.get("https://rahulshettyacademy.com/");


       // driver.get("https://www.yatra.com/");
        //driver.get("https://www.hdfc.bank.in/");
        // driver.get("https://www.w3schools.com/graphics/svg_examples.asp");

        //  driver.get("https://www.testmuai.com/lp/web-automation-tools/?utm_source=google&utm_medium=cpc&utm_campaign=TestMu_Search_Generic_RLSA_Automation_Testing_India_2026&utm_term=automation%20testing%20websites&utm_id=23522834320&utm_content=WebsiteAutomation-Phrase&gad_source=1&gad_campaignid=23522834320&gbraid=0AAAAAp7I9OLeinfllGTAKiYQ9eyI5Nux5&gclid=Cj0KCQiAtfXMBhDzARIsAJ0jp3DFR-8pd0w_heGNircAR0hl5wSwjrX6ENqoYy0G0xUD4sSgVFcnQ4EaAuRgEALw_wcB");
        // https:
//www.testmuai.com/lp/web-automation-tools/?utm_source=google&utm_medium=cpc&utm_campaign=TestMu_Search_Generic_RLSA_Automation_Testing_India_2026&utm_term=automation%20testing%20websites&utm_id=23522834320&utm_content=WebsiteAutomation-Phrase&gad_source=1&gad_campaignid=23522834320&gbraid=0AAAAAp7I9OLeinfllGTAKiYQ9eyI5Nux5&gclid=Cj0KCQiAtfXMBhDzARIsAJ0jp3DFR-8pd0w_heGNircAR0hl5wSwjrX6ENqoYy0G0xUD4sSgVFcnQ4EaAuRgEALw_wcB }

    }

    @AfterClass
    public void teardown() {
        driver.quit();
    }

   // @Test(priority = 0)
    public void testvsdLoginTest() {

        System.out.println(driver.getTitle());


    }

   // @Test(priority = 1, dependsOnMethods = "testvsdLoginTest")
    public void testvssxdLoginTest() {

        System.out.println(driver.getCurrentUrl());

    }

    //@Test(priority = 1)
    public void tssesTest() {

        System.out.println(driver.getCurrentUrl());
    }



    //@Test(priority = 1)
    public void tssddesTest() {
  //System.out.println();
        System.out.println(driver.getCurrentUrl());


    }


    // @Test(priority = 1)
    public void aaTest() {
        System.out.println(driver.getTitle());


    }



    //@Test(priority = 1)
    public void aaeedTest() {
        System.out.println(driver.getPageSource());


    }
    //*****************


    // @Test(priority = 1)
    public void aaseessdTest() {
        boolean b=
        driver.findElement(By.xpath("(//a[text()='Mentorship'])[2]")).isDisplayed();
        Assert.assertEquals(true, b);


    }

       // @Test(priority = 1)
        public void aaeesasdTest() {
        boolean b=
                driver.findElement(By.xpath("(//a[text()='Job Ready'])[1]")).isDisplayed();
        Assert.assertEquals(true, b);

        boolean b1=
                driver.findElement(By.xpath("(//a[text()='TechSmartHire'])[1]")).isDisplayed();
        Assert.assertEquals(true, b1);


        boolean b21=
                driver.findElement(By.xpath("(//a[text()='Practice Apps'])[1]")).isDisplayed();
        Assert.assertEquals(true, b21);



        boolean b2211=
                driver.findElement(By.xpath("//img[@alt='Rahul Shetty Academy']")).isDisplayed();
        Assert.assertEquals(true, b2211);




    }
//
//    //@Test(priority = 1)
//    public void aaeessdTest() {
//        System.out.println(driver.getCurrentUrl());
//
//
//    }
//
//    @Test(priority = 1)
//    public void aaeessdTest() {
//        System.out.println(driver.getCurrentUrl());
//
//
//    }
//
//    @Test(priority = 1)
//    public void aaeessdTest() {
//        System.out.println(driver.getCurrentUrl());
//
//
//    }
//
//
//
//
//
//
//
//
//
//    @Test(priority = 1)
//    public void aaeessdTest() {
//        System.out.println(driver.getCurrentUrl());
//
//
//    }
//



    @Test
    public void ddTest()
    {

        WebElement allaccess=
        driver.findElement(By.xpath("(//a[text()='All-Access'])[1]"));

        WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//a[text()='All-Access'])[1]")));

        allaccess.click();
        Assert.assertEquals(driver.getCurrentUrl(), "https://rahulshettyacademy.com/all-access-subscription");


        WebElement TechSmartHire=
                driver.findElement(By.xpath("//a[text()='TechSmartHire']"));
String s=
        TechSmartHire.getAttribute("href");
Assert.assertEquals("https://techsmarthire.com/", s);

        String s1=
                TechSmartHire.getAttribute("rel");
        Assert.assertEquals("noopener noreferrer", s1);

    }



}
