package pac1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

public class Cultttttttttttrf44Test {

//    5 tc's from  https://rahulshettyacademy.com/
//            5 svg's
//    properties file selenium -3 times getproperty, 3 times setproperty

    @AfterClass
    public void teardown() {
        driver.quit();

    }


    @Test(priority = 1)
    public void cDDddTest() {


        System.out.println(driver.getTitle());
    }

    WebDriver driver;
    Properties prop;
    Properties prop1;
    String filepath="C:\\Users\\pragt\\IdeaProjects\\ssd\\src\\test\\resources\\s1.properties";
    String filepath1="C:\\Users\\pragt\\IdeaProjects\\ssd\\src\\test\\resources\\s2.properties";


    @BeforeClass
    public void sestup() throws IOException {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
        driver.manage().deleteAllCookies();
        driver.get("https://rahulshettyacademy.com/");
        //driver.getTitle().contains("Lovable - Build Apps & Websites with AI, Fast | No Code App Builder");



        FileInputStream fip=new FileInputStream(filepath);
        prop=new Properties();
        prop.load(fip);



    }


    @Test(priority = 2)
    public void cDDdssdTest() {
        System.out.println(driver.getCurrentUrl());
        //  driver.getTitle();
    }


    @Test(priority = 3)
    public void cDDdsssdTest() {
        System.out.println(driver.getWindowHandle());


    }

    @Test(priority = 3)
    public void cDDdssssdTest() throws Exception {

        driver.get("https://www.w3schools.com/graphics/svg_intro.asp");
        Thread.sleep(6000);
        System.out.println(driver.findElement(By.xpath("//*[local-name()='svg' and @id='tnb-google-search-icon']")).isDisplayed());
    }

    //@Test(priority = 4)
    public void cDDdsssssdTest() throws Exception {

        driver.get("https://selectorshub.com/");
        Thread.sleep(6000);
        System.out.println(driver.findElement(By.xpath("https://www.w3schools.com/graphics/svg_intro.asp")).isDisplayed());

    }


    @Test(priority = 4)
    public void takeandgivedataTest() throws Exception {

        driver.get("https://www.svgrepo.com/");
        Thread.sleep(14000);

        WebElement wb=
        driver.findElement(By.xpath("//a[@title='Saved Vectors']//*[local-name()='svg' and @stroke-linecap='round']"));

        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@title='Saved Vectors']//*[local-name()='svg' and @stroke-linecap='round']")));

        boolean b=wb.isDisplayed();
        System.out.println(b);
        Assert.assertEquals(b, true);

//
//        boolean b=
//        driver.findElement(By.xpath("//a[@title='Saved Vectors']//*[local-name()='svg' and @stroke-linecap='round']")).isDisplayed();
//        System.out.println(b);

      }




    @Test(priority = 5)
    public void takadatafrompropertiesTest() throws Exception {

driver.get("https://www.tutorialspoint.com/selenium/practice/selenium_automation_practice.php");
Thread.sleep(8000);
String useer=prop.getProperty("userrrrr");
String emaiil=prop.getProperty("emaillllllll");


driver.findElement(By.id("name")).sendKeys(useer);
driver.findElement(By.id("email")).sendKeys(emaiil);

String s=
        driver.findElement(By.id("name")).getText();

        System.out.println(s);
    }


    @Test(priority = 6)
    public void givedatatopropertiesTest() throws Exception {

        FileOutputStream fop=new FileOutputStream(filepath1);
        prop1=new Properties();
        prop1.setProperty("user", "test");
        prop1.store(fop, "message");
        fop.close();
    }


}
