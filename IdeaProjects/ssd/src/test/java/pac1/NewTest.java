package pac1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import java.time.Duration;

public class NewTest {

    WebDriver driver;

    @BeforeClass
    public void setup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
        driver.manage().deleteAllCookies();
        driver.get("https://www.cult.fit/");


    }

    @AfterClass
    public void teardown() {

        driver.close();
    }

    /*

//    @Test
//    public void GeTest() {
//
//        System.out.println(driver.getTitle());
//    }
//


        @Test
        public void Test1() {
            System.out.println(driver.getTitle());
            //driver.getTitle()
        }

        @Test
        public void Test21() {
            System.out.println(driver.getCurrentUrl());
            //driver.getTitle()
        }

        @Test
        public void Test33w3w31() {
            System.out.println(driver.getWindowHandle());
            //driver.getTitle()
        }

    @Test
    public void Test32w3w31() {
        System.out.println(driver.findElements(By.tagName("input")).size());
        //driver.getTitle()
    }

    @Test
    public void Testw3wsdd31() {
        System.out.println(driver.findElements(By.tagName("img")).size());
        //driver.getTitle()
    }
    @Test
    public void Testwww3w31() {
        System.out.println(driver.findElements(By.tagName("a")).size());
        //driver.getTitle()
    }


    @Test
    public void Testewww3w31Test() {
        System.out.println(driver.findElements(By.tagName("a")).size());
        //driver.getTitle()
    }

    @Test
    public void Testwwdeew3w31Test() {
        System.out.println(driver.findElements(By.tagName("button")).size());
        //driver.getTitle()



    }

     */






}
