
package automation.webdriver;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * Unit Test class for the AbstractPageObject class.
 */
public class AbstractPageObjectTest {

    private static final Logger LOG = LoggerFactory.getLogger(AbstractPageObjectTest.class);

    /**
     * A Mock Page Object class.
     */
    public class LandingPage extends AbstractPageObject {
        @Override
        protected String pageUrl() {
            return "http://127.0.0.1:8080";
        }
    }

    // TODO:
    // @PageUrl("http://127.0.0.1:8080")
    // public class TestPage extends AbstractPageObject {
    // }
    public class SitePage extends AbstractPageObject {
        public class PageHeader extends AbstractPageObject {
            public PageHeader(final WebDriver webDriver) {
                super(webDriver);
            }
        }

        public class PageFooter extends AbstractPageObject {
            public PageFooter(final WebDriver webDriver) {
                super(webDriver);
            }
        }

        private final PageHeader pageHeader;
        private final PageFooter pageFooter;

        public SitePage() {
            super();
            this.pageHeader = new PageHeader(this.webDriver);
            this.pageFooter = new PageFooter(this.webDriver);
        }

        public SitePage(final WebDriver webDriver) {
            super();
            this.pageHeader = new PageHeader(webDriver);
            this.pageFooter = new PageFooter(webDriver);
        }

        @Override
        protected String pageUrl() {
            return "http://127.0.0.1:8080";
        }

        @Override
        public AbstractPageObject verify() {
            super.verify();
            this.pageHeader.verify();
            this.pageFooter.verify();
            return this;
        }

    }

    @Test
    public void testLandingPage() {
        final LandingPage aPage = new LandingPage();
        assertNotNull(aPage);
        assertEquals(aPage, aPage.open());
        assertEquals(aPage, aPage.verify());
        LOG.info("{}", aPage.toString());
        aPage.quit();
    }

    @Test
    public void testSitePage() {
        final SitePage sitePage = new SitePage();
        assertNotNull(sitePage);
        assertEquals(sitePage, sitePage.open());
        assertEquals(sitePage, sitePage.verify());
        LOG.info("{}", sitePage.toString());
        sitePage.quit();
    }

}
