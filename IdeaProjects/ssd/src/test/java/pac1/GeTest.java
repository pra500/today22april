package pac1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class GeTest {

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

        driver.get("https://katalon.com/");


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

    @Test(priority = 0)
    public void testvsdLoginTest() {

      //  driver.findElement(By.xpath("//ul[@class='options']//li//a[text()='GIGA']")).click();

        driver.getTitle().contains("Katalon AI-augmented Test Automation Platform");
    }


    @Test(priority = 0)
    public void testvssdLoginTest() {

        //  driver.findElement(By.xpath("//ul[@class='options']//li//a[text()='GIGA']")).click();

        driver.getCurrentUrl().
                contains("https://katalon.com/");
    }

    @Test(priority = 0)
    public void testvssdsLoginTest() {

        //  driver.findElement(By.xpath("//ul[@class='options']//li//a[text()='GIGA']")).click();

        boolean b=
        driver.getPageSource().contains("div");
        System.out.println(b);
    }

    @Test(priority = 0)
    public void testvsssadsLoginTest() {
       boolean b= driver.findElement(By.xpath("(//a[contains(normalize-space(), 'View Demo')])[1]")).isDisplayed();
            System.out.println(b);


    }

    @Test(priority = 0)
    public void testvssssadsLoginTest() {
        boolean b= driver.findElement(By.xpath("//a[normalize-space()='Download Studio']")).isDisplayed();
        System.out.println(b);

    }


    @Test(priority = 0)
    public void testavssssadsLoginTest() {
        boolean b= driver.findElement(By.xpath("//div[text()='Resources']")).isDisplayed();
        System.out.println(b);

    }










}