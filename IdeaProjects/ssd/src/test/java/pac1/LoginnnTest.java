package pac1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

public class LoginnnTest {


    WebDriver driver;
    Properties prop;
    String filepath = "C:\\Users\\pragt\\IdeaProjects\\ssd\\src\\test\\resources\\G5.properties";
    String filepatthforwrite = "C:\\Users\\pragt\\IdeaProjects\\ssd\\src\\test\\resources\\G7.properties";


    @Test
    public void seTest() throws IOException, InterruptedException {

        ChromeOptions co = new ChromeOptions();
        co.addArguments("--disable-notifications");

        driver = new ChromeDriver(co);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
        driver.manage().deleteAllCookies();
        driver.get("https://www.testmuai.com/lp/web-automation-tools/?utm_source=google&utm_medium=cpc&utm_campaign=TestMu_Search_Generic_RLSA_Automation_Testing_India_2026&utm_term=automation%20testing%20websites&utm_id=23522834320&utm_content=WebsiteAutomation-Phrase&gad_source=1&gad_campaignid=23522834320&gbraid=0AAAAAp7I9OL6M4ztYKdfYhBiuvBU6dF7y&gclid=CjwKCAiAwNDMBhBfEiwAd7ti1Hel9gTu4VnpZ8AwA41XAJXXnSr8fv-dz0zE00j2YGoxWuMD7cjPihoC2IgQAvD_BwE");
        driver.findElement(By.xpath("//div[@class='chfw-lp-menu']//button[text()='Book a Demo']")).click();


        FileInputStream fip = new FileInputStream(filepath);
        prop = new Properties();
        prop.load(fip);
        String email = prop.getProperty("email");


        WebElement wb = driver.findElement(By.id("inputFirstName"));

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(6));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("inputFirstName")));
        wb.sendKeys(email);


        //fileoutputstream:
        FileOutputStream f1 = new FileOutputStream(filepatthforwrite);
        prop.setProperty("email", "pra2333@yahoo.com");
        prop.store(f1, "this is the text");
        f1.close();


        driver.quit();

        //driver.quit();


    }


}
