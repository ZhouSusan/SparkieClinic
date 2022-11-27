# SparkieClinic
## Summary
Welcome to the Sparkie Clinic assignment. By the end of this assignment you will have learned to start working with lists of objects and how to manipulate them.

## Tasks

- Create a Payment class with the following fields and methods
  - private double amount
  - private String date
  - private boolean paid
  - Getters for all fields
  - displayAmountDue which returns a string with the amount due and date
  - pay which sets amount based on argument but does not set negative amounts
  - all methods are public
- Create a Patient class with the following fields and methods
  - private ArrayList<Payment> payments
  - private String name
  - private String dateOfBirth
  - private String socialSecurityNumber
  - private String address
  - private String illness
  - private String phoneNumber
  - private String email
  - Getters for all fields
  - patientInfo which returns a string that displays all the Object's fields
  - addPayment returns nothing. Adds an instance of Payment to payments ArrayList
  - getAllPayments returns nothing. Prints out the total amount due from all Payment objects in payments list.
    - Note: if pay method is invoked or isPaid is true the amount displayed by getAllPayments should reflect this change.
- Create a main class where you will implement print statements that show your expectations and assertions.
