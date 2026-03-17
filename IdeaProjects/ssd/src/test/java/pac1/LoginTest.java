package pac1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;
import java.util.Properties;

public class LoginTest {

    WebDriver driver;

    String filepath ="C:\\Users\\pragt\\IdeaProjects\\ssd\\src\\test\\resources\\G7.properties";
    String filepath1 ="C:\\Users\\pragt\\IdeaProjects\\ssd\\src\\test\\resources\\G9.properties";
    //String filepath1 ="";

    @BeforeClass
    public void setup() {


        ChromeOptions options = new ChromeOptions();
       // options.addArguments("headless");
        options.addArguments("incognito");
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
      //  driver.get("https://practice.expandtesting.com/login");
        driver.get("https://www.tutorialspoint.com/selenium/practice/selenium_automation_practice.php");
    }

    @AfterClass
    public void teardown() {
        driver.quit();
    }


    @Test(priority = 1)
    public void titleTest() {
        String title =
                driver.getTitle();
        Assert.assertTrue(title.contains("Test Login Page for Automation Testing Practice"));


    }


    @Test(priority = 1)
    public void urlTest() {
        String title =
                driver.getCurrentUrl();
        Assert.assertTrue(title.contains("https://practice.expandtesting.com/login"));


    }

    @Test(priority = 1)
    public void alllinksTest() throws Exception{
        List<WebElement> list =
                driver.findElements(By.tagName("a"));
        System.out.println(list.size());

        for (WebElement wb : list) {
            String s = wb.getAttribute("href");
            brokenlinkwssss(s);
        }



    }




//
//    @Test(priority = 1)
//    public void allimagesTest() {
//        List<WebElement> list=
//                driver.findElements(By.tagName("img"));
//        System.out.println(list.size());
//    }


    public static void brokenlinkwssss(String s1) throws Exception
    {

        URL url=new URL(s1);
        HttpURLConnection hip=(HttpURLConnection)url.openConnection();
        hip.connect();
        hip.setConnectTimeout(4000);
      int responsecode=  hip.getResponseCode();
      if(responsecode == 200)

          System.out.println(s1 + " " + "not broken");
      else

          System.out.println(s1 + " " + "broken");


    }

// brokenlinkwssss

    //@Test(priority = 2)
//    public void UrlTest() {
//        String url=
//                driver.getCurrentUrl();
//        Assert.assertTrue(url.contains("amazon.in"));
//
//    }
//




    @Test(priority = 1)
    public void anvnvksTest() throws Exception {




        FileInputStream fip=new FileInputStream(filepath);
        Properties prop=new Properties();
        prop.load(fip);
      String fir= prop.getProperty("fi");
        System.out.println(fir);

        String sub= prop.getProperty("su");
        System.out.println(sub);

        driver.findElement(By.name("name")).sendKeys(fir);
        driver.findElement(By.id("subjects")).sendKeys(sub);


        FileOutputStream fop=new FileOutputStream(filepath1);
        Properties prop1=new Properties();
        prop1.setProperty("city", "dlh");
prop1.store(fop, "msg");
fop.close();


    }
}
