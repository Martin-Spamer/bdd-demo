
package automation.bdd.narrative;

import static org.junit.Assume.assumeTrue;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * The Narrative Test Steps.
 */
public final class AuthorisationTestSteps {

    /**
     * An initial context.
     */
    @Given("authorisation for the activity")
    public void authorisationForTheActivity() {
        // The pre-condition is true, the test passes
        assumeTrue("authorisation for the activity", true);
    }

    /**
     * No authorisation for the activity.
     */
    @Given("no authorisation for the activity")
    public void noAuthorisationForTheActivity() {
        // The pre-condition is false, the test passes
        assumeTrue("no authorisation for the activity", false);
    }

    /**
     * The activity is carried out.
     */
    @When("the activity is carried out")
    public void theActivityIsCarriedOut() {
        assumeTrue(true);
    }

    /**
     * The activity is attempted.
     */
    @When("the activity is attempted")
    public void theActivityIsAttempted() {
        assumeTrue(true);
    }

    /**
     * The event occurs.
     */
    @When("[an|the] event occurs")
    public void theEventOccurs() {
        assumeTrue(true);
    }

    /**
     * The outcome is validated.
     */
    @Then("the outcome is validated")
    public void theOutcomeIsValidated() {
        assumeTrue(true);
    }

    /**
     * Access is refused.
     */
    @Then("access is refused")
    public void accessIsRefused() {
        assumeTrue(true);
    }

}
