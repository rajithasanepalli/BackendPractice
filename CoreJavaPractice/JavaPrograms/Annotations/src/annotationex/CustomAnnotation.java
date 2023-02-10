
/**
 * this annotation is used for method to check value of integer
 */
package annotationex;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;
import java.lang.annotation.Documented;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

@Documented
@Retention(RUNTIME)
@Target(METHOD)
@Inherited
/**
 * @author Dell
 *
 */

public @interface CustomAnnotation {
	int data() default 100;
	String message() default "hello";
}
