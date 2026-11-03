public class Income extends Transaction {
    private String source;

    public Income(double amount, String source) {
        super(amount);
        this.source = source;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String toString() {
        return "Income: $" + amount + " from " + source;
    }
}
