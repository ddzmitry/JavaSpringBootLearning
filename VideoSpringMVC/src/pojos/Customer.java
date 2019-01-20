package pojos;

import validators.CourseCode;
import validators.MustBeEven;

import javax.validation.constraints.*;

public class Customer {

    @NotNull(message = "Need first Name")
    @Size(min = 1, message = "is required")
    private String firstName;

    @NotNull(message = "Stupid")
    @Size(min = 1, message = "is required")
    private String lastName;


    @NotNull(message = "Got to have some value")
    @Min(value = 0, message = "must be greater then or equal to zero ")
    @Max(value = 10, message = "must be less then or equal to 10")
    private Integer freePasses;

    @NotNull(message = "Got to put zip code ")
    @Pattern(regexp = "^[a-zA-Z0-9]{5}", message = "Only 5 chars/digits")
    private String ZipCode;

    @MustBeEven(value = "2", message = "Must be Even duude...")
    private String magicNumber;

    // Custom Validator
    @CourseCode(value = "LUV")
    private String courseCode;


    public String getMagicNumber() {
        return magicNumber;
    }

    public void setMagicNumber(String magicNumber) {
        this.magicNumber = magicNumber;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public String getZipCode() {
        return ZipCode;
    }

    public void setZipCode(String zipCode) {
        ZipCode = zipCode;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getFreePasses() {
        return freePasses;
    }

    public void setFreePasses(Integer freePasses) {
        this.freePasses = freePasses;
    }

    public Customer() {
    }
}


