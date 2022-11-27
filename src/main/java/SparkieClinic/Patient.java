package SparkieClinic;

public class Patient {

    private String name;
    private String dateOfBirth;
    private String socialSecurityNumber;
    private String address;
    private String illness;
    private String phoneNumber;
    private String email;

    public Patient(String name, String dateOfBirth, String socialSecurityNumber, String address, String illness, String phoneNumber, String email) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.socialSecurityNumber = socialSecurityNumber;
        this.address = address;
        this.illness = illness;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public String getAddress() {
        return address;
    }

    public String getIllness() {
        return illness;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmail() {
        return email;
    }
}
