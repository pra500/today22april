    package pacccc;

    import org.openqa.selenium.By;
    import org.openqa.selenium.WebDriver;

    public class StoreeeePage {

    WebDriver driver;

        StoreeeePage(WebDriver driver)
        {
    this.driver=driver;
        }

        By features= By.xpath("(//li//a[text()='Features'])[1]");
    By opencartlogo=By.xpath("//img[@title='OpenCart - Open Source Shopping Cart Solution']");



    public void clickonelement()
    {
        driver.findElement(features).click();

    }

    public void existelement()
    {

        driver.findElement(opencartlogo).isDisplayed();
    }

    }


