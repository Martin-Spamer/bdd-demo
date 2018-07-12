
package automation.webdriver;

import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.CLASS;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

/**
 * The Interface PageUrl.
 */
@Documented
@Retention(CLASS)
@Target(TYPE)
public @interface PageUrl {
    
    /**
     * Value.
     *
     * @return the string
     */
    String value();
}
