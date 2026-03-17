package pac1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class Stripeeee {


    WebDriver driver;


    @BeforeClass
    public void setup() {

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
        driver.manage().deleteAllCookies();
        driver.get("https://checkout.stripe.dev/");
        driver.findElement(By.cssSelector(".IntegrationModal-viewDemoBtn")).click();



    }


    public void teardown() {
        driver.quit();

    }

    @Test
    public void menuTest() {

        System.out.println(driver.getTitle());



    }

    @Test
    public void menduTest() {
        System.out.println( driver.getCurrentUrl());



    }

    @Test
    public void messnuTest() {
        System.out.println( driver.getWindowHandle());


    }

    @Test
    public void menu1Test() {
int size=
       driver.findElements(By.tagName("a")).size();
        System.out.println(size);


    }

    @Test
    public void menu2Test() {

        int size=
                driver.findElements(By.tagName("img")).size();
        System.out.println(size);



    }

    @Test
    public void menu3Test() {


        int size=
                driver.findElements(By.tagName("div")).size();
        System.out.println(size);

    }

    @Test
    public void menu4Test() {


        int size=
                driver.findElements(By.tagName("table")).size();
        System.out.println(size);

    }


}
