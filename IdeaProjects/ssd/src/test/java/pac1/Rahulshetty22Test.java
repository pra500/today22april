package pac1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

public class Rahulshetty22Test {


    WebDriver driver;
    Properties prop;
    String filepath = "C:\\Users\\pragt\\IdeaProjects\\ssd\\src\\test\\resources\\a1.properties";


    @BeforeClass
    public void setup() throws IOException {

//        ChromeOptions options = new ChromeOptions();
//        options.addArguments("disable-popup-blocking");
        //  options.addArguments("ac

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
        driver.manage().deleteAllCookies();
        //driver.get("https://juspay.io/in");

        // driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

//        driver.findElement(By.cssSelector(".IntegrationModal-viewDemoBtn")).click();


        //driver.get("https://rahulshettyacademy.com/");
        driver.get("https://www.techlistic.com/p/selenium-practice-form.html");
        FileInputStream fip = new FileInputStream(filepath);
        prop = new Properties();
        prop.load(fip);

    }

    @AfterClass
    public void teardown() {
        driver.quit();

    }


    //@Test
    public void menuTest() {

//        boolean b=
//       driver.findElement(By.xpath("//span[text()='Juspay raises $50 million in Series D follow-up.']")).isDisplayed();
//        System.out.println(b);

//        String s =
//                driver.findElement(By.xpath("//img[@alt='company-branding']")).getAttribute("alt");
//        System.out.println(s);


        WebElement wb =
                driver.findElement(By.xpath("(//a[starts-with(text(), 'Mentorship')])[1]"));
        wb.click();
        if (driver.getCurrentUrl().equalsIgnoreCase("https://rahulshettyacademy.com/mentorship")) {
            System.out.println("correct url");
        } else {
            System.out.println("incorrect url");
        }
    }

    @Test
    public void menu1Test() {
        String date = prop.getProperty("date");
        //String firstname=prop.getProperty("first");

//driver.findElement(By.name("firstname")).sendKeys(firstname);
        driver.findElement(By.id("datepicker")).sendKeys(date);


    }


}
