package stepDefination;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LandingPage;
import pages.LoginPage;
import utility.BaseClass;

public class StepDefinations {

    LandingPage landingPage=new LandingPage(BaseClass.driver);
    LoginPage loginPage=new LoginPage(BaseClass.driver);

    @Given("user is on crowd4Test app")
    public void user_is_on_crowd4test_app() {
        System.out.println("iam in crwd4test app");
    }
    @When("user clicks on login button")
    public void user_clicks_on_login_button() {
        landingPage.clickLoginButton();
        landingPage.switchToLoginWindow();
    }
    @Then("login page is displayed")
    public void login_page_is_displayed() {

    }
    @Then("user enters valid cred")
    public void user_enters_valid_cred() {
        loginPage.login();
    }
    @Then("user will be logged in successfully")
    public void user_will_be_logged_in_successfully() {

    }

    @Then("user enters invalid cred")
    public void user_enters_invalid_cred() {

    }

    @Then("user enters {string} username")
    public void user_enters_username(String username) {
        loginPage.enterUsername(username);
    }

    @Then("user enters {string} password")
    public void user_enters_password(String password) {
        loginPage.enterPassword(password);
    }
}
