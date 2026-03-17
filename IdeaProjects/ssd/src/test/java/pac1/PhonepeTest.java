package pac1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

public class PhonepeTest {
    //start saving
    //gold url    click on Start Saving Today     diff wind
    //verify appstore/googlepay/indus


    WebDriver driver;
    //  ExtentTest test = ExtentManager.getInstance().createTest("my loginnnn test this is");


    @BeforeClass
    public void setup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
        driver.manage().deleteAllCookies();
        driver.get("https://www.phonepe.com/");
    }

    @AfterClass
    public void afterClass() {
        driver.quit();
    }

    @Test(priority = 0)
    public void startsavingTest() {

        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(8));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//a[text()='Start Saving'])[2]"))).click();

       // driver.findElement(By.xpath("(//a[text()='Start Saving'])[2]")).click();

        String url =
                driver.getCurrentUrl();
        Assert.assertEquals(url, "https://www.phonepe.com/gold");


        String parent = driver.getWindowHandle();
        driver.findElement(By.xpath("(//span[text()='Start Saving Today'])[1]")).click();

        Set<String> set1 = driver.getWindowHandles();
        Iterator<String> itr = set1.iterator();

        String par = itr.next();
        String chi = itr.next();

        driver.switchTo().window(chi);

        Assert.assertEquals("PhonePe - download the app!", driver.getTitle());

        boolean appstore = driver.findElement(By.xpath("(//img[@alt='app store icon'])[2]")).isDisplayed();
        Assert.assertTrue(appstore);

        boolean googleplay = driver.findElement(By.xpath("(//img[@alt='google store icon'])[2]")).isDisplayed();
        Assert.assertTrue(googleplay);

        boolean indus = driver.findElement(By.xpath("(//img[@alt='Indus AppStore icon'])[2]")).isDisplayed();
        Assert.assertTrue(indus);

        driver.close();

        driver.switchTo().window(parent);

    }

    @Test(priority = 0)
    public void TitleTest() {

        WebElement company=
driver.findElement(By.xpath("//div[@id='company']"));

        



    }


    @Test(priority = 0)
    public void TitlceTest() {
        String title=
                driver.getTitle();
        System.out.println(title);
    }









}


