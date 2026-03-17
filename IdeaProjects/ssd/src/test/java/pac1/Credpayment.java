package pac1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

    public class Credpayment {

        WebDriver driver;

        @BeforeClass
        public void setup() {

            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().deleteAllCookies();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
            driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
            driver.get("https://cred.club/");
        }

        @AfterClass
        public void teardown() {
            driver.quit();
        }


        @Test
        public void titleTest() {

            String title = driver.getTitle();
            Assert.assertTrue(title.contains("CRED"));

        }


        @Test
        public void urlTest() {


            String url = driver.getCurrentUrl();
            Assert.assertTrue(url.contains("club"));

        }

        @Test
        public void copywrightest() {

            boolean copy =
                    driver.findElement(By.xpath("(//div[contains(text(), 'copyright © ')])[1]")).isDisplayed();
            Assert.assertTrue(copy);


        }

        @Test
        public void headerTest() {

            boolean header =
                    driver.findElement(By.xpath("(//div[starts-with(@id, 'navbar-wrapp')])[1]")).isDisplayed();
            Assert.assertTrue(header);
        }

        @Test
        public void qrcodeTest() {

            boolean flag =
                    driver.findElement(By.xpath("//div[@class='sc-q224e2-4 jaEGKO']//img[@class='sc-6ca9pz-4 eLznSh']")).isDisplayed();
            Assert.assertTrue(flag);
        }

        @Test
        public void qrcddodeTest() {
//
//        boolean flag =
//                driver.findElement(By.xpath("//div[@class='sc-q224e2-4 jaEGKO']//img[@class='sc-6ca9pz-4 eLznSh']")).isDisplayed();
//        Assert.assertTrue(flag);
//
//

            boolean b =
                    driver.findElement(By.xpath("(//div[contains(text(), 'copyright © ')])[1]")).isDisplayed();
            System.out.println(b);
            Assert.assertTrue(b);


        }


        @Test
        public void qrcdddsdodeTest() {
//
            System.out.println(driver.getTitle());
boolean b=

            driver.findElement(By.xpath("(//div[@id='navbar-wrapper']//*[name()='svg'])[1]")).isDisplayed();
Assert.assertEquals(b, true);
        }


        //reate new scratch file from selection




    }















