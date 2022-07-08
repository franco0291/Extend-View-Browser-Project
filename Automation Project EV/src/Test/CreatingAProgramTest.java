package Test;

import Base.BaseTest;
import src.PageObjects.*;
import net.bytebuddy.utility.RandomString;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.util.Random;


public class CreatingAProgramTest extends BaseTest {

    String randomText = "Test " + randomString();


    @Test
    //Testing that we can create a program on Catagories, and assert that the program matches the name with the one the user created
    @Parameters({"username", "password"})
    public void CreateAProgramTest(String username, String password) {
        HomePageObjects l = new HomePageObjects(driver);
        l.openPage();
        l.clickLoginButton();
        LoginPageObjects Login = new LoginPageObjects(driver);
        Login.FillLoginFields(username, password);
        Login.getLoginButton().click();
        l.getCatalogButton();
        CatalogPageObjects category = new CatalogPageObjects(driver);
        category.getMyworkoutButton().click();
        MyWorkoutsPageObjects Work = new MyWorkoutsPageObjects(driver);
        Work.clickOnCreateNewProgram();
        CreatingProgramsStep1to3Objects steps = new CreatingProgramsStep1to3Objects(driver);
        steps.ClickOnProgramNameField();
        steps.settextonProgramNameField(randomText);
        steps.ClickOnNextButton();
        steps.ClickOnAddExercisesButton();
        steps.ClickFilterButton();
        steps.setTextForFilter("534");
        steps.ClickOnApplyFilter();
        steps.clickShoulderFlexion();
        steps.ClickOnDoneButton();
        steps.ClickOnFinalNext();
        steps.ClickOnApplySettings();
        steps.ClickOnCreateButton();
        MyWorkoutsPageObjects workout = new MyWorkoutsPageObjects(driver);
        category.getMyworkoutButton().click();
        Assert.assertEquals(workout.getProgramText(), randomText);

    }

    @Test
    @Parameters({"username", "password"})
    public void TestNumberofExercises(String username, String password) {
        HomePageObjects l = new HomePageObjects(driver);
        l.openPage();
        l.clickLoginButton();
        LoginPageObjects Login = new LoginPageObjects(driver);
        Login.FillLoginFields(username, password);
        Login.getLoginButton().click();
        l.getCatalogButton();
        CatalogPageObjects category = new CatalogPageObjects(driver);
        category.getMyworkoutButton().click();
        MyWorkoutsPageObjects Work = new MyWorkoutsPageObjects(driver);
        Work.clickOnCreateNewProgram();
        CreatingProgramsStep1to3Objects steps = new CreatingProgramsStep1to3Objects(driver);
        steps.ClickOnProgramNameField();
        steps.settextonProgramNameField(randomText);
        steps.ClickOnNextButton();
        steps.ClickOnAddExercisesButton();
        steps.ClickFilterButton();
        steps.setTextForFilter("534");
        steps.ClickOnApplyFilter();
        steps.clickShoulderFlexion();
        steps.ClickOnDoneButton();
        steps.ClickOnFinalNext();
        steps.ScrollDownReps().click();
        Select dropdown = new Select(steps.ScrollDownReps());
        dropdown.selectByIndex(27);
        steps.ClickOnApplySettings();
        steps.ClickOnCreateButton();


    }
}