
package automation.webdriver.example;

import org.openqa.selenium.WebDriver;

/**
 * Page Object for About Page.
 */
public final class AboutPage extends Navigation {

    /**
     * Instantiates a new about page.
     */
    public AboutPage() {
        super();
    }

    /**
     * Instantiates a new about page.
     *
     * @param webDriver
     *            the web driver
     */
    public AboutPage(final WebDriver webDriver) {
        super(webDriver);
    }

    /*
     * (non-Javadoc)
     * @see com.example.automation.webdriver.AbstractPageObject#pageUrl()
     */
    @Override
    protected String pageUrl() {
        return "http://127.0.0.1:8080/example/about.html";
    }

}
