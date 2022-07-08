package PageObjects;

import Base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.util.List;

public class CreatingProgramsStep1to3Objects extends BasePage {
    @FindBy(id = "program-name")
    WebElement Step1ProgramNameField;

    @FindBy(id = "program_flow_info_next")
    WebElement Step1NextButton;

    @FindBy(xpath = "//button[text()='Add More Exercises']")
    WebElement Step2AddMoreExercisesButton;

    @FindBy(css = "button[class='btn btn-info']")
    WebElement Step2FilterButton;

    @FindBy(id = "search-term-exercises")
    WebElement Step2FilterSearch;

    @FindBy(css = "#exercises-sidenav > div.col-12.mb-4 > button.btn.btn-lg.btn-primary.btn-block")
    WebElement Step2ApplyFilterButton;

    @FindBy(id = "exercise-534-flag")
    WebElement Step2ShoulderFlexion;

    @FindBy(xpath = "//button[text()='Done']")
    WebElement Step2DoneButton;

    @FindBy(id = "program_flow_cart_next")
    WebElement Step2FinalNextButton;

    @FindBy(id = "program-flow-apply-settings-button")
    WebElement Step3ApplySettingsButton;

    @FindBy(id = "program_flow_settings_next")
    WebElement Step3CreateButton;

    @FindBy(css = ".loading-overlay")
    WebElement loadingOverlay;

    @FindBy(xpath = "//div[@class='search-col p-0 col-lg-4'][1]")
    WebElement ExerciseSearchindex;

    @FindBy(xpath = "//h6/span[@class='program-exercise-counter']")
    public WebElement exerciseCount;

    @FindBy(xpath = "//div[@class='search-col p-0 col-lg-4']/div/div/div/div[2]/div/div[1]")
    public List<WebElement> exerciseIndex;

    @FindBy(id = "exercise-reps" )
    WebElement ScrolldownReps;





    public CreatingProgramsStep1to3Objects(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }


    public void setTextForFilter(String filterText) {
        waitForWebElement(Step2FilterSearch);
        Step2FilterSearch.click();
        Step2FilterSearch.sendKeys(filterText);
    }


    public void ClickOnProgramNameField() {
        waitForWebElement(Step1ProgramNameField);
        Step1ProgramNameField.click();
    }

    public void settextonProgramNameField(String programField) {
        waitForWebElement(Step1ProgramNameField);
        Step1ProgramNameField.sendKeys(programField);
    }


    public void ClickOnNextButton() {
        waitForWebElement(Step1NextButton);
        Step1NextButton.click();
    }

    public void ClickOnAddExercisesButton() {
        waitForWebElement(Step2AddMoreExercisesButton);
        Step2AddMoreExercisesButton.click();

    }

    public void ClickFilterButton() {
        waitForWebElement(Step2FilterButton);
        Step2FilterButton.click();

    }

    public void ClickFilterSearch() {
        waitForWebElement(Step2FilterSearch);
        Step2FilterSearch.click();
    }

    public void clickShoulderFlexion() {
        waitForWebElement(Step2ShoulderFlexion);
        Step2ShoulderFlexion.click();

    }

    public void ClickOnDoneButton() {
        waitForWebElement(Step2DoneButton);
        Step2DoneButton.click();
    }

    public void ClickOnFinalNext() {
        waitForWebElement(Step2FinalNextButton);
        Step2FinalNextButton.click();
    }

    public void ClickOnApplySettings() {
        waitForWebElement(Step3ApplySettingsButton);
        Step3ApplySettingsButton.click();
    }

    public void ClickOnApplyFilter() {
        waitForWebElement(Step2ApplyFilterButton);
        Step2ApplyFilterButton.click();
    }

    public void ClickOnCreateButton() {
        try {
            waitForInvisibility(loadingOverlay);
        } catch (Exception e) {
            e.printStackTrace();
        }

        waitForWebElement(Step3CreateButton);
        Step3CreateButton.click();
    }

    public WebElement ScrollDownReps(){
        return ScrolldownReps;

    }


    public void clickonAllExercisesIndex()
    {
        for (int i = 0; i < exerciseIndex.size(); i++)
        {
            exerciseIndex.get(i).click();
        }
    }

}
