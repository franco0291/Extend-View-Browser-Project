package Base;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;




public class BasePage {
    public WebDriver driver;


    public BasePage(WebDriver driver)
    {
        this.driver = driver;
    }

    public void waitForWebElement(WebElement webelement)
    {
        WebDriverWait wait = new WebDriverWait(driver,30);
        wait.until(ExpectedConditions.visibilityOf(webelement));///
    }

    public void waitForInvisibility(WebElement webelement)
    {
        WebDriverWait wait = new WebDriverWait(driver,30);
        wait.until(ExpectedConditions.invisibilityOf(webelement));
    }

    public void waitForClickability(WebElement webelement)
    {
        WebDriverWait wait = new WebDriverWait(driver,30);
        wait.until(ExpectedConditions.elementToBeClickable(webelement));
    }


}

