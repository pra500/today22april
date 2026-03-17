package pac1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class SvgggTest {


    //  (//*[local-name()='svg' and @class='e-font-icon-svg e-fas-caret-up'])[1]


    //      By.xpath("//button//*[name()='svg']")

    //  By.xpath("//*[name()='svg']//*[name()='rect'][1]")

    WebDriver driver;

    @BeforeClass
    public void setup() {

        ChromeOptions options = new ChromeOptions();
        options.addArguments("disable-popup-blocking");
        //  options.addArguments("ac

        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
        driver.manage().deleteAllCookies();
        //driver.get("https://juspay.io/in");

        // driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

//        driver.findElement(By.cssSelector(".IntegrationModal-viewDemoBtn")).click();


        driver.get("https://selectorshub.com/");

    }

    public void teardown() {
        driver.quit();

    }


    @Test
    public void menuTest() throws Exception {


        boolean b =
                driver.findElement(By.xpath("(//*[local-name()='svg' and @class='e-font-icon-svg e-fas-caret-up'])[1]")).isDisplayed();
        System.out.println(b);


        boolean bssw =
                driver.findElement(By.xpath("(//*[local-name()='svg' and @class='e-font-icon-svg e-fas-caret-up'])[1]")).isDisplayed();
        System.out.println(bssw);


        boolean search =
                driver.findElement(By.xpath("//*[name()='svg' and @id='tnb-google-search-icon']")).isDisplayed();
        System.out.println(search);


        driver.get("https://codepen.io/search/pens?q=svg%20chart");

        Thread.sleep(8000);

        boolean search2 =
                driver.findElement(By.xpath("//*[local-name()='svg'and @class='SearchForm_iconMag__6pTjB']//*[local-name()='path']"))
                        .isDisplayed();
        System.out.println(search2);


        boolean codepen =
                driver.findElement(By.xpath("(//*[local-name()='svg' and @stroke-linecap='round']//*[local-name()='path'])[2]")).isDisplayed();
        System.out.println(codepen);



    }
    @Test
    public void mesdsnuTest() throws Exception {

        driver.get("https://www.w3schools.com/graphics/svg_examples.asp");

        Thread.sleep(8000);
        boolean b =
                driver.findElement(By.xpath("(//*[local-name()='svg' and @stroke-linecap='round']//*[local-name()='path'])[2]")).isDisplayed();
        System.out.println(b);


        //(//*[local-name()='svg' and @stroke-linecap='round']//*[local-name()='path'])[2]

    }




}
