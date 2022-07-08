package PageObjects;

import Base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;




public class MyWorkoutsPageObjects extends BasePage {
    @FindBy(xpath = "//div/div/h6/b[1]")
    WebElement programText;

    @FindBy(xpath = "//*[@id='create-new-program-button']")
    WebElement CreateNewProgramButton;

    @FindBy(css=".loading-overlay")
    WebElement loadingOverlay;



    public MyWorkoutsPageObjects(WebDriver driver)
    {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public String getProgramText()
    {
        waitForWebElement(programText);
        return programText.getText();
    }

    public void clickOnCreateNewProgram()
    {

        try{waitForInvisibility(loadingOverlay);}
        catch (Exception e)
        {
            e.printStackTrace();
        }

        waitForClickability(CreateNewProgramButton);
        CreateNewProgramButton.click();
    }
}
