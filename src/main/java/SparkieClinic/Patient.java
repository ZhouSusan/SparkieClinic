package SparkieClinic;
import java.util.ArrayList;

public class Patient {

    private ArrayList<Payment> payments;
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

        this.payments = new ArrayList<Payment>();
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

    public void addPayment(Payment pay) {
        payments.add(pay);
    }

    public String patientInfo() {
        return "Patient's name: " + this.name + "\nSocial Security : " + this.socialSecurityNumber + "\nDOB: "
                + this.dateOfBirth + "\nPhone#: " + this.phoneNumber + "\n address: " + this. address
                + "\nIllness : " + this.illness;
    }

    public void getAllPaymentsDue() {
        System.out.printf("Patient: %s", this.name);
        System.out.println("The following charges are your payments due: ");

        double total = 0;
        for (Payment pay : payments) {
            if (!pay.isPaid()) {
                System.out.println(pay.displayAmountDue());
                total += pay.getAmount();
            }
        }
        System.out.printf("Total amount due is %s", total);
    }
}
