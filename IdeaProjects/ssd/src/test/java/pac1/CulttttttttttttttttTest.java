package pac1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class CulttttttttttttttttTest {


    WebDriver driver;
//    String filepath = "C:\\Users\\pragt\\IdeaProjects\\ssd\\src\\test\\resources\\eer.properties";
//    Properties prop;
//    Properties prop1;


    @BeforeClass
    public void setup() throws Exception {

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
        driver.manage().deleteAllCookies();
        driver.get("https://practicetestautomation.com/practice-test-login/");


//        FileInputStream fip=new FileInputStream(filepath);
//        prop = new Properties();
//        prop.load(fip);


    }


    @AfterClass
    public void tear() {
        driver.quit();

    }


    @Test
    public void yyGeTest(){

//        Dimension d = driver.findElement(By.xpath("//img[@alt='Make My Trip']")).getSize();
//        System.out.println(d.getWidth());

        System.out.println(driver.getTitle());


    }


    @Test
    public void yysGeTest(){

//        Dimension d = driver.findElement(By.xpath("//img[@alt='Make My Trip']")).getSize();
//        System.out.println(d.getWidth());

        System.out.println(driver.getWindowHandle());





    }
}

