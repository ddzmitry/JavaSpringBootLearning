package pojos;

import javax.validation.Valid;
import javax.validation.constraints.*;

public class Customer {

    @NotNull(message = "Need first Name")
    @Size(min = 1, message = "is required")
    private String firstName;

    @NotNull(message = "Stupid")
    @Size(min = 1, message = "is required")
    private String lastName;


    @Min(value = 0, message = "must be greater then or equal to zero ")
    @Max(value = 10, message = "must be less then or equal to 10")
    private int freePasses;

    @Pattern(regexp = "^[a-zA-Z0-9]{5}", message = "Only 5 chars/digits")
    private String ZipCode;

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

    public int getFreePasses() {
        return freePasses;
    }

    public void setFreePasses(int freePasses) {
        this.freePasses = freePasses;
    }

    public Customer() {
    }
}


