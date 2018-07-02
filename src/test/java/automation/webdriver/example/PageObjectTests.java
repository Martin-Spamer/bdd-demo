
package automation.webdriver.example;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.Assert.assertNotNull;

/**
 * Unit Test class for all page objects.
 */
public class PageObjectTests {

    private static final Logger LOG = LoggerFactory.getLogger(PageObjectTests.class);

    /**
     * Test LandingPage.
     */
    @Test
    public final void testLandingPage() {
        final LandingPage page = new LandingPage();
        assertNotNull(page.open());
        assertNotNull(page.verify());
        LOG.info(page.getTitle());
        page.quit();
    }

    /**
     * Unit test to navigate to about.
     */
    @Test
    public final void testAboutPage() {
        final AboutPage page = new AboutPage();
        assertNotNull(page.open());
        assertNotNull(page.verify());
        LOG.info(page.getTitle());
        page.quit();
    }

    /**
     * Unit test to navigate to industries.
     */
    @Test
    public final void testIndustriesPage() {
        final IndustriesPage page = new IndustriesPage();
        assertNotNull(page.open());
        assertNotNull(page.verify());
        LOG.info(page.getTitle());
        page.quit();
    }

    /**
     * Unit test to navigate to services.
     */
    @Test
    public final void testServicesPage() {
        final ServicesPage page = new ServicesPage();
        assertNotNull(page.open());
        assertNotNull(page.verify());
        LOG.info(page.getTitle());
        page.quit();
    }

    /**
     * Unit test to navigate to our clients.
     */
    @Test
    public final void testOurClientsPage() {
        final OurClientsPage page = new OurClientsPage();
        assertNotNull(page.open());
        assertNotNull(page.verify());
        LOG.info(page.getTitle());
        page.quit();
    }

    /**
     * Unit test to navigate to contact us.
     */
    @Test
    public final void testContactUsPage() {
        final ContactUsPage page = new ContactUsPage();
        assertNotNull(page.open());
        assertNotNull(page.verify());
        LOG.info(page.getTitle());
        page.quit();
    }

}
