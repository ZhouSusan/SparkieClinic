package SparkieClinic;

public class Payment {

    private double amount;
    private String date;
    private boolean paid;

    public Payment(double amount, String date) {
        this.amount = amount;
        this.date = date;
    }

    public double getAmount() {
        return amount;
    }

    public boolean isPaid() {
        return paid;
    }

    public String displayAmountDue() {
        return "Date: " + this.date + ". The amount due is " +this.amount;
    }

    public double pay(double amt) {
        if (this.amount <= amt) {
            this.amount = 0;
            this.paid = true;
        } else {
            this.amount = (this.amount - amt);
        }
        return amt - this.amount;
    }
}
