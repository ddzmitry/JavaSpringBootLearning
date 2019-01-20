package validators;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;


// Custom Validator
public class EvenConstraintValidator implements ConstraintValidator<MustBeEven, String> {

    private String thePrefix;

    @Override
    public void initialize(MustBeEven constraintAnnotation) {
//        Get Value
        thePrefix = constraintAnnotation.value();
    }


    @Override
    public boolean isValid(String theCode, ConstraintValidatorContext constraintValidatorContext) {
        boolean result;
        // check and make sure that value is not empty
        System.out.println(theCode);
        if (theCode != null) {

            try {
                // the String to int conversion happens here
                int i = Integer.parseInt(theCode.trim());
                result = i % 2 == 0;
            } catch (NumberFormatException nfe) {
                result = false;

            }

        } else {
            // return true if passed all checks
            result = true;
        }
        // return result at the end
        System.out.println(result);
        return result;
    }


}
