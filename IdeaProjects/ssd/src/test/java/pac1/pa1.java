package pac1;


import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.SourceType;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class pa1 {


    WebDriver driver;


    @Test
    public void GTest() {

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
        driver.manage().deleteAllCookies();

//        //driver.get("https://checkout.stripe.dev/");
//        driver.get("https://www.google.com/");
//
//        driver.findElement(By.xpath("//button[starts-with(text(), 'View')]")).click();
//        String title=
//driver.getTitle();
//        Assert.assertEquals(title, "Google");



     //   driver.get("https://demoqa.com/text-box");
     //   driver.get("https://the-internet.herokuapp.com/login");


      //  driver
     //           .get("https://rahulshettyacademy.com/AutomationPractice/");

        driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_iframe");



//
//
//        WebElement wb=driver.findElement(By.id("userName"));
//        wb.sendKeys("ususu");
//     String  s=wb.getAttribute("value");
//        System.out.println(s);
//
//
//        WebElement email=
//        driver.findElement(By.xpath("//input[@type='email']"));
//        email.sendKeys("pfev33@gmail.com");
//        String  s1= email.getAttribute("value");
//        System.out.println(s1);




//
//
//        WebElement wb=driver.findElement(By.id("username"));
//        wb.sendKeys("tomsmith");
//
//
//        WebElement wb1=driver.findElement(By.id("password"));
//        wb1.sendKeys("SuperSecretPassword!");
//
//
//        WebElement wb2=driver.findElement(By.xpath("//button[@type='submit']"));
//        wb2.click();
//
//        Assert.assertEquals(driver.getTitle(), "he Internet");
//



//
//
//        WebElement wb=driver.findElement(By.id("username"));
//        wb.sendKeys("tomsmithdsf");
//
//
//        WebElement wb1=driver.findElement(By.id("password"));
//        wb1.sendKeys("SuperSecretPassword!sdfvsdvsvs22");
//
//
//        WebElement wb2=driver.findElement(By.xpath("//button[@type='submit']"));
//        wb2.click();
//
//
//        WebElement wb2ss=driver.findElement(By.xpath("(//div[starts-with(@id, 'fla')])[1]"));
//        System.out.println(wb2ss.getText());


/*
        List<WebElement> list=

        driver.findElements(By.xpath("//a"));
        if(list.size()==2)
        {
            System.out.println("correct count");
        }
        else {
            System.out.println("incorrect count");
        }

        WebElement wb=driver.findElement(By.id("username"));
        wb.sendKeys("tomsmith");


        WebElement wb1=driver.findElement(By.id("password"));
        wb1.sendKeys("SuperSecretPassword!");


        WebElement wb2=driver.findElement(By.xpath("//button[@type='submit']"));
        wb2.click();


Assert.assertEquals(driver.getCurrentUrl(), "https://the-internet.herokuapp.com/secure");
*/


//
//        Switch to iframe and type text inside it.
//
//        1️⃣2️⃣ Open a link in new tab and switch to it.
//
//        1️⃣3️⃣ Count number of rows in a web table.

//
//WebElement w=
//driver.findElement(By.xpath("//select[@id='dropdown-class-example']"));
//Select sel=new Select(w);
//sel.selectByVisibleText("Option2");
//
//
//
//
//
//
//driver.findElement(By.name("enter-name")).sendKeys("prag");
//driver.findElement(By.xpath("//input[@id='alertbtn']")).click();
//
//Alert alt=
//        driver.switchTo().alert();
//alt.accept();
//
//

List<WebElement>list=
driver.findElements(By.xpath("//table[@id='product']//tbody//tr"));
System.out.println(list.size());    //20



        List<WebElement>lisst=
                driver.findElements(By.xpath("//table[@id='product']//tbody//td"));
        System.out.println(lisst.size());    //66




        List<WebElement>lisssst=
                driver.findElements(By.xpath("//table"));
        System.out.println(lisst.size());    //66


WebElement wes=
driver.findElement(By.xpath("//iframe[@id='iframeResult']"));

        driver.switchTo().frame(wes);

        String text=
        driver.findElement(By.xpath("An iframe is used to display a web page within a web page:")).getText();
        System.out.println(text);


        driver.switchTo().defaultContent();

        driver.findElement(By.xpath("//div[@class='CodeMirror-code']")).sendKeys("proper");

        driver.findElement(By.xpath("//button[@id='runbtn']")).click();

        driver.quit();



   }


}

