package pac1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.time.Duration;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

//import static org.assertj.core.api.BDDAssumptions

public class HDFCbankkkkkkkTest {

    WebDriver driver;

    @BeforeClass
    public void beforeClass() {

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");

        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
        driver.manage().deleteAllCookies();
        driver.get("https://www.opencart.com/");
        //driver.get("https://www.hdfc.com/");

    }

    @AfterClass
    public void afterClass() {
        driver.quit();
    }

   // @Test
    public void seTest() {

        ChromeOptions co = new ChromeOptions();
        co.addArguments("--disable-notifications");

        driver = new ChromeDriver(co);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
        driver.manage().deleteAllCookies();
        //driver.get("https://www.hdfc.com/");

        driver.get("https://www.opencart.com/");


      //  System.out.println(driver.getTitle());


    }



    //@Test
    public void sesTest() {

//
//        ChromeOptions co=new ChromeOptions();
//        co.addArguments("--disable-notifications");


        FirefoxOptions fo = new FirefoxOptions();
        fo.addArguments("--disable-notifications");
        fo.addArguments("--incognito");
        driver = new FirefoxDriver(fo);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
        driver.manage().deleteAllCookies();
        driver.get("https://www.hdfc.com/");
        System.out.println(driver.getCurrentUrl());
        driver.quit();

    }


    //@Test
    public void seddsTest() {

//
//        ChromeOptions co=new ChromeOptions();
//        co.addArguments("--disable-notifications");


        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
        driver.manage().deleteAllCookies();
        driver.get("https://www.hdfc.com/");
        System.out.println(driver.getCurrentUrl());
        driver.quit();

    }


    //@Test
    public void seddddsTest() {

        try {


            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
            driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
            driver.manage().deleteAllCookies();
            driver.get("https://www.hdfc.com/");


            String text =
                    driver.findElement(By.xpath("//a[@id='lp-hover']")).getText();
            Assert.assertTrue(text.contains("Home Loan Products"));


            String text1 =
                    driver.findElement(By.xpath("//div[normalize-space()='Housing Loans']")).getText();
            Assert.assertTrue(text1.contains("Housing Loans"));
            //text1.contains("Housing Loans");


            String text22 = driver.findElement(By.xpath("//select[starts-with(@id, 'lang')]")).getText();
            Assert.assertTrue(text22.contains("English"));

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            driver.quit();


        }


    }

   // @Test
    public void sedsddsTest() {

//
//        ChromeOptions co=new ChromeOptions();
//        co.addArguments("--disable-notifications");

        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
        driver.manage().deleteAllCookies();
       // driver.get("https://www.hdfc.com/");
        driver.get("https://www.hdfc.com/");

        System.out.println(driver.getWindowHandle());
        // driver.getWindowHandle()
    }

    //@Test
    public void sedsdsTest() throws Exception
    {
        String filepath = "C:\\Users\\pragt\\IdeaProjects\\ssd\\src\\test\\resources\\s23.properties";
        FileOutputStream fop=new FileOutputStream(filepath);
        Properties prop=new Properties();
        prop.setProperty("sus", "scssvss@123");
        prop.store(fop, "this is the msg");
        fop.close();

    }


    @Test
    public void sedddssdsTest() throws Exception
    {

//
//        explicit practice
//        @datapro in api
//        basepath


    //


      driver.findElement(By.xpath("(//li//a[text()='Demo'])[1]")).click();
      driver.findElement(By.xpath("//a[text()='Official Documentation']")).click();
     // String parent=driver.getWindowHandle();


        Set<String>set1=
      driver.getWindowHandles();

        Iterator<String>itr=
        set1.iterator();

        String pa=itr.next();
        String ch= itr.next();

        driver.switchTo().window(ch);

        boolean urlll=
        driver.getCurrentUrl().contains("https://docs.opencart.com/en-gb/introduction/");

        System.out.println(urlll);

driver.close();


    }





}






