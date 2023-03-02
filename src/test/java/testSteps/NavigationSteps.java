package testSteps;


import pages.BasePage;
import pages.Home;
import pages.Installation;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import properties.TestContext;

import static org.junit.jupiter.api.Assertions.*;

public class NavigationSteps {

    private Home home;
    private Installation installation;
    private BasePage basePage;

    public NavigationSteps(TestContext testContext){;
        home = testContext.getPageManager().getHome();
        installation = testContext.getPageManager().getInstallation();
        basePage = testContext.getPageManager().getBasePage();
    }

    @Given("I go to the Cucumber main page")
    public void iAmInTheCucumberMainPage() {
        home.go();
    }

    @When("I select View Docs from content")
    public void iSelectViewDocsFromContent() {
        home.clickViewDocs();
    }

    @Then("I am redirected to the documentation page")
    public void iAmRedirectedToTheDocumentationPage() {
        assertTrue(installation.imHere());
    }

    @When("I select View Docs from navbar")
    public void iSelectViewDocsFromNavbar() {
        basePage.selectOptionAndSubOptionFromMenu("Docs","Installation");
    }
}
