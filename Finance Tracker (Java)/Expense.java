public class Expense extends Transaction {
    private String category;

    public Expense(double amount, String category) {
        super(amount);
        this.category = category;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String toString() {
        return "Expense: $" + amount + " for " + category;
    }
}
