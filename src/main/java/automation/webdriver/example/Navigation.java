
package automation.webdriver.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.junit.Assert.assertTrue;

import automation.webdriver.AbstractPageObject;

/**
 * A Page Object for Navigation.
 * A Page Object can be a fragment of a page.
 */
public abstract class Navigation extends AbstractPageObject {

    /** link to the about us page. */
    @FindBy(xpath = "//a[contains(text(),'About Us')]")
    WebElement aboutUs;

    /** link to the industries page. */
    @FindBy(xpath = "//a[contains(text(),'Industries')]")
    WebElement industries;

    /** link to the services page. */
    @FindBy(xpath = "//a[contains(text(),'Services')]")
    WebElement services;

    /** link to the our clients page. */
    @FindBy(xpath = "//a[contains(text(),'Clients')]")
    WebElement clients;

    /** link to the contact us page. */
    @FindBy(xpath = "//a[contains(text(),'Contact Us')]")
    WebElement contactUs;

    /**
     * Instantiates a new navigation.
     */
    public Navigation() {
        super();
    }

    /**
     * Instantiates a new navigation.
     *
     * @param webDriver
     *            the web driver
     */
    public Navigation(final WebDriver webDriver) {
        super(webDriver);
    }

    /*
     * (non-Javadoc)
     * @see automation.webdriver.AbstractPageObject#verify()
     */
    @Override
    public AbstractPageObject verify() {
        super.verify();
        verifyWebElement(aboutUs);
        verifyWebElement(industries);
        verifyWebElement(services);
        verifyWebElement(clients);
        verifyWebElement(contactUs);
        return this;
    }

    /**
     * Simulate some test foo.
     *
     * @param webElement the web element
     */
    protected void simulateSomeTestFoo(final WebElement webElement) {
        log.info("{}", webElement);
        assertTrue(webElement.isDisplayed());
        assertTrue(webElement.isEnabled());
        assertTrue(webElement.isSelected());
    }

    /*
     * (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        final StringBuilder str = new StringBuilder();
        str.append(String.format("aboutUs = %s,", aboutUs.toString()));
        str.append(String.format("industries = %s,", industries.toString()));
        str.append(String.format("services = %s,", services.toString()));
        str.append(String.format("ourClients = %s,", clients.toString()));
        str.append(String.format("contactUs = %s", contactUs.toString()));
        return String.format("%s [%s]", this.getClass().getSimpleName(), str);
    }

}
