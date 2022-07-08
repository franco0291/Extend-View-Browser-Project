package PageObjects;
import Base.BasePage;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class DashboardPageObjects extends BasePage {

    public DashboardPageObjects(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a[@href='#pills-day']")
    WebElement getDayButton;

    @FindBy(xpath = "//option[@value=1505]//following-sibling::option")
    public List<WebElement> getDashboardList;


    public void clickDayButton()
    {
        getDayButton.click();
    }

    public void getTextFromList()
    {
        for(int i = 0; i <getDashboardList.size(); i++ )
        {
            System.out.println(getDashboardList.get(i).getText());
        }


    }





}
