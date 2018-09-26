
package automation.webdriver.example;

import org.openqa.selenium.WebDriver;

/**
 * Page Object for Services page.
 */
public final class ServicesPage extends Navigation {

    private static final String PAGE_URL = "http://127.0.0.1:8080/example/services.html";

    /**
     * Instantiates a new services page.
     */
    public ServicesPage() {
        super();
    }

    /**
     * Instantiates a new services page.
     *
     * @param webDriver
     *            the web driver
     */
    public ServicesPage(final WebDriver webDriver) {
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
