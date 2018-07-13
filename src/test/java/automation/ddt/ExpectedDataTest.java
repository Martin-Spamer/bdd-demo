
package automation.ddt;

import static org.hamcrest.CoreMatchers.notNullValue;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThat;

/**
 * Unit tests for the ExpectedData class.
 */
public final class ExpectedDataTest {

    /**
     * Unit test to expected data.
     */
    @Test
    public void testExpectedData() {
        final ExpectedData expectedData = new ExpectedData();
        assertNotNull(expectedData);
        assertNotNull(expectedData.forTag("@Tag"));
    }

    /**
     * Type.
     */
    @Test
    public void type() {
        assertThat(ExpectedData.class, notNullValue());
    }

    /**
     * Instantiation.
     */
    @Test
    public void instantiation() {
        final ExpectedData target = new ExpectedData();
        assertThat(target, notNullValue());
    }

}
