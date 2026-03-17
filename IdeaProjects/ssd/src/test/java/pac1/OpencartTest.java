package pac1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class OpencartTest {

    WebDriver driver;

    @BeforeClass
    public void setup() {

        ChromeOptions options = new ChromeOptions();
        options.addArguments("disable-popup-blocking");
        //  options.addArguments("ac

        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
        driver.manage().deleteAllCookies();
        driver.get("https://www.wanderfly.in/");


    }

    @AfterClass
    public void teardown() {

        driver.quit();
    }


    @Test
    public void geTest()
    {
        System.out.println(driver.getTitle());


    }


    @Test
    public void gesTest()
    {
        System.out.println(driver.getWindowHandle());


    }

    @Test
    public void geeedTest()
    {
        System.out.println(driver.getCurrentUrl());
    }

    @Test
    public void ggTest(){
        List<WebElement> list=
                driver.findElements(By.xpath("//ul[starts-with(@class, 'nav navbar-nav')]"));

        for(WebElement wb:list)
        {
            if(wb.getText().equalsIgnoreCase("Features"))
            {
                System.out.println(wb.getText());
            }

        }


    }


}
