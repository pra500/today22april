package pac1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;

public class CulttTest {


    WebDriver driver;

    @BeforeClass
    public void setup() {

//        ChromeOptions options = new ChromeOptions();
//        options.addArguments("disable-popup-blocking");
//        //  options.addArguments("ac

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
        driver.manage().deleteAllCookies();
        driver.get("https://cultstore.com/collections/footwear?sort_by=manual&filter.v.availability=1&utm_source=google&utm_medium=search&utm_campaign=Cultstore_Search_Footwear_Brand_1Nov25&utm_term=cultfit%20shoes%20review&device=c&utm_matchtype=b&utm_network=g&utm_placement=&utm_content=781492109971&utm_Adposition=&utm_location=9062010&utm_Sitelink=}&utm_Audience=kwd-2460564378602&utm_campaignid=23208498187&utm_adgroupid=189349532602&utm_adgroup=&gad_source=1&gad_campaignid=23208498187&gbraid=0AAAAAofSwy0wgGY1Kzxsc5a6YPR24UXJG&gclid=Cj0KCQiA18DMBhDeARIsABtYwT2x6IvcwllKYCBZhYZbVF7SYRlDYsIg3djHo7-L4TcaNhJVwPkKjNwaAsaaEALw_wcB");


//        driver.findElement(By.cssSelector(".IntegrationModal-viewDemoBtn")).click();


        // driver.get("https://www.opencart.com/");


    }

    @AfterClass
    public void teardown() {
        driver.quit();


    }


    @Test
    public void menuTest() throws Exception {

//
//        FirstName=pragti
//        LastName=gupta
//        MobileNumber=9054590000
//        dateOfBirthInput=12 Feb 2026

//
//        String filepath = "C:\\Users\\pragt\\IdeaProjects\\ssd\\src\\test\\resources\\a.properties";
//        FileInputStream fip = new FileInputStream(filepath);
//        Properties prop = new Properties();
//        prop.load(fip);
//
//
        String title =
                driver.getTitle();

        System.out.println(title);


    }
}