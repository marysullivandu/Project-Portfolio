public class Transaction {
    protected double amount;

    public Transaction(double amount) {
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String toString() {
        return "Transaction: $" + amount;
    }
}
