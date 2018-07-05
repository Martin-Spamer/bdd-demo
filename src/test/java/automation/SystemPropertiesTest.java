
package automation;

import java.util.Properties;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SystemPropertiesTest {

    protected final Logger log = LoggerFactory.getLogger(this.getClass().getSimpleName());

    /**
     * Expose system properties.
     */
    @Test
    public void testSystemProperties() {
        final Properties properties = System.getProperties();
        this.log.info("System.getProperties() = {}", prettyPrint(properties));
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
