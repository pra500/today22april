package pac1;

import org.testng.annotations.Test;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;


import java.time.Duration;

public class RahulllllTest {

    WebDriver driver;
@Test
    public void geeTest() {
    driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
    driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
    driver.manage().deleteAllCookies();
    driver.get("https://treetor.com/#");
    System.out.println(driver.getCurrentUrl());
 //   System.out.println(driver.getCurrentUrl());


    System.out.println(driver.getTitle());

   // driver.getTitle()

    driver.findElement(By.xpath("//input[@inputmode='numeric']"))
            .sendKeys("1");
    driver.quit();

}


}
