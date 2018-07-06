
package automation.webdriver.example;

import automation.webdriver.AbstractWebSite;

/**
 * An Example WebSite.
 */
public class ExampleWebSite extends AbstractWebSite {

    /**
     * Instantiates a new google search site.
     */
    public ExampleWebSite() {
        super();
    }

    /**
     * Open the web-site.
     *
     * @return
     */
    public AbstractWebSite open() {
        this.page = new LandingPage(this.webDriver);
        this.page.open();
        return this;
    }

    public AbstractWebSite thePageContains(final String text) {
        this.page.contains(text);
        return this;
    }

    public AbstractWebSite verify() {
        this.page.verify();
        return this;
    }

}
