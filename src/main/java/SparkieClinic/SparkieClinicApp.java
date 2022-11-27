package SparkieClinic;

public class SparkieClinicApp {
    public static void main(String[] args) {
        System.out.println("Welcome to Sparkie Clinic!");
        System.out.println("We are going to tour our systems to show case their reliability");
//        Given
        Patient joe = new Patient("Joe", "1/1/1990","1234567",
                "123 applewood", "Cookie feever", "1234567890", "meLoveCookies@cookieFactory.com");
        Payment checkForMalaria = new Payment(100.00, "11/22/2222");
        Payment checkForCommonCOld = new Payment(10.00, "11/22/2222");
        Payment checkForCoolSticker = new Payment(5.00, "11/20/2000");

        System.out.println("---------------- No compile errors when creating Patients and Payments");
        System.out.println("Given an instance of Patient we should be able to access all of it's getters and getPatientInfo");
        System.out.printf("These fields are as follows:\nname: %s\nDOB: %s\nSS: %s\naddress: %s\nillness: %s\nphone num: %s\n" +
                        "email: %s\n", "Joe", "1/1/1990","1234567",
                "123 applewood", "Cookie feever", "1234567890", "meLoveCookies@cookieFactory.com");
        System.out.printf("\nThis is what we got:\nname: %s\nDOB: %s\nSS: %s\naddress: %s\nillness: %s\nphone num: %s\n" +
                "email: %s\n", joe.getName(), joe.getDateOfBirth(), joe.getSocialSecurityNumber(), joe.getAddress(), joe.getIllness(),
        joe.getPhoneNumber(), joe.getPhoneNumber(), joe.getEmail());
        System.out.println("-------------------Getter test complete\n");
        System.out.println("Here is the patientInfoMethod. It should return a formated string with all the patient info.");
        System.out.println(joe.patientInfo());
        System.out.println("--------------------Patient info confirmed");
        System.out.println("Should not throw an error when adding Payment instances to an insatnce of Patient");
        System.out.println("CheckForMalaria " + checkForMalaria.displayAmountDue());
        joe.addPayment(checkForMalaria);
        System.out.println("checkForCommonCOld " + checkForCommonCOld.displayAmountDue());
        joe.addPayment(checkForCommonCOld);
        System.out.println("CheckForCoolSticker " + checkForCoolSticker.displayAmountDue());
        joe.addPayment(checkForCoolSticker);
        System.out.println("-------------------Payments loaded successfully");

        System.out.println("Should expect to see a total amount due of 115 along with the individual Payments.");
        joe.getAllPaymentsDue();
        System.out.println("\ngetAllPaymentsDue test complete---------------------------");
        System.out.println("By invoking pay method on commonCold and putting an excess of 10 we should only see 0 not neg values\n");
        checkForCommonCOld.pay(10000000000000.0);
        System.out.println(checkForCommonCOld.displayAmountDue());
        System.out.println("We should see an accurate balance if we only pay partial. In this case expect 2.5");
        checkForCoolSticker.pay(2.5);
        System.out.println(checkForCoolSticker.displayAmountDue());
        System.out.println("Manipulating payment test complete ------------------------------");
        System.out.println("Should see an accurate reflection on patient getAllPaymentsDue");
        joe.getAllPaymentsDue();

    }
}
