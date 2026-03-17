package pac1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.FileOutputStream;
import java.time.Duration;
import java.util.Properties;

public class BaaTest {
    WebDriver driver;
    Properties prop;
    String filepath = "C:\\Users\\pragt\\IdeaProjects\\ssd\\src\\test\\resources\\b.properties";

    @BeforeMethod
    public void setup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
        driver.manage().deleteAllCookies();
        driver.get("https://www.testmuai.com/lp/web-automation-tools/?utm_source=google&utm_medium=cpc&utm_campaign=TestMu_Search_Generic_RLSA_Automation_Testing_India_2026&utm_term=automation%20testing%20websites&utm_id=23522834320&utm_content=WebsiteAutomation-Phrase&gad_source=1&gad_campaignid=23522834320&gbraid=0AAAAAp7I9OIEbbWK7-RIcMjWx2nvHFZA4&gclid=CjwKCAiAncvMBhBEEiwA9GU_fq8ZbuR_lFyttGAOx7qqmx3dHKH8cIcavLBO5n2gx3uwbW6eupuU-hoColUQAvD_BwE");

    }

    @AfterMethod
    public void teardown() {

        driver.close();
    }
    //@Test
    public void GeTest() throws Exception {

        FileOutputStream fop = new FileOutputStream(filepath);
        prop = new Properties();
        prop.setProperty("date", "11/12/2023");
        prop.store(fop, "msg");
        fop.close();



    }


    @Test
    public void GsseTest() throws Exception {

        System.out.println(driver.getWindowHandle());



    }



    @Test
    public void GsseddTest() throws Exception {

        System.out.println(driver.getTitle());



    }

    @Test
    public void GsssweddTest() throws Exception {

        System.out.println(driver.getCurrentUrl());



    }




}
