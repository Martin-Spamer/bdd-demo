
package automation.webdriver.example;

import org.openqa.selenium.WebDriver;

/**
 * Page Object for ContactUsPage.
 */
public class ContactUsPage extends Navigation {

    /**
     * Instantiates a new contact us page.
     */
    public ContactUsPage() {
        super();
    }

    /**
     * Instantiates a new contact us page.
     *
     * @param webDriver
     *            the web driver
     */
    public ContactUsPage(final WebDriver webDriver) {
        super(webDriver);
    }

    /*
     * (non-Javadoc)
     *
     * @see com.example.automation.webdriver.AbstractPageObject#pageUrl()
     */
    @Override
    protected String pageUrl() {
        return "http://127.0.0.1:8080/contact.html";
    }

}
