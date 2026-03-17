package pac1;

import org.checkerframework.checker.units.qual.A;
import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class TETest {

    WebDriver driver;

    @BeforeClass
    public void beforeClass() {
//
//        ChromeOptions options=new ChromeOptions();
//        options.addArguments("--disable-infobars");
//        options.addArguments("--disable-extensions");
//        options.addArguments("--start-maximized");
//        options.addArguments("--window-size=1920, 1080");

        // options.addArguments("--disable-infobars");

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
        driver.manage().deleteAllCookies();
        // driver.get("https://www.opencart.com/");
        //driver.get("https://beeceptor.com/");
        driver.get("https://www.joshwcomeau.com/svg/friendly-introduction-to-svg/");
    }


    @AfterClass
    public void afterClass() {


        driver.quit();


    }

    /*

    @Test
    public void startsssavingTest() {
        boolean b=
driver.findElement(By.xpath("//img[@title='OpenCart - Open Source Shopping Cart Solution']")).isDisplayed();
        Assert.assertTrue(b);
    }

    @Test
    public void startsdsssavingTest() {
        boolean b=
                driver.findElement(By.xpath("(//li//a[text()='Features'])[1]")).isDisplayed();
        Assert.assertTrue(b);
    }



    @Test
    public void starsdtsdsssavingTest() {
        boolean b=
                driver.findElement(By.xpath("(//li//a[text()='Features'])[1]")).isDisplayed();
        Assert.assertTrue(b);
    }



    @Test
    public void startsfdsssavingTest() {
        boolean b=
                driver.findElement(By.xpath("(//li//a[text()='Features'])[1]")).isDisplayed();
        Assert.assertTrue(b);
    }
    */

    @Test
    public void startsfdsssavingTest() {

//
//            boolean flag= driver.findElement(By.xpath("(//li//a[text()='Features'])[1]")).isDisplayed();
//            Assert.assertTrue(flag);
//
//         driver.findElement(By.xpath("//a[text()='Create an Endpoint']")).click();
//         driver.findElement(By.xpath("//a[text()='Watch to get started']")).click();
//         driver.findElement(By.xpath("(//button[@aria-label='Close'])[1]")).click();

//
//
//        boolean b =
//                driver.findElement(By.xpath("//a[text()='Skip the Waiting']")).isDisplayed();
//        Assert.assertTrue(b);
//
//        String s = driver.findElement(By.xpath("//a[text()='Mock Servers']")).getAttribute("role");
//        System.out.println(s);
//
//        boolean b1 = driver.findElement(By.xpath("//a[contains(text(), 'Features')]")).isDisplayed();
//        Assert.assertTrue(b1);
//
//        String s11 =
//                driver.findElement(By.xpath("//a[text()='Log in / Sign up']")).getText();
//        Assert.assertEquals(s11, "Log in / Sign up");
//
//        String ss =
//                driver.findElement(By.xpath("//h3[text()='Create your mock server']")).getText();
//        Assert.assertEquals(ss, "Create your mock server");
//


        WebElement ele =
                driver.findElement(By.xpath("(//*[local-name()='svg' and @class='l1ngw3bx'])[1]"));

        String tagname =
                driver.findElement(By.xpath("(//*[local-name()='svg' and @class='l1ngw3bx'])[1]")).getTagName();
        Assert.assertEquals(tagname, "svg");


        Rectangle r =
                ele.getRect();
        System.out.println(r.getX());
        System.out.println(r.getY());

        String classq =
                ele.getAttribute("class");

        Assert.assertEquals(classq, "l1ngw3bx");
    }


    @Test
    public void startsfdssdcdsavingTest() {

        //driver.gett\

    }
}
