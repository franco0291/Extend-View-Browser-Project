package PageObjects;

import Base.BasePage;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.FindBy;

import java.util.List;



public class HomePageObjects extends BasePage {
    @FindBy(xpath = "/html/body/nav/a[3]")
    WebElement GetloginPage;

    @FindBy(xpath = "//button[text()='How It Works']")
    WebElement HowitWorksButton;

    @FindBy(id = "exercise-catalog-nav-link")
    WebElement getCatalogButton;

    @FindBy(xpath = "//a[text()='Workouts']")
    WebElement getWorkoutsbutton;

    @FindBy(xpath = "//h2[text()='Workouts To Choose From']")
    WebElement getWorkouttext;

    @FindBy(xpath = "//div/div/div/div/ul/li")
    public List<WebElement> getFooterindex;

    @FindBy(xpath = "//div/div/div/div/ul/li")
    WebElement footerIndex;

    @FindBy(xpath = "//li/a[@href='/login']")
    WebElement getBottomLoginLink;

    @FindBy(xpath = "//li/a[@href='/help']")
    WebElement getHelpLink;

    @FindBy(xpath = "//li/a[@href='/terms-of-service']")
    WebElement getTofS;

    @FindBy(xpath = "//h2[text()='Setup tutorial slides']")
    WebElement getTutorialtext;

    @FindBy(css = "#dashboard-nav-link")
    WebElement DashboardButton;


    public HomePageObjects(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public void openPage() {
        driver.get("https://extendview-staging.herokuapp.com/");
    }

    public WebElement getCatalogButton() {
        waitForWebElement(getCatalogButton);
        return getCatalogButton;
    }

    public void clickLoginButton() {
        waitForWebElement(GetloginPage);
        GetloginPage.click();
    }

    public void clickHowitworksButton() {
        waitForWebElement(HowitWorksButton);
        HowitWorksButton.click();
    }

    public void clickOnDashboardButton() {
        waitForWebElement(DashboardButton);
        DashboardButton.click();

    }


    public void checkEachFooterLink() {
        System.out.println(getFooterindex.size());

        for (int i = 0; i < getFooterindex.size(); i++) {

            System.out.println(getFooterindex.get(i).getText());
            System.out.println(getFooterindex.get(i).getText());
            waitForWebElement(getFooterindex.get(i));
            Actions action = new Actions(driver);
            action.sendKeys(Keys.END);
            getFooterindex.get(i).click();
            driver.navigate().back();
            System.out.println(getFooterindex.size());

        }
        System.out.println(getFooterindex.size());

    }

    public void gethelptext()
    {
        getHelpLink.getText();

    }

}


