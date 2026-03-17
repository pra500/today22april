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

public class Yatra11 {
    WebDriver driver;

    @BeforeClass
    public void setup() {

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
      //  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(50));
        //driver.get("https://www.yatra.com/");

        driver.get("https://proleed.academy/exercises/selenium/automate-the-signup-form-using-selenium-webdriver.php");
        //  driver.findElement(By.xpath("(//img[@alt='cross'])[1]")).click();


    }

    @AfterClass
    public void teardown() {
        driver.quit();
    }


    //span[@class='style_cross__q1ZoV']//img[@alt='cross']

/*
    @Test
    public void titleTest() {

        String title = driver.getTitle();
        System.out.println(title);

    }



    @Test
    public void currenturlTest() {
String url=
        driver.getCurrentUrl();
        System.out.println(url);
    }



    @Test
    public void windowlTest() {

        String s=
     driver.getWindowHandle();
        System.out.println(s);
    }


    @Test
    public void listsizeTest() {
        int size=
        driver.findElements(By.xpath("//a")).size();
        System.out.println(size);
    }


    @Test
    public void lisDDtsiddzeTest() {

    }


    @Test
    public void lDDistsiddzeTest() {
        int size=
                driver.findElements(By.xpath("//img")).size();
        System.out.println(size);
    }

*/

    @Test
    public void lisDSFCdcDtsiddzeTest() {
        boolean b =
                driver.findElement(By.linkText("Corporate Training")).isDisplayed();
        System.out.println(b);

        boolean b1 =
                driver.findElement(By.linkText("Academics Tie-Up")).isDisplayed();
        System.out.println(b1);


        boolean b2 =
                driver.findElement(By.partialLinkText("Training"))
                        .isDisplayed();
        System.out.println(b2);


        boolean b3 =
                driver.findElement(By.partialLinkText("Training"))
                        .isDisplayed();
        System.out.println(b3);


        boolean b4 =
                driver.findElement(By.xpath("//ul[@class='nav']")).isDisplayed();
        System.out.println(b4);

        boolean b5 =
                driver.findElement(By.xpath("(//a[text()='Academics Tie-Up'])[1]")).isDisplayed();
        System.out.println(b5);

        WebElement wn =
                driver.findElement(By.xpath("(//a[contains(normalize-space(), 'leed Academy')])[1]"));
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(8));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//a[contains(normalize-space(), 'leed Academy')])[1]")));

        String s = wn.getAttribute("class");
        System.out.println(s);
        Assert.assertEquals("navbar-brand", s);

        String registration =
                driver.findElement(By.xpath("(//a[contains(text(), 'Registration')])[1]")).getAttribute("href");
        System.out.println(registration);

    }
}

