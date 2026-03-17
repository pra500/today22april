package pac1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class TgTest {

    public static WebDriver driver;

    public static void main(String[] args) {

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
        driver.get("https://restful-booker.herokuapp.com/apidoc/index.html#api-Booking-CreateBooking");
      String s= driver.getTitle();
        System.out.println(s);

        String url=
        driver.getCurrentUrl();
        System.out.println(url);


        


    }
}
