
package automation.bdd.narrative;

import static org.junit.Assume.assumeTrue;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * The Narrative Test Steps.
 */
public class AuthorisationTestSteps {

    /**
     * An initial context.
     */
    @Given("authorisation for the activity")
    public void authorisationForTheActivity() {
        // The pre-condition is true, the test passes
        assumeTrue("Initial Context", true);
    }

    @Given("no authorisation for the activity")
    public void noAuthorisationForTheActivity() {
        // The pre-condition is false, the test passes
        assumeTrue("Initial Context", false);
    }

    @When("the activity is carried out")
    public void theActivityIsCarriedOut() {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @When("the activity is attempted")
    public void theActivityIsAttempted() {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @When("the event occurs")
    public void theEventOccurs() {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @When("an event occurs")
    public void anEventOccurs() {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("the outcome is validated")
    public void theOutcomeIsValidated() {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("access is refused")
    public void accessIsRefused() {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

}
