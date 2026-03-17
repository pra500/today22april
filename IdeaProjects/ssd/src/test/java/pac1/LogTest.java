package pac1;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.time.Duration;
import java.util.Properties;

public class LogTest {


    WebDriver driver;
    String filepath = "C:\\Users\\pragt\\IdeaProjects\\ssd\\src\\test\\resources\\eer.properties";
    Properties prop;
    Properties prop1;


    @BeforeClass
    public void setup() throws Exception {


        ChromeOptions options=new ChromeOptions();
        options.addArguments("--incognito-");
        options.addArguments("--headless-");
        options.addArguments("--disable-infobars-");
        options.addArguments("--disable-chrome-extensions-");
        options.addArguments("--disable-gpu-");
        options.addArguments("--disable-auto-filled");

        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
        driver.manage().deleteAllCookies();
        driver.get("https://practicetestautomation.com/practice-test-login/");
        FileInputStream fip=new FileInputStream(filepath);
        prop = new Properties();
        prop.load(fip);


    }


    @AfterClass
    public void tear() {
        driver.quit();

    }


    @Test
    public void yyGeTest() throws Exception {

//        Dimension d = driver.findElement(By.xpath("//img[@alt='Make My Trip']")).getSize();
//        System.out.println(d.getWidth());


String u=
        prop.getProperty("username");
        driver.findElement(By.id("username")).sendKeys(u);


//        driver.findElement(By.id("username")).

        String p=
                prop.getProperty("password");
        driver.findElement(By.id("password")).sendKeys(u);

        FileOutputStream fop=new FileOutputStream(filepath);
        prop1=new Properties();
        prop1.setProperty("usern", "adminnnn");
        prop1.setProperty("passwr", "adminnnn@1233");
        prop1.store(fop, "my msg is");
        fop.close();





    }

    @Test
    public void yyGseTest() {
//
//        WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(8));
//        wait.until(ExpectedConditions.presenceOfElementLocated())
//


//
//String  u=
//        driver.findElement(By.xpath("//li[contains(normalize-space(), 'Use next credentials to execute Login:')]"))
//                .getText();
//        System.out.println(u);

WebElement wb=
        driver.findElement(By.id("password"));
        driver.findElement(By.id("password")).sendKeys("pass@123");
        String s=
wb.getAttribute("value");
        Assert.assertEquals(s, "pass@123");

        Point p=
        wb.getLocation();
        System.out.println(p);

        WebElement passddd=

driver.findElement(By.xpath("//label[text()='Password']"));
        String sss=
        passddd.getText();

        Assert.assertEquals(sss, "Password");

    }

//
//    how to take all request logs in rest assured
//
//    after any always s  - in mail
//
//    form-data
//
//    hasSize()/hasLength()
//
    //    contains() vs containsInAnyOrder() vs hasItem() vs hasItems()



}
