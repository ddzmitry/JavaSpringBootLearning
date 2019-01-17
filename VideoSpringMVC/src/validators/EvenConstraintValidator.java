package validators;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;


// Custom Validator
public class EvenConstraintValidator implements ConstraintValidator<MustBeEven,String> {

    private  String thePrefix;

    @Override
    public void initialize(MustBeEven constraintAnnotation) {
//        Get Value
        System.out.println("In INIT");
        System.out.println(constraintAnnotation.value());
        thePrefix= constraintAnnotation.value();
    }


    @Override
    public boolean isValid(String theCode, ConstraintValidatorContext constraintValidatorContext) {
        boolean result;
        // check and make sure that value is not empty
        System.out.println(theCode);

        if (theCode != null){
            // check if input is even
            System.out.println("THE CODEEE");
            System.out.println(theCode);
            result = Integer.parseInt(theCode)%2 == 0;
        } else {
            // return true if passed all checks
            result = true;
        }
        // return result at the end
        System.out.println(result);
        return result;
    }


}
