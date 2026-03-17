package pac1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.text.FieldPosition;
import java.time.Duration;
import java.util.List;
import java.util.Properties;

public class AbhibusTest {

    WebDriver driver;

//    JavascriptExecutor js;
//
//    @BeforeClass(alwaysRun = true)
//    public void setup() {
//
//        driver = new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
//        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
//        driver.manage().deleteAllCookies();
//        //  driver.get("https://www.abhibus.com/");
//
//        //driver.get("https://www.yatra.com/");
//
//        driver.get("https://www.wanderfly.in/");
//    }
//
//    @AfterClass(alwaysRun = true)
//    public void teardown() {
//
//        driver.quit();
//    }
//
//    //1) Verify Home Page Loads Successfully
//    // @Test(priority = 0)
//    public void logoandtitlevSerifyTest() {
//
//        // System.out.println(driver.getTitle().contains("Yatra.com – Best Travel Website. Book Flights, Hotels, Trains, Holidays &amp; Bus Tickets"));
//        System.out.println(driver.getTitle());
//    }
//
//
//    //@Test
//    public void FaqsTest() {
////
////WebElement resources=
////        driver.findElement(By.xpath("//button[starts-with(text(), 'Resources')]"));
////boolean presence=
////resources.isDisplayed();
////        Assert.assertEquals(presence, true);
////        WebElement faq=
////        driver.findElement(By.xpath("//a[starts-with(text(), 'FAQ')]"));
////
////
////        Actions actions = new Actions(driver);
////        actions.moveToElement(resources).click(faq).build().perform();
////
////
////
////        String url= driver.getCurrentUrl();
////        Assert.assertEquals("https://www.wanderfly.in/faq", url);
//
//    }
//
//
//    //@Test
//    public void FaDqsTest() throws Exception {
////        C:\Users\pragt\IdeaProjects\ssd\src\test\resources\drfee.properties
////
////        C:\Users\pragt\IdeaProjects\ssd\src\test\resources\b.properties
////
//
//        String fws = "C:\\Users\\pragt\\IdeaProjects\\ssd\\src\\test\\resources\\drfee.properties";
//        FileInputStream fi = new FileInputStream(fws);
//        Properties prop = new Properties();
//        prop.load(fi);
//
//        prop.getProperty("");
//    }
//
//
//    @Test
//    public void FddaqsTest() {
//        Assert.assertEquals("https://www.wanderfly.in/", driver.getCurrentUrl());
//    }
//
//    @Test
//    public void FddddaqsTest() {
//        Assert.assertEquals("Wanderfly | Stop the Burnout. Start the Vibes.", driver.getTitle());
//    }
//
//
//    @Test
//    public void FddSDddaqsTest() {
//        // Assert.assertEquals("Wanderfly | Stop the Burnout. Start the Vibes.", driver.getTitle());
//
//        String filepath = "C:\\Users\\pragt\\IdeaProjects\\ssd\\src\\test\\resources\\gg5.properties";
//
//    }
//
//
//    @Test
//    public void FddSDddddaqsTest() {
//        // Assert.assertEquals("Wanderfly | Stop the Burnout. Start the Vibes.", driver.getTitle());
//
//        // String filepath="C:\\Users\\pragt\\IdeaProjects\\ssd\\src\\test\\resources\\gg5.properties";
//
//
//    }
//
//
//    @Test
//    public void vbTest() {
//        // Assert.assertEquals("Wanderfly | Stop the Burnout. Start the Vibes.", driver.getTitle());
//
//        // String filepath="C:\\Users\\pragt\\IdeaProjects\\ssd\\src\\test\\resources\\gg5.properties";
//
//    }
//
//    @Test
//    public void FgfbfTest() {
//
//        System.out.println(driver.getTitle());
//        //System.out.println(driver.getTitle());
//        // driver.getTitle();
//    }
//
//
//    @Test
//    public void FgdcfbfTest() {
//
//        System.out.println(driver.getCurrentUrl());
//
//    }
//
//    //@Test
//    public void FgdcfxbfTest() {
//
//        System.out.println(driver.getCurrentUrl());
//    }
//
//    @Test
//    public void FgsddcfxbfTest()  throws  Exception{
//
//driver.get("https://selectorshub.com/");
//
//Thread.sleep(5000);
//        System.out.println(driver.getCurrentUrl());
//    }
//
//    @Test
//    public void FgsddddcfxbfTest()  throws  Exception{
//
//        driver.get("https://selectorshub.com/");
//
//        Thread.sleep(5000);
//        System.out.println(driver.getCurrentUrl());
//
//    }
//

    @BeforeClass(alwaysRun = true)
    public void seftup() {

    ChromeOptions options=new ChromeOptions();
    options.addArguments("--incognito-");
    //options.addArguments("--headless-");
    options.addArguments("--disable-gpu-");
    options.addArguments("--disable-chrome-extensions");
    options.addArguments("--disable-infobars");
    options.addArguments("--disable-autofilled");

        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
        driver.manage().deleteAllCookies();
        //  driver.get("https://www.abhibus.com/");

        //driver.get("https://www.yatra.com/");

        driver.get("https://www.wanderfly.in/");


    }
@AfterClass
public void tearDown() {
driver.quit();
}

@Test
public void FgsDddddcfxbfTest()
{
    System.out.println(driver.getTitle());

}



    @Test
    public void FgsDdsfdddcfxbfTest()
    {
        String s=
       driver.getWindowHandle();
        System.out.println(s);

    }

    @Test
    public void FgsDddddddddcfxbfTest() throws IOException {

        List<WebElement> list =
                driver.findElements(By.tagName("a"));
        System.out.println(list.size());

        for (int i = 0; i <= list.size() - 1; i++) {
            String s =
                    list.get(i).getAttribute("href");
            broken(s);
        }
    }


public static void broken(String ss) throws IOException {

            URL url=new URL(ss);
            HttpURLConnection hip=(HttpURLConnection)url.openConnection();
            hip.connect();
            hip.setConnectTimeout(5000);
           int code= hip.getResponseCode();

           if(code==400)
           {
               System.out.println(ss + " " + "broken");
           }



        }




    @Test
    public void FgsDddddddcfxbfTest()
    {
        System.out.println(driver.getTitle());


    }



//
//    Selenium Intermediate (11–20)
//1️⃣1️⃣ Switch to iframe and type text inside it.
//
//            1️⃣2️⃣ Open a link in new tab and switch to it.
//
//            1️⃣3️⃣ Count number of rows in a web table.
//
//            1️⃣4️⃣ Click dynamic element using XPath.
//
//1️⃣5️⃣ Scroll to bottom of page using JavaScriptExecutor.
//
//1️⃣6️⃣ Wait for element using WebDriverWait.
//
//1️⃣7️⃣ Upload a file using sendKeys().
//
//            1️⃣8️⃣ Take a screenshot.






}
