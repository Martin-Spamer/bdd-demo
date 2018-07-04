
package automation.bdd.narrative;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import static org.junit.Assume.assumeTrue;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * The Narrative Test Steps.
 */
public class NarrativeTestSteps {

    /**
     * An initial context.
     */
    @Given("^an initial context$")
    public void anInitialContext() {
        // The pre-condition is true, the test passes
        assumeTrue("Initial Context", true);
    }

    @Given("an initial context is false")
    public void anInitialContextIsFalse() {
        // The pre-condition is false, the test passes
        assumeTrue("Initial Context", false);
    }

    /**
     * An event occurs.
     */
    @When("^[an|the] event occurs$")
    public void anEventOccurs() {
        // Write code here that turns the phrase above into concrete actions
        assertTrue("the event occurs", true);
    }

    /**
     * Expected outcome is confirmed.
     */
    @Then("^expected outcome is confirmed$")
    public void expectedOutcomeIsConfirmed() {
        // The post-condition is true, the test passes
        assertTrue("expected outcome confirmed", true);
    }

    /**
     * Expected outcome is not confirmed.
     */
    @Then("^expected outcome is not confirmed$")
    public void expectedOutcomeIsNotConfirmed() {
        // The post-condition is false, the test fails
        fail("expected outcome is not confirmed");
    }

    /**
     * Expected outcome is a bug.
     */
    @SuppressWarnings("null")
    @Then("^expected outcome is a bug$")
    public void expectedOutcomeIsABug() {
        final String isNull = null;
        isNull.toString();
    }

    @Then("expected outcome is incomplete")
    public void expectedOutcomeIsIncomplete() {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

}
