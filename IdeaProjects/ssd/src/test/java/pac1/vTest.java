package pac1;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class vTest {


    // staleele
    //1 uri/path
    // pgm try catch finally combined
//nosuchele
//javaexe
    //before class uri


    WebDriver driver;

    @BeforeClass
    public void beforeClass() {

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-infobars");
        options.addArguments("--disable-extensions");
        options.addArguments("--start-maximized");
        options.addArguments("--window-size=1920, 1080");

        options.addArguments("incognito");

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
        driver.manage().deleteAllCookies();
        // driver.get("https://www.opencart.com/");
        //driver.get("https://beeceptor.com/");
        //driver.get("https://www.yatra.com/");
        driver.get("https://proleed.academy/exercises/selenium/automate-the-signup-form-using-selenium-webdriver.php");
    }


    @AfterClass
    public void afterClass() {


        driver.quit();


    }


    // @Test
    public void startsssavingTest() {


//
//        boolean nb=
//       driver.findElement(By.xpath("//li//button[text()='categories']")).isDisplayed();
//        System.out.println(nb);
//
//        WebElement ewn=
//        driver.findElement(By.xpath("//li//button[text()='categories']"));
//
//        driver.navigate().refresh();
//        System.out.println(ewn.getText());
//
//


        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy");


    }


    // @Test
    public void startssDsavingTest() {
        String title =
                driver.getTitle();

        System.out.println(title);
        String url =
                driver.getCurrentUrl();

        System.out.println(url);
    }


    //5 rahul tc's
    //  @Test
    public void startdssDsavingTest() {

        boolean b =
                driver.findElement(By.xpath("//img[@aria-label='Yatra Logo']")).isDisplayed();
        System.out.println(b);


        boolean b1 = driver.findElement(By.xpath("//div[text()='Login / Signup']")).isDisplayed();
        System.out.println(b1);


        boolean b2 = driver.findElement(By.xpath("(//span[text()='Holidays'])[1]")).isDisplayed();
        System.out.println(b2);

        Point p =
                driver.findElement(By.xpath("//img[@alt='Join Yatra Prime Banner']")).getLocation();
        System.out.println(p);

        String h =
                driver.findElement(By.xpath("//img[@alt='Join Yatra Prime Banner']")).getAttribute("alt");
        System.out.println(h);


    }




    //

    // staleele
    //1 uri/path
    // pgm try catch finally combined
//nosuchele
//javaexe
    //before class uri


    //5 rahul tc's
   // @Test
    public void startdddssDsavingTest() {

//WebElement wb=
//        driver.findElement(By.xpath("//img[@alt='Join Yatra Prime Banner']"));
//driver.navigate().refresh();
//        System.out.println(wb.isDisplayed());


//
//
//        String text=
//driver.findElement(By.xpath("(//span[text()='Holidays'])[1]")).getText();
//        System.out.println(text);
//
//
//


        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrdddollBy(200, 400)", "");




    }

    //  // staleele
    //    //1 uri/path
    //    // pgm try catch finally combined
    ////nosuchele
    ////javaexe


    //    //before class uri



    @Test
    public void startddddssDsavingTest() {

WebElement wb=
driver.findElement(By.xpath("//a[text()='Training Programs']"));

driver.navigate().refresh();

String s=
wb.getAttribute("class");
System.out.println(s);








    }







}


