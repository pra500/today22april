package pac1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

public class BaTest {

    WebDriver driver;

    @BeforeMethod
    public void setup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
        driver.manage().deleteAllCookies();
      //  driver.get("https://www.makemytrip.com/");

        driver.get("https://www.opencart.com/");


    }

    @AfterMethod
    public void teardown() {

        driver.close();
    }

//    @Test
//    public void GeTest() {
//
//        System.out.println(driver.getTitle());
//    }
//
//    @Test
//    public void GedTest() {
//
//        System.out.println(driver.getTitle());
//    }
//
//
//    @Test
//    public void GeeeTest() {
//
//        System.out.println(driver.getTitle());
//    }
//    @Test
//    public void GeerrTest() {
//
//        System.out.println(driver.getTitle());
//    }
//
//    @Test
//    public void GeedrrTest() {
//
//        System.out.println(driver.getTitle());
////driver.getTitle()
//
//    }
//
//
//
//
//
//
//

@Test
    public void GeeeerrTest() {

        System.out.println(driver.getWindowHandle());

//System.out.println(driver.getTitle());
    }




    @Test
    public void GeeeeeerrTest() {

        System.out.println(driver.getWindowHandle());

//System.out.println(driver.getTitle());


    }

    @Test
    public void GeeeeeeeerrTest() {

        System.out.println(driver.getCurrentUrl());

//System.out.println(driver.getTitle());


    }
    @Test
    public void Geee33dseeerrTest() {

        System.out.println(driver.getTitle());

//System.out.println(driver.getTitle());

    }


    @Test
    public void GeeedseeerrTest() {

        System.out.println(driver.getTitle());

//System.out.println(driver.getTitle());

    }



    @Test
    public void GeeedswwddeeerrTest() {

        System.out.println(driver.getTitle());

//System.out.println(driver.getTitle());

    }

    @Test
    public void GeeedsdwwwwdeeerrTest() {

        System.out.println(driver.getTitle());

//System.out.println(driver.getTitle());

    }
    @Test
    public void GeeedsddeeerrTest() {

        System.out.println(driver.getTitle());

//System.out.println(driver.getTitle());

    }

    @Test
    public void GeeedddsddeeerrTest() {

boolean b=
driver.findElement(By.xpath("//li//a[text()='Marketplace']")).isDisplayed();
        Assert.assertEquals(b, true);

        String s=
        driver.findElement(By.xpath("//li//a[text()='Refund Policy']")).getText();
        Assert.assertEquals(s, "Refund Policy");

String s1=driver.findElement(By.xpath("//li//a[text()='Extension Developer']")).getAttribute("href");
        Assert.assertEquals(s1, "https://www.opencart.com/index.php?route=cms/information&information_id=2");




        driver.findElement(By.xpath("//input[@name='newsletter']")).sendKeys("gauravee4334@gmail.com");
        driver.findElement(By.xpath("//button[@class='btn btn-primary subscribe']"))
                .click();

        driver.findElement(By.xpath("//input[@id='mc-embedded-subscribe']")).click();


        Set<String> set1=driver.getWindowHandles();
        Iterator<String>itr1=set1.iterator();
     String parent= itr1.next();
     String child=  itr1.next();

     driver.switchTo().window(child);
        System.out.println(driver.getCurrentUrl());
Assert.assertEquals("https://opencart.us2.list-manage.com/subscribe/post?u=7682b9d9bc273d548837cfa79&id=88ee7f5931&f_id=00a853e0f0"
, driver.getCurrentUrl());
        driver.close();

        //driver.findElement(By.xpath("//button[@class='close']")).click();
        driver.switchTo().window(parent);

        Assert.assertEquals("https://www.opencart.com/", driver.getCurrentUrl());

    }
}
