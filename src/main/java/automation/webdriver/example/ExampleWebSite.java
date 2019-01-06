
package automation.webdriver.example;

import net.atf4j.webdriver.AbstractWebSite;

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
        this.page = new LandingPage(this.webDriver);
        this.page.open();
        return this;
    }

    /**
     * The page contains.
     *
     * @param text the text
     * @return the abstract web site
     */
    public AbstractWebSite thePageContains(final String text) {
        this.page.contains(text);
        return this;
    }

    /**
     * Verify.
     *
     * @return the abstract web site
     */
    public AbstractWebSite verify() {
        this.page.verify();
        return this;
    }

    public void click(final String text) {
    }

}
