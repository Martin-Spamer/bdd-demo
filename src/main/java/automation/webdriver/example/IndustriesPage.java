
package automation.webdriver.example;

import org.openqa.selenium.WebDriver;

/**
 * Page Object for IndustriesPage.
 */
public final class IndustriesPage extends Navigation {

    private static final String PAGE_URL = "http://127.0.0.1:8080/example/industries.html";

    /**
     * Instantiates a new industries page.
     */
    public IndustriesPage() {
        super();
    }

    /**
     * Instantiates a new industries page.
     *
     * @param webDriver
     *            the web driver
     */
    public IndustriesPage(final WebDriver webDriver) {
        super(webDriver);
    }

    /*
     * (non-Javadoc)
     * @see automation.webdriver.AbstractPageObject#pageUrl()
     */
    @Override
    protected String pageUrl() {
        return PAGE_URL;
    }

}
