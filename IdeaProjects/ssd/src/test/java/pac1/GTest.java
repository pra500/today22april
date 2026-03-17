package pac1;

import net.bytebuddy.implementation.auxiliary.MethodCallProxy;
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

public class GTest {

    WebDriver driver;

    @BeforeClass
    public void setup() {

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
        driver.manage().deleteAllCookies();
        // driver.get("https://selectorshub.com/");
        driver.get("https://testkru.com/Elements/SVGelemnts");

    }


    @AfterClass
    public void tear() {
        driver.quit();

    }



/*
    @Test
    public void yyGeTest() {

        System.out.println(driver.getTitle());
    }


    @Test
    public void yyGdsfeTest() {

        System.out.println(driver.getWindowHandle());


    }

//*******************


    @Test
    public void titleTest() {

        String title = driver.getTitle();
        Assert.assertEquals(title, "Sample API For Testing | Beeceptor");

    }

    @Test
    public void urlTest() {
        String url =
                driver.getCurrentUrl();
        Assert.assertEquals(url, "https://beeceptor.com/docs/sample-api-for-testing/");

    }

    @Test
    public void windowhTest() {

        System.out.println(driver.getWindowHandle());


    }

    @Test
    public void alllinksnumberTest() {
        int totalsize =
                driver.findElements(By.tagName("a")).size();
        System.out.println(totalsize);


    }

    @Test
    public void alllinksimagesTest() {

        int totalsize =
                driver.findElements(By.tagName("img")).size();
        System.out.println(totalsize);


    }


 */





    // 3 svg's xpath
    //1 query, 1 path
    // 1 form-data
    //1 powershell
    //1 pgm try catch finally combined

   // @Test
    public void circleTest() {

String text=driver.findElement(By.xpath("//*[local-name()='svg' ]//*[local-name()='text']")).getText();
Assert.assertEquals(text, "SVG text ( Click on me! )");

boolean b=
        driver.findElement(By.xpath("//*[local-name()='svg']//*[local-name()='circle']")).isDisplayed();
Assert.assertTrue(b);


//*[local-name()='svg']//*[local-name()='circle']

        boolean b1=
        driver.findElement(By.xpath("(//*[local-name()='svg']//*[local-name()='rect'])[1]")).isDisplayed();
        Assert.assertTrue(b1);
    }


    // staleele
    //1 uri/path
    // pgm try catch finally combined
//nosuchele
//javaexe
    //before class uri




    @Test
    public void cisfrcleTest() {

        WebElement wb=
        driver.findElement(By.xpath("//li//a[text()='Buttons']"));
        System.out.println(wb.getTagName());
//driver.navigate().refresh();
//
//String s=
//wb.getAttribute("id");
//        Assert.assertEquals(s, "sidebarButtons");

        JavascriptExecutor js=( JavascriptExecutor) driver;
        js.executeScript("winsssdow.scswrollBy(300, 55","" );


    }





}
