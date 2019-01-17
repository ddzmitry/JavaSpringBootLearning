package validators;


import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


@Constraint(validatedBy = EvenConstraintValidator.class)
@Target({ElementType.METHOD, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface MustBeEven {

    public String value() default "5";

   // define deefault error message
    public String message() default "must be even";

    // define default groups
    public Class<?>[] groups() default{};

    // define default payload
    public Class< ? extends Payload>[] payload() default {};
}
