package compiler488.codegen.visitor;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * A processor fired when an AST node is visited for the first time
 *
 * @author Daniel Bloemendal
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface PreProcessor {
 String target();
}
