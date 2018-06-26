
package automation.webdriver;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;

/**
 * Unit Test class for the AbstractPageObject class.
 */
public class AbstractPageObjectTest {

    /**
     * A Mock Page Object class.
     */
    public class LandingPage extends AbstractPageObject {
        
        /**
         * The Constructor.
         */
        public LandingPage() {
            super();
        }

        /* (non-Javadoc)
         * @see automation.webdriver.AbstractPageObject#pageUrl()
         */
        @Override
        protected String pageUrl() {
            return "http://127.0.0.1:8080";
        }

        /* (non-Javadoc)
         * @see automation.webdriver.AbstractPageObject#open()
         */
        @Override
        public AbstractPageObject open() {
            this.webDriver.get(pageUrl());
            return this;
        }

        /* (non-Javadoc)
         * @see automation.webdriver.AbstractPageObject#verify()
         */
        @Override
        public AbstractPageObject verify() {
            final String currentUrl = getCurrentUrl();
            assertNotNull(currentUrl);
            return this;
        }

        /**
         * The page is loaded.
         */
        public void thePageIsLoaded() {
            final String actualUrl = this.webDriver.getCurrentUrl();
            Assert.assertNotNull(actualUrl);
            final String expectedUrl = "http://example.com/";
            Assert.assertEquals(expectedUrl, actualUrl);
        }

        /* (non-Javadoc)
         * @see automation.webdriver.AbstractPageObject#quit()
         */
        @Override
        public void quit() {
            // TODO Auto-generated method stub

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
        mockPage.quit();
    }

}
