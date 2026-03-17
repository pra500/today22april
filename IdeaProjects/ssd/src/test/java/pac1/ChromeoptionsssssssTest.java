package pac1;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class ChromeoptionsssssssTest {

/*
    ChromeOptions Cheat Sheet (Most Used Arguments)
    Category
            Argument
    Purpose
            Example
    Window
--start-maximized
    Start browser maximized
✅ Always use
--window-size=1920,1080
    Set custom resolution
    Headless mode
    Privacy
--incognito
    Private browsing
    Avoid saved cookies
--disable-notifications
    Block notifications
    Prevent popups
    Performance
--no-sandbox
    Linux/Docker requirement
✅ Critical for CI
--disable-dev-shm-usage
    Fix Docker crashes
✅ Critical for CI
--disable-gpu
    Disable GPU rendering
    Required for headless
            Security
--disable-blink-features=AutomationControlled
    Hide automation detection
    Anti-bot bypass
--disable-infobars
    Remove "controlled by automated software" bar
    Cleaner UI
    Headless
--headless=new
    Headless mode (Chrome 109+)
    CI/CD pipelines
    Downloads
    prefs: download.default_directory
    Set download folder
    File download tests
            Autofill
    prefs: credentials_enable_service=false
    Disable password manager
✅ Critical for login tests

*/


    WebDriver driver;
    JavascriptExecutor js;

    @BeforeClass
    public void setup() {

        ChromeOptions options=new ChromeOptions();
        options.addArguments("--disable-gpu");
        options.addArguments("--no-sandbox");
        options.addArguments("--start-maximized");


        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(50));
        driver.get("https://proleed.academy/exercises/selenium/automate-the-signup-form-using-selenium-webdriver.php");
    }

    @AfterClass
    public void teardown() {
        driver.quit();

    }

    @Test
    public void ggTest() {
        String url = driver.getCurrentUrl();
        Assert.assertEquals("https://proleed.academy/exercises/selenium/automate-the-signup-form-using-selenium-webdriver.php", url);

    }
}
