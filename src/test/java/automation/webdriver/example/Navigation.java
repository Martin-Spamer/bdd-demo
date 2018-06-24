
package automation.webdriver.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import automation.webdriver.AbstractPageObject;

/**
 * A Page Object for Navigation.
 * A Page Object can be a fragment of a page.
 */
public abstract class Navigation extends AbstractPageObject {

    /** link to the about us page. */
    @FindBy(xpath = "//a[contains(text(),'About Us')]")
    protected WebElement aboutUs;

    /** link to the industries page. */
    @FindBy(xpath = "//a[contains(text(),'Industries')]")
    protected WebElement industries;

    /** link to the services page. */
    @FindBy(xpath = "//a[contains(text(),'Services')]")
    protected WebElement services;

    /** link to the our clients page. */
    @FindBy(xpath = "//a[contains(text(),'Clients')]")
    protected WebElement clients;

    /** link to the contact us page. */
    @FindBy(xpath = "//a[contains(text(),'Contact Us')]")
    protected WebElement contactUs;

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

    @Override
    public AbstractPageObject verify() {
        PageFactory.initElements(this.webDriver, this);
        verifyWebElement(this.aboutUs);
        verifyWebElement(this.industries);
        verifyWebElement(this.services);
        verifyWebElement(this.clients);
        verifyWebElement(this.contactUs);
        return this;
    }

    /**
     * Simulate some test foo.
     *
     * @param webElement the web element
     */
    protected void simulateSomeTestFoo(final WebElement webElement) {

        webElement.isDisplayed();
        webElement.isEnabled();
        webElement.isSelected();
        System.out.println(webElement.toString());
    }

    /*
     * (non-Javadoc)
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        final StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(String.format("aboutUs = %s", this.aboutUs.toString()));
        stringBuffer.append(String.format("industries = %s", this.industries.toString()));
        stringBuffer.append(String.format("services = %s", this.services.toString()));
        stringBuffer.append(String.format("ourClients = %s", this.clients.toString()));
        stringBuffer.append(String.format("contactUs = %s", this.contactUs.toString()));
        return String.format("%s [%s]", this.getClass().getSimpleName(), stringBuffer);
    }

}
