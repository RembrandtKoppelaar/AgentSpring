package agentspring.service;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface SimulationParameter {
    String label();

    String description() default "";

    double from() default Double.NaN;

    double to() default Double.NaN;
}
