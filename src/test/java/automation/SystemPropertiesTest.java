
package automation;

import java.util.Properties;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Unit tests for the SystemProperties class.
 */
public final class SystemPropertiesTest {

    /** Provides logging. */
    private static final Logger LOG = LoggerFactory.getLogger(SystemPropertiesTest.class);

    /**
     * Expose system properties.
     */
    @Test
    public void testSystemProperties() {
        final Properties properties = System.getProperties();
        LOG.info("System.getProperties() = {}", prettyPrint(properties));
    }

    /**
     * Pretty print the properties, one per line to aid reading in logs.
     *
     * @param properties the properties
     * @return the properties as String object.
     */
    protected String prettyPrint(final Properties properties) {
        return properties.toString().replace("{", "{\n\t").replace(", ", "\n\t").replace("}", "\n\t}");
    }

}
