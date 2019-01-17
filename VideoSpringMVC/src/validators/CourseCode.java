package validators;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Constraint(validatedBy = CourseCodeConstraintValidator.class)
@Target({ElementType.METHOD, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)

//Custom Validator
public @interface CourseCode {
    //    define default course code
    public String value() default "LUV";

    // define deefault error message
    public String message() default "must start with LUV";

    // define default groups
    public Class<?>[] groups() default{};

    // define default payload
    public Class< ? extends Payload >[] payload() default {};

}
