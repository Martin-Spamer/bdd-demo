
package automation.webdriver;

import static org.junit.Assert.assertNotNull;

import org.junit.Assert;
import org.junit.Test;

/**
 * Unit Test class for the AbstractPageObject class.
 */
public class AbstractPageObjectTest {

    /**
     * A Mock Page Object class.
     */
    public class LandingPage extends AbstractPageObject {
        public LandingPage() {
            super();
        }

        @Override
        protected String pageUrl() {
            return "http://127.0.0.1:8080";
        }

        @Override
        public AbstractPageObject open() {
            this.webDriver.get(pageUrl());
            return this;
        }

        @Override
        public AbstractPageObject verify() {
            final String currentUrl = this.getCurrentUrl();
            assertNotNull(currentUrl);
            return this;
        }

        public void thePageIsLoaded() {
            final String actualUrl = this.webDriver.getCurrentUrl();
            Assert.assertNotNull(actualUrl);
            final String expectedUrl = "http://example.com/";
            Assert.assertEquals(expectedUrl, actualUrl);
        }
    }

    /**
     * Test open page.
     */
    @Test
    public void testAbstractPage() {
        final LandingPage mockPage = new LandingPage();
        assertNotNull(mockPage);
        mockPage.open();
        mockPage.verify();
        mockPage.close();
    }

}
