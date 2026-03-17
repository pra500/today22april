package pac1;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class Pyatmmmm {

    WebDriver driver;
    JavascriptExecutor js;

    @Test
    public void paytmtitleTest() {

        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--disable-popup-blocking");
        driver = new ChromeDriver(chromeOptions);


        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(50));
        driver.get("https://paytm.com/");


        System.out.println(driver.getTitle());

        System.out.println(driver.getCurrentUrl());

        System.out.println(driver.getWindowHandle());


        List<WebElement> list = driver.findElements(By.xpath("//a"));
        System.out.println(list.size());


        List<WebElement> list21 = driver.findElements(By.xpath("//img"));
        System.out.println(list21.size());


        List<WebElement> list2 = driver.findElements(By.xpath("//div"));
        System.out.println(list2.size());


        boolean b =
                driver.findElement(By.xpath("//li[text()='Paytm for Business']")).isDisplayed();
        System.out.println(b);


        String b1 =
                driver.findElement(By.xpath("//li[text()='Paytm for Business']")).getText();
        System.out.println(b);


        String t =
                driver.findElement(By.xpath("//li[text()='Company']")).getText();
        System.out.println(t);

        boolean beee =
                t.isEmpty();
        System.out.println(beee);


        boolean beee2 =
                t.isBlank();
        System.out.println(beee2);

        boolean recharges =
                driver.findElement(By.xpath("//div[text()='Recharges & Bill Payments']")).isDisplayed();
        Assert.assertTrue(recharges);

        boolean signin =
                driver.findElement(By.xpath("//div//span[text()='Sign In']")).isDisplayed();
        System.out.println(signin);


        js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(300, 600)", "");

        boolean dth =
                driver.findElement(By.xpath("//a//span[text()='DTH Recharge']")).isDisplayed();
        Assert.assertTrue(dth);

    }
}
