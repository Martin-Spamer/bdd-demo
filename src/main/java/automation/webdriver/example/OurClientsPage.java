
package automation.webdriver.example;

import org.openqa.selenium.WebDriver;

/**
 * Page Object for Our Clients Page.
 */
public class OurClientsPage extends Navigation {

    /**
     * Instantiates a new our clients page.
     */
    public OurClientsPage() {
        super();
    }

    /**
     * Instantiates a new our clients page.
     *
     * @param webDriver
     *            the web driver
     */
    public OurClientsPage(final WebDriver webDriver) {
        super(webDriver);
    }

    /*
     * (non-Javadoc)
     *
     * @see automation.webdriver.AbstractPageObject#pageUrl()
     */
    @Override
    protected String pageUrl() {
        return "http://127.0.0.1:8080/example/clients.html";
    }

}
