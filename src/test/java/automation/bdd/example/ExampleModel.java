
package automation.bdd.example;

import automation.bdd.model.AbstractSystemUnderTest;
import automation.webdriver.example.ExampleWebSite;

/**
 * Behaviour Model of the system under test.
 */
public final class ExampleModel extends AbstractSystemUnderTest {

    /** The site. */
    ExampleWebSite site = new ExampleWebSite();

}
