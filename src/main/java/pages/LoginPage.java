package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utility.BaseClass;

public class LoginPage extends BaseClass {

    @FindBy(id="uname")
    WebElement username;

    @FindBy(id="pwd")
    WebElement password;

    @FindBy(id="login_submit_btn")
    WebElement loginButton;

    public LoginPage(WebDriver driver)
    {
        PageFactory.initElements(driver,this);
    }

    public void login()
    {
        username.sendKeys("testusername");
        password.sendKeys("testpass");
        loginButton.click();
    }

    public void enterUsername(String userName)
    {
        username.sendKeys(userName);
    }

    public void enterPassword(String pwd)
    {
        password.sendKeys(pwd);
    }
}
