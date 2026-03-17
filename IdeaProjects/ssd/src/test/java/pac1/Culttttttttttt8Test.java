package pac1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.FileOutputStream;
import java.time.Duration;
import java.util.Properties;

public class Culttttttttttt8Test {
    WebDriver driver;



//    Properties prop;
//    String filepath = "C:\\Users\\pragt\\IdeaProjects\\ssd\\src\\test\\resources\\b.properties";

    @BeforeMethod
    public void setup() {


        ChromeOptions options=new ChromeOptions();
        options.addArguments("headless");

        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
        driver.manage().deleteAllCookies();
        //   driver.get("https://www.testmuai.com/lp/web-automation-tools/?utm_source=google&utm_medium=cpc&utm_campaign=TestMu_Search_Generic_RLSA_Automation_Testing_India_2026&utm_term=automation%20testing%20websites&utm_id=23522834320&utm_content=WebsiteAutomation-Phrase&gad_source=1&gad_campaignid=23522834320&gbraid=0AAAAAp7I9OIEbbWK7-RIcMjWx2nvHFZA4&gclid=CjwKCAiAncvMBhBEEiwA9GU_fq8ZbuR_lFyttGAOx7qqmx3dHKH8cIcavLBO5n2gx3uwbW6eupuU-hoColUQAvD_BwE");

        driver.get("https://rahulshettyacademy.com/");
    }

    @AfterMethod
    public void teardown() {

        driver.close();
    }

    @Test
    public void GeTest(){

        System.out.println(driver.findElements(By.tagName("a")).size());



    }


}
