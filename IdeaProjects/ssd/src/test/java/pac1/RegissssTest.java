package pac1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.FieldPosition;
import java.time.Duration;
import java.util.Properties;

public class RegissssTest {
    WebDriver driver;
    //JavascriptExecutor js;
    Properties prop;


    String file = "C:\\Users\\pragt\\IdeaProjects\\ssd\\src\\test\\resources\\ww.properties";


    @BeforeClass(alwaysRun = true)
    public void setup() throws Exception {

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
        driver.manage().deleteAllCookies();
        // driver.get("https://www.hdfc.com/");

        driver.get("https://www.tutorialspoint.com/selenium/practice/selenium_automation_practice.php");
        FileInputStream fip = new FileInputStream(file);
        prop=new Properties();
        prop.load(fip);

    }

    @AfterClass(alwaysRun = true)
    public void teardown() {

        driver.quit();
    }


    // @Test(priority = 0)
    public void logoandtitleverifyTest() {
        String title =
                driver.getTitle();
        Assert.assertEquals(title, "Housing Finance | Home Finance Company | HDFC Bank Ltd");


        String url =
                driver.getCurrentUrl();
        Assert.assertEquals(url, "https://www.hdfc.com/");
    }



    @Test(priority = 0)
    public void logoansdtitleverifyTest() throws IOException {
//        String s=prop.getProperty("mobile");
//        System.out.println(s);
//        driver.findElement(By.xpath("//input[@id='mobile']")).sendKeys(s);



        FileOutputStream fop=new FileOutputStream(file);
        prop.setProperty("mobile",  "8909000034");
        prop.store(fop, "mobile number is");
        fop.close();

    }

}


