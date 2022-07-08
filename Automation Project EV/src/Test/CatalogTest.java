package Test;

import Base.BaseTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import PageObjects.*;

public class CatalogTest extends BaseTest
{

    @Test
    @Parameters({"username","password"})
    public void CheckWorkoutsButton(String username, String password)
    {
        HomePageObjects l = new HomePageObjects(driver);
        l.openPage();
        l.clickLoginButton();
        LoginPageObjects Login = new LoginPageObjects(driver);
        Login.FillLoginFields(username,password);
        Login.getLoginButton().click();
        l.getCatalogButton();
        CatalogPageObjects category = new CatalogPageObjects(driver);
        category.getMyworkoutButton().click();
    }


}
