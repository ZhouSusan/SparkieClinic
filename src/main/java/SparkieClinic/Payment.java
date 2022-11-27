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
}
