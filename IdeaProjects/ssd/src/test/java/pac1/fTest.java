package pac1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class fTest {

//
//
//    Enter text in input field and verify using getAttribute("value").
//
//            8️⃣ Check if a checkbox is selected or not.
//
//            9️⃣ Select an option from dropdown using Select class.
//
//            🔟 Handle alert popup and accept it.

    WebDriver driver;


    @Test
    public void GTest() {

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
        driver.manage().deleteAllCookies();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");



        /*

//        //driver.get("https://checkout.stripe.dev/");
//        driver.get("https://www.google.com/");
//
//        driver.findElement(By.xpath("//button[starts-with(text(), 'View')]")).click();
//        String title=

        //driver.get("https://jsonplaceholder.typicode.com/");

        driver.get("https://fake-json-api.mock.beeceptor.com/users");

        String s =
                driver.getWindowHandle();
        System.out.println(s);

String url=
        driver.getCurrentUrl();
        System.out.println(url);

        System.out.println(driver.getTitle());
*/

       WebElement wb= driver.findElement(By.xpath("//input[@id='name']"));

        wb.sendKeys("dsv");
      String  s=  wb.getAttribute("value");
        System.out.println(s);   //dsv


        System.out.println("-----------------");


        WebElement wb1= driver.findElement(By.xpath("//input[@id='checkBoxOption1']"));
      boolean b=  wb1.isSelected();
        Assert.assertFalse(b);  //false





    }
}
