package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utility.BaseClass;

import java.util.ArrayList;
import java.util.List;

public class LandingPage extends BaseClass {

    @FindBy(linkText="About")
    WebElement aboutLink;

    @FindBy(linkText="Login")
    WebElement loginButton;

    public LandingPage(WebDriver driver)
    {
        PageFactory.initElements(driver,this);
    }

    public void clickAboutLink()
    {
        aboutLink.click();
    }

    public void verifyAboutUs()
    {
        String url=driver.getCurrentUrl();
        System.out.println(url);
    }

    public void clickLoginButton()
    {
        loginButton.click();
    }

    public void switchToLoginWindow()
    {
        List<String> allWindows=new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(allWindows.get(1));
    }
}
