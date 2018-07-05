
package automation.ddt;

import static org.hamcrest.CoreMatchers.notNullValue;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThat;

public class ExpectedDataTest {

    @Test
    public void type() {
        assertThat(ExpectedData.class, notNullValue());
    }

    @Test
    public void instantiation() {
        final ExpectedData target = new ExpectedData();
        assertThat(target, notNullValue());
    }

    @Test
    public void testExpectedData() {
        final ExpectedData expectedData = new ExpectedData();
        assertNotNull(expectedData);
        expectedData.forTag("@Tag");
    }

}
