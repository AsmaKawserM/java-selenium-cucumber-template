package testSteps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import properties.TestProps;

public class PropertiesSteps {

    @Given("I have a property file env.properties")
    public void iHaveAPropertyFileEnvProperties() {
        // Empty step. Used only to make test more readable.
    }


    @Then("I can print the value of property: base_url")
    public void iCanPrintTheValueOfBaseUrl() {
        // Demonstrative test step to show how test properties are retrieved.
        System.out.println(TestProps.BASE_URL);
    }

    @Then("I can get value of property: not_mandatory_property")
    public void iCanGetValueOfPropertyNot_mandatory_property() {
        // Demonstrative test step to show how test properties are retrieved.
        System.out.println(TestProps.DEFAULT_TIMEOUT);
    }
}
