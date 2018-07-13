
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
public final class NarrativeTestSteps {

    /**
     * An initial context.
     */
    @Given("an initial context")
    public void anInitialContext() {
        // The pre-condition is true, the test passes
        assumeTrue("The initial context in invalid", true);
    }

    /**
     * An initial context is false.
     */
    @Given("an initial context is false")
    public void anInitialContextIsFalse() {
        // The pre-condition is false, the test passes
        assumeTrue("The initial context is valid", false);
    }

    /**
     * An event occurs.
     */
    @When("the event occurs")
    public void anEventOccurs() {
        // Write code here that turns the phrase above into concrete actions
        assertTrue("the event occurs", true);
    }

    /**
     * Expected outcome is confirmed.
     */
    @Then("the expected outcome is confirmed")
    public void expectedOutcomeIsConfirmed() {
        // The post-condition is true, the test passes
        assertTrue("expected outcome confirmed", true);
    }

    /**
     * Expected outcome is not confirmed.
     */
    @Then("the expected outcome is not confirmed")
    public void expectedOutcomeIsNotConfirmed() {
        // The post-condition is false, the test fails
        fail("the expected result is not confirmed");
    }

    /**
     * Expected outcome is a bug.
     */
    @SuppressWarnings("null")
    @Then("expected outcome is a bug")
    public void expectedOutcomeIsABug() {
        final String isNull = null;
        isNull.toString();
    }

    /**
     * Expected outcome is incomplete.
     * Deliberately incomplete as example.
     */
    @Then("expected outcome is incomplete")
    public void expectedOutcomeIsIncomplete() {
        // Write code here that turns the phrase above into concrete actions
        // Throws PendindEception as deliberately incomplete as example.
        throw new PendingException();
    }

}
