package validators;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;


// Custom Validator
public class CourseCodeConstraintValidator implements ConstraintValidator<CourseCode,String> {
    private String[] coursePrefixes;
    @Override
    public void initialize(CourseCode constraintAnnotation) {
//        Get Value
        coursePrefixes= constraintAnnotation.value();
    }

    @Override
    public boolean isValid(String theCode, ConstraintValidatorContext constraintValidatorContext) {
        boolean result = false;
        // check and make sure that value is not empty
        if (theCode != null){
            // check if input starts with prefix
            for (String tempPrefix : coursePrefixes) {
                result = theCode.startsWith(tempPrefix);

                // if we found a match then break out of the loop
                if (result) {
                    break;
                }
            }
        }         else {
            // return true if passed all checks
            result = true;
        }

        // return result at the end
        return result;
    }


}
