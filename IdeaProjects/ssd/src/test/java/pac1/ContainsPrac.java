package pac1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.time.Duration;
import java.util.Properties;

public class ContainsPrac {

    public static WebDriver driver;
    public static Properties prop;
    public static   String filepath="C:\\Users\\pragt\\IdeaProjects\\ssd\\src\\test\\resources\\G5.properties";
    public static   String filepatthforwrite = "C:\\Users\\pragt\\IdeaProjects\\ssd\\src\\test\\resources\\G6.properties";

    public static void main(String[] args) throws Exception {


//
//            driver = new ChromeDriver();
//            driver.manage().window().maximize();
//            driver.manage().deleteAllCookies();
//            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
//            driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(50));
//            driver.get("https://www.worldometers.info/coronavirus/country/india/");
//            System.out.println(driver.getTitle());
//            System.out.println( driver.getCurrentUrl());
//
//        String text=driver.findElement(By.xpath("//img[@title='Worldometer']")).getText();
//
//        System.out.println(text.contains("Worldometer"));





      //  driver.findElement(By.xpath("//img[@title='Worldometer']")).getText();
       // driver.getCurrentUrl()

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(50));
       // driver.get("https://www.worldometers.info/coronavirus/country/india/");

        driver.get("https://www.opencart.com/");
        System.out.println(driver.getTitle());
        System.out.println( driver.getCurrentUrl());


        driver.findElement(By.xpath("//div[@class='navbar-right hidden-xs']//a[starts-with(text(), 'Login')]")).click();


        FileInputStream fip=new FileInputStream(filepath);
        prop=new Properties();
        prop.load(fip);
       String email= prop.getProperty("email");

Thread.sleep(3000);


        WebElement emailelement=
       //driver.findElement(By.xpath("//input[@id='input-email']"));

        driver.findElement(By.id("input-email"));
        emailelement.sendKeys(email);
      String text=  emailelement.getText();
      Assert.assertEquals(text, "pra22@yahoo.com");


      //fileoutputstream:

FileOutputStream f1=new FileOutputStream(filepatthforwrite);
prop.setProperty("email", "pra22@yahoo.com");
prop.store(f1, "this is");
f1.close();

driver.quit();

    }
}
