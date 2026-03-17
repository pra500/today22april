package pac1;

import org.apache.commons.io.CopyUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.time.Duration;
import java.util.Properties;

public class ConfigPropertiesfilewriteTest {


    WebDriver driver;
    //JavascriptExecutor js;
    Properties prop;


    String file = "C:\\Users\\pragt\\IdeaProjects\\ssd\\src\\test\\resources\\ffd333.properties";


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
        prop = new Properties();
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
    }


    @Test
    public void heeTest() throws Exception {

        FileOutputStream fop = new FileOutputStream(file);
        prop.setProperty("username", "admin");
        prop.setProperty("password", "admin@123");
        prop.store(fop, "this is message");
        fop.close();


    }
}