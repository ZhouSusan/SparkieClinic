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

    }
}
