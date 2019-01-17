package validators;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;


// Custom Validator
public class CourseCodeConstraintValidator implements ConstraintValidator<CourseCode,String> {

    private  String coursePrefix;

    @Override
    public void initialize(CourseCode constraintAnnotation) {
//        Get Value
        coursePrefix= constraintAnnotation.value();
    }

    @Override
    public boolean isValid(String theCode, ConstraintValidatorContext constraintValidatorContext) {
        boolean result;
        // check and make sure that value is not empty
        if (theCode != null){
            // check if input starts with prefix
            result = theCode.startsWith(coursePrefix);
        } else {
            // return true if passed all checks
            result = true;
        }
        // return result at the end
        return result;
    }


}
