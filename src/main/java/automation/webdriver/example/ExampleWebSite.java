
package automation.webdriver.example;

import automation.webdriver.AbstractWebSite;

/**
 * An Example WebSite.
 */
public final class ExampleWebSite extends AbstractWebSite {

    /**
     * Instantiates a new google search site.
     */
    public ExampleWebSite() {
        super();
    }

    /**
     * Open the web-site.
     *
     * @return the abstract web site
     */
    public AbstractWebSite open() {
        page = new LandingPage(webDriver);
        page.open();
        return this;
    }

    /**
     * The page contains.
     *
     * @param text the text
     * @return the abstract web site
     */
    public AbstractWebSite thePageContains(final String text) {
        page.contains(text);
        return this;
    }

    /**
     * Verify.
     *
     * @return the abstract web site
     */
    public AbstractWebSite verify() {
        page.verify();
        return this;
    }

}
