    package pac1;

    import org.openqa.selenium.WebDriver;
    import org.openqa.selenium.chrome.ChromeDriver;
    import org.testng.Assert;
    import org.testng.annotations.AfterClass;
    import org.testng.annotations.BeforeClass;
    import org.testng.annotations.Test;

    import java.time.Duration;

    public class paytm {

        WebDriver driver;

        @BeforeClass
        public void setup() {

            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().deleteAllCookies();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
            driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(50));
            driver.get("https://paytm.com/");

        }

        @AfterClass
        public void teardown() {
            driver.quit();
        }


        @Test
        public void titleTest() {
            System.out.println(driver.getTitle());
        }

        @Test
        public void urlTest() {

            System.out.println(driver.getCurrentUrl());



        }
        @Test
        public void titlecontainsTest() {

            System.out.println(driver.getTitle().contains("Paytm"));




        }





    }
