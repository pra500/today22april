package pac1;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

import java.time.Duration;
import java.util.List;

public class HsTest {

    WebDriver driver;

    @BeforeClass
    public void setup() {

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
        driver.manage().deleteAllCookies();
        driver.get("https://practicetestautomation.com/practice-test-login/");

    }


    @AfterClass
    public void tear() {
        driver.quit();

    }
/*

    //@Test
        public void yyGeTest() {

            Dimension d = driver.findElement(By.xpath("//img[@alt='Make My Trip']")).getSize();
            System.out.println(d.getWidth());

            System.out.println(d.getHeight());

       }


    //@Test
    public void ydxdyGeTest() {

        Dimension d = driver.findElement(By.xpath("//img[@alt='Make My Trip']")).getSize();
        System.out.println(d.getWidth());

        System.out.println(d.getHeight());

    }


    //@Test
    public void yxdyGeTest() {

        Dimension d = driver.findElement(By.xpath("//img[@alt='Make My Trip']")).getSize();
        System.out.println(d.getWidth());

        System.out.println(d.getHeight());

    }


    //*****************

    //  @Test
    public void multicityTest() {

        boolean MultiCity = driver.findElement(By.xpath("//li[text()='Multi City']")).isDisplayed();
        Assert.assertTrue(MultiCity);

    }

    // @Test
    public void wishlistTest() {

        boolean wishlist = driver.findElement(By.xpath("//div//p[text()='Wishlist']")).isDisplayed();
        Assert.assertTrue(wishlist);

    }


    // @Test
    public void MakemytripTest() {

        boolean wishlist = driver.findElement(By.xpath("//img[@alt='Make My Trip']")).isDisplayed();
        Assert.assertTrue(wishlist);

    }


    //@Test
    public void roundtripTest() {

        boolean wishlist = driver.findElement(By.xpath("//ul//li[text()='Round Trip']")).isDisplayed();
        Assert.assertTrue(wishlist);

    }

    //@Test
    public void searchTest() {

        boolean search = driver.findElement(By.xpath("//p//a[text()='Search']")).isDisplayed();
        Assert.assertTrue(search);

    }


    @Test
    public void scsssefewTest() {
        int size = driver.findElements(By.tagName("a")).size();
        System.out.println(size);

        int size1 =
                driver.findElements(By.tagName("img")).size();
        System.out.println(size1);

        WebElement wb =
                driver.findElement(By.xpath("//div//p[text()='Country']"));

        boolean b=
        wb.isDisplayed();
        System.out.println(b);
        System.out.println("------------------");
//        Assert.assertTrue(b);


        String classee =
                wb.getAttribute("class");
        System.out.println(classee);

        String classee1 =
                wb.getText();
        System.out.println(classee1);

        String c =
                wb.getAriaRole();
        System.out.println(c);

        String display = wb.getCssValue("display");
        System.out.println(display);


        String color =
                wb.getCssValue("color");
        System.out.println(color);

        String s =
                wb.getDomAttribute("class");
        System.out.println(s);


        Rectangle r =
                wb.getRect();
        System.out.println(r.getX());
        System.out.println(r.getY());

        String ss =
                wb.getDomProperty("class");
        System.out.println(ss);


        String s1 =
                wb.getTagName();
        System.out.println(s1);


    }
*/


    @Test
    public void scsssefewTest() {

        boolean menu =
                driver.findElement(By.xpath("//nav[@class='menu']")).isDisplayed();
        Assert.assertTrue(menu);

        boolean menu1 =
                driver.findElement(By.xpath("//h2[text()='Test login']")).isDisplayed();
        Assert.assertTrue(menu1);


        boolean menu23 =
                driver.findElement(By.xpath("//li[contains(text(), 'This is a simple Login')]")).isDisplayed();
        Assert.assertTrue(menu23);

        boolean menu1ewd =
                driver.findElement(By.xpath("//li[contains(text(), 'Use next credentials to execute L')]")).isDisplayed();
        Assert.assertTrue(menu1ewd);

        boolean menuds1 =
                driver.findElement(By.xpath("//label[text()='Username']")).isDisplayed();
        Assert.assertTrue(menuds1);

    }


    @Test
    public void scssssdefewTest() {

        List<WebElement> list =

                driver.findElements(By.xpath("//img"));
        System.out.println(list.size());

        for (int i = 0; i <= list.size() - 1; i++) {

            list.get(i).getAttribute("");

        }

    }
}









