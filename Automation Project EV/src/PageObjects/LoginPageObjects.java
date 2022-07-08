package PageObjects;



import Base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;





public class LoginPageObjects extends BasePage {
    @FindBy(name="username")
    WebElement MemberIDField;

    @FindBy(name="password")
    WebElement PasswordField;

    @FindBy(id="login-button")
    WebElement LoginButton;

    public WebElement getLoginButton;
    public String Username;
    public String Password;

    public LoginPageObjects(WebDriver driver)
    {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public WebElement getLoginButton()
    {
        waitForWebElement(LoginButton);
        return LoginButton;
    }


    public void FillLoginFields(String username, String Password)
    {
        this.Username = username;
        MemberIDField.sendKeys(username);
        this.Password = Password;
        PasswordField.sendKeys(Password);
    }


}
