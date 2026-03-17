package Speedpac;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class Rahul1 {


    //no such javas stale stale no such


    WebDriver driver;



    @BeforeClass
    public void setup() {

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
        driver.manage().deleteAllCookies();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");

    }

    @AfterClass
    public void teardown() {
        driver.quit();



    }

    @Test
    public void a1Test()
    {
        boolean b=
        driver.findElement(By.xpath("//legend[text()='Suggession Classss Example']")).

                isDisplayed();
        System.out.println(b);
    }





    @Test
    public void a2Test()
    {
        boolean b=
                driver.findElement(By.xpath("//legend[text()='Checskbox Example']")).

                        isDisplayed();
        System.out.println(b);
    }




    @Test
    public void a3Test()
    {
        WebElement b=
                driver.findElement(By.xpath("//legend[text()='Suggession Class Example']"));

        driver.navigate().refresh();
        System.out.println(b.getText());
    }




    @Test
    public void a4Test()
    {
        WebElement b=
                driver.findElement(By.xpath("//h1[text()='Practice Page']"));

        driver.navigate().refresh();
        System.out.println(b.getText());
    }











}