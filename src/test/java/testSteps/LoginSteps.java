package testSteps;

import pages.BasePage;
import pages.Login;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import properties.TestContext;

import static org.junit.jupiter.api.Assertions.*;

public class LoginSteps {

    private BasePage basePage;
    private Login login;

    public LoginSteps(TestContext testContext){
        basePage = testContext.getPageManager().getBasePage();
        login = testContext.getPageManager().getLogin();
    }

    @When("I go to Login page")
    public void iGoToLoginPage() {
        basePage.clickLogin();
    }

    @When("I enter email:{string} and password:{string}")
    public void iEnterEmailAndPassword(String username, String password) {
        login.attemptToLogin(username, password);
    }

    @Then("{string} message is displayed")
    public void messageIsDisplayed(String errorMessage) {
        assertEquals(errorMessage, login.getErrorMessage());
    }

}
