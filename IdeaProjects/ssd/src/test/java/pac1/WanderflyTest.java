package pac1;


import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import java.time.Duration;
import java.util.Set;

public class WanderflyTest {

    //EVERY PAGE URL CHECK

    WebDriver driver;
    JavascriptExecutor js;

    @BeforeClass(alwaysRun = true)
    public void setup() {

        driver = new ChromeDriver();
        driver.manage().window().maximize();
       // driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
        driver.manage().deleteAllCookies();
        driver.get("https://www.wanderfly.in/");
    }

    @AfterClass(alwaysRun = true)
    public void teardown() {

        driver.quit();
    }

    //1) Verify Home Page Loads Successfully
    @Test(priority = 0)
    public void logoandtitleverifyTest() {

        try {

            String title = driver.getTitle();
            Assert.assertEquals(title, "Wanderfly | Stop the Burnout. Start the Vibes.");

            boolean logopresent = driver.findElement(By.xpath("(//img[starts-with(@alt, 'Wanderfly Logo')])[1]")).isDisplayed();
            Assert.assertTrue(logopresent);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }


    //2) Validate Navigation Menu Items
    @Test(priority = 1)
    public void NavigationMenuItemsverifyTest() {

        try {

            WebElement solutions =
                    driver.findElement(By.xpath("(//a[contains(text(), 'Solutions')])[1]"));
            boolean solutionspresence = solutions.isDisplayed();
            Assert.assertTrue(solutionspresence);

            WebElement features =
                    driver.findElement(By.xpath("(//a[contains(text(), 'Features')])[1]"));
            boolean featurespresence = features.isDisplayed();
            Assert.assertTrue(featurespresence);

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }




    //3) Verify “About” btn
    @Test(priority = 2)
    public void aboutabovebuttonTest() {

        try {



            WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//a[contains(text(), 'About')])[1]"))).click();

wait.until(ExpectedConditions.urlContains("https://www.wanderfly.in/about"));

            String abouturl= driver.getCurrentUrl();

         Assert.assertEquals(abouturl, "https://www.wanderfly.in/about");



        } catch (Exception e) {
            e.printStackTrace();

        }

    }


    //****************************


    //6) Check “Request a Demo” Button
    @Test(priority = 5)
    public void bookademobuttonverifyTest() {

        try {

            String parent = driver.getWindowHandle();

            driver.findElement(By.xpath("//a[normalize-space()='Book a Demo']")).click();

            Set<String> set1 = driver.getWindowHandles();

            for (String s : set1) {
                if (!s.equalsIgnoreCase(parent)) {
                    driver.switchTo().window(s);
                    break;
                }
            }



//driver.findElement(By.xpath("//a[normalize-space()='Book a Demo']")).click();


String url=driver.getCurrentUrl();
            Assert.assertEquals(url, "https://cal.com/penchala-tharun-wanderfly/30min?layout=mobile");

            driver.close();
            driver.switchTo().window(parent);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }


    //7) Verify Footer Copyright Text
    @Test(priority = 6)
    public void FooterCopyrightverifyTest() {

        try {
            String footertext = driver.findElement(By.xpath("//div[contains(text(), '© ')]")).getText();
            Assert.assertTrue(footertext.contains("© 2026 Wanderfly. All Rights Reserved"));
            Assert.assertTrue(footertext.contains("2026"));
            Assert.assertTrue(footertext.contains("Wanderfly"));
        } catch (Exception e) {
            e.printStackTrace();
        }

    }


    //8) Validate Employee Wellbeing Sections
    @Test(priority = 7)
    public void EmployeeWellbeingSectionverifyTest() throws Exception {

        try {

            WebElement wellbeing =
                    driver.findElement(By.xpath("//button[text()='Wellbeing']"));
            Actions act = new Actions(driver);
            act.moveToElement(wellbeing).perform();

            driver.findElement(By.xpath("(//a[@href='/wellbeing/physical'])[1]")).click();
            Thread.sleep(3000);

            String physicalurl = driver.getCurrentUrl();
            Assert.assertEquals(physicalurl, "https://www.wanderfly.in/wellbeing/physical");

            driver.findElement(By.xpath("(//a[@href='/wellbeing/mental'])[1]")).click();
            Thread.sleep(3000);

            String mentalurl = driver.getCurrentUrl();
            Assert.assertEquals(mentalurl, "https://www.wanderfly.in/wellbeing/mental");


            driver.findElement(By.xpath("(//a[@href='/wellbeing/social'])[1]")).click();
            Thread.sleep(3000);

            String socialurl = driver.getCurrentUrl();
            Assert.assertEquals(socialurl, "https://www.wanderfly.in/wellbeing/social");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    //9) Verify Blog Navigation
    @Test(priority = 7)
    public void resourcesverifyTest() throws Exception {

        try {
            WebElement resources =
                    driver.findElement(By.xpath("//button[contains(text(), 'Resources')]"));
            Actions act = new Actions(driver);
            act.moveToElement(resources).perform();

            driver.findElement(By.xpath("(//div//a[contains(@href, '/blogs')])[1]")).click();

            Thread.sleep(3000);


            String blogurl = driver.getCurrentUrl();
            Assert.assertEquals(blogurl, "https://www.wanderfly.in/blogs");

            String title = driver.getTitle();
            Assert.assertTrue(title.contains("Blogs | Employee Wellbeing Articles & Insights | Wanderfly"));

            String selfcare =
                    driver.findElement(By.xpath("//div//button[contains(text(), 'self-care')]")).getText();
            Assert.assertTrue(selfcare.contains("self-care"));


            String mentalhealth =
                    driver.findElement(By.xpath("//div//button[contains(text(), 'Mental health')]")).getText();
            Assert.assertTrue(mentalhealth.contains("Mental health"));


            String stressmanagement =
                    driver.findElement(By.xpath("//div//button[contains(text(), ' stress management')]")).getText();
            Assert.assertTrue(stressmanagement.contains("stress management"));
        } catch (Exception e) {
            e.printStackTrace();
        }

    }


    //10) Verify Footer Links (About & Contact)
    @Test(priority = 7)
    public void onfooteraboutusandcontactverifyTest() throws Exception {

        try {

            WebElement aboutus = driver.findElement(By.xpath("//a[contains(text(), 'About Us')]"));
            aboutus.click();

            Thread.sleep(3000);

            String aboutusurl = driver.getCurrentUrl();
            Assert.assertEquals(aboutusurl, "https://www.wanderfly.in/about");

            driver.navigate().back();

            driver.findElement(By.xpath(" //a[contains(text(), 'Contact')]")).click();

            Thread.sleep(3000);

            String contacturl = driver.getCurrentUrl();
            Assert.assertEquals(contacturl, "https://www.wanderfly.in/contact");


        } catch (Exception e) {
            e.printStackTrace();
        }
    }



        //Header Navigation Consistency (Non-functional UI check)
    //Verify that header menu items remain visible and clickable across page reloads.
        @Test(priority = 8)
        public void HeaderNavigationConsistencyTest () {

WebElement solutions=
        driver.findElement(By.xpath("(//div[starts-with(@class, 'flex items-center')])[1]//a[text()='Solutions']"));

            Assert.assertTrue(solutions.isDisplayed());


            WebElement features=
            driver.findElement(By.xpath("(//div[starts-with(@class, 'flex items-center')])[1]//a[text()='Features']"));

            Assert.assertTrue(features.isDisplayed());


driver.navigate().refresh();

WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[starts-with(@class, 'flex items-center')])[1]//a[text()='Features']")));





            Assert.assertTrue(features.isDisplayed());
            Assert.assertTrue(features.isEnabled());


            Assert.assertTrue(solutions.isDisplayed());
            Assert.assertTrue(solutions.isEnabled());





        }


    }



