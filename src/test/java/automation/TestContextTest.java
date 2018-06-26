
package automation;

import static org.hamcrest.CoreMatchers.notNullValue;

import org.junit.Test;

import static org.junit.Assert.assertThat;

import static org.junit.Assume.assumeTrue;

/**
 * Unit Test the TestContext.
 */
public class TestContextTest {

    /**
     * Type.
     */
    @Test
    public void type() {
        assertThat(TestContext.class, notNullValue());
    }

    /**
     * Instantiation.
     */
    @Test
    public void instantiation() {
        TestContext target = new TestContext();
        assertThat(target, notNullValue());
    }

    /**
     * Checks if is local.
     */
    @Test
    public void isLocal() {
        assumeTrue(TestContext.isLocal());
    }

    /**
     * Checks if is tomcat.
     */
    @Test
    public void isTomcat() {
        assumeTrue(TestContext.isTomcat());
    }

}
