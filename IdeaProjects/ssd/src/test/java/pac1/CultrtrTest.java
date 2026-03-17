package pac1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

import java.time.Duration;

public class CultrtrTest {

    public static WebDriver driver;

    public static void main(String[] args) {

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
        driver.manage().deleteAllCookies();
        driver.get("https://www.opencart.com/");
     //   driver.get("https://www.opencart.com/");
        System.out.println(driver.getTitle());

        System.out.println(driver.getCurrentUrl());
//
//        driver.getCurrentUrl()
//            driver.getTitle()


//        boolean h =
//                driver.findElement(By.xpath("//div/a[text()='EXPLORE CULTPASS']")).isDisplayed();
//        System.out.println(h);
//
//
//        String txt =
//                driver.findElement(By.xpath("(//img[@alt='vman-and-white-cult-text'])[1]")).getText();
//        System.out.println(txt);
//
//
//        String txt1 =
//                driver.findElement(By.xpath("(//img[@alt='vman-and-white-cult-text'])[1]")).getAttribute("class");
//        System.out.println(txt1);



String tex=
        driver.findElement(By.xpath("(//li//a[text()='Demo'])[2]")).getText();
        System.out.println(tex);



        String texw=
                driver.findElement(By.xpath("//li//a[text()='Blog']")).getText();
        System.out.println(texw);


        String texw1=
                driver.findElement(By.xpath("//li//a[text()='Blog']")).getAttribute("href");
        System.out.println(texw1);






    }


}

