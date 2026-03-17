package pac1;

import freemarker.core.CSSOutputFormat;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

public class fgTest {

    @AfterClass
    public void teardown() {
        driver.quit();

    }


    @Test(priority = 1)
    public void cDDddTest() {
        System.out.println(driver.getTitle());
//driver.getTitle()
    }

    WebDriver driver;
    //Properties prop;
    //Properties prop1;
    //String filepath = "C:\\Users\\pragt\\IdeaProjects\\ssd\\src\\test\\resources\\s1.properties";
    //String filepath1 = "C:\\Users\\pragt\\IdeaProjects\\ssd\\src\\test\\resources\\s2.properties";


    @BeforeClass
    public void sestup() throws IOException {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
        driver.manage().deleteAllCookies();
        driver.get("https://www.w3schools.com/sql/sql_editor.asp");

        System.out.println(driver.getTitle());


    }

}

