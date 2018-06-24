
package automation.webdriver.example;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

/**
 * Unit Test class for all page objects.
 */
public class PageObjectTests {

    /**
     * Testpage.
     */
    @Test
    public final void testpage() {
        final LandingPage page = new LandingPage();
        assertNotNull(page.open());
    }

    /**
     * Unit test to navigate to about.
     */
    @Test
    public final void testNavigateToAbout() {
        final AboutPage page = new AboutPage();
        assertNotNull(page.open());
    }

    /**
     * Unit test to navigate to industies.
     */
    @Test
    public final void testNavigateToIndusties() {
        final IndustriesPage page = new IndustriesPage();
        assertNotNull(page.open());
    }

    /**
     * Unit test to navigate to services.
     */
    @Test
    public final void testNavigateToServices() {
        final ServicesPage page = new ServicesPage();
        assertNotNull(page.open());
    }

    /**
     * Unit test to navigate to our clients.
     */
    @Test
    public final void testNavigateToOurClients(){
        final OurClientsPage page = new OurClientsPage();
        assertNotNull(page.open());
    }

    /**
     * Unit test to navigate to contact us.
     */
    @Test
    public final void testNavigateToContactUs() {
        final ContactUsPage page = new ContactUsPage();
        assertNotNull(page.open());
    }

}
