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

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.List;

public class Amazon {


    WebDriver driver;
    JavascriptExecutor js;

    @BeforeClass
    public void setup() {

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
        driver.get("https://www.wanderfly.in/");




    }

    @AfterClass
    public void teardown() {
        driver.quit();
    }
//
//    @Test(priority = 1)
//    public void titleTest() {
//        String title =
//                driver.getTitle();
//        Assert.assertTrue(title.contains("Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes"));
//
//
//    }
//
//    @Test(priority = 2)
//    public void UrlTest() {
//        String url=
//                driver.getCurrentUrl();
//        Assert.assertTrue(url.contains("amazon.in"));
//
//    }
//







    @Test(priority = 3)
    public void brokenlinks() throws IOException {


        List<WebElement> list=
        driver.findElements(By.tagName("a"));

        for(int i=0;i<=list.size()-1;i++)
        {

            String s=list.get(i).getAttribute("href");
            broke(s);
        }

    }

    public static void broke(String s) throws IOException {

        URL url=new URL(s);
        HttpURLConnection hip=(HttpURLConnection)url.openConnection();
        hip.connect();
        hip.setConnectTimeout(3000);
      int responsecode=  hip.getResponseCode();

      if(responsecode==400 || responsecode==401 || responsecode==404 || responsecode==403 || responsecode==405)
        {
          System.out.println(s + " " + "broken");
      }

   }






}
