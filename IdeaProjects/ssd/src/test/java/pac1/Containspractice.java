package pac1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class Containspractice {

    WebDriver driver;
    JavascriptExecutor js;

    @BeforeClass(alwaysRun = true)
    public void setup() {

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
        driver.manage().deleteAllCookies();
        driver.get("https://www.makemytrip.com/");
    }

    @AfterClass(alwaysRun = true)
    public void teardown() {

        driver.quit();
    }

    //1) Verify Home Page Loads Successfully
    @Test(priority = 0)
    public void logoandtitlevSerifyTest() {

        try {

            String text = driver.findElement(By.xpath("//a[text()='Practice']")).getText();
            Assert.assertTrue(text.contains("Pr"), "please please");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }


    //2) Validate Navigation Menu Items
    // @Test(priority = 1)
    public void NavigationMenuItemsverifyTest() {

        try {

            WebElement blog =
                    driver.findElement(By.xpath("//div//a[starts-with(text(), 'Blogs')]"));
            boolean flag = blog.isDisplayed();
            Assert.assertTrue(flag);

//
//            @Test(priority = 0)
//    public void SiTest() {
//


            //}




        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }




}
