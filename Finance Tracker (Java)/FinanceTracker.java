import java.util.*;

public class FinanceTracker {
    private List<Transaction> transactions;
    private Map<String, Double> budget;

    public FinanceTracker() {
        this.transactions = new ArrayList<>();
        this.budget = new HashMap<>();
    }

    public void addIncome(double amount, String source) {
        transactions.add(new Income(amount, source));
    }

    public void addExpense(double amount, String category) {
        transactions.add(new Expense(amount, category));
    }

    public void viewTransactions() {
        System.out.println();
        System.out.println("Transactions");
        System.out.println("--------------------");
        if (transactions.isEmpty()) {
            System.out.println("No transactions recorded.");
        } else {
            for (Transaction t : transactions) {
                System.out.println(t);
            }
        }
    }

    public void printTotalBalance() {
        System.out.println();
        System.out.println("Total Balance");
        System.out.println("--------------------");
        double balance = 0;
        for (Transaction t : transactions) {
            if (t instanceof Income) {
                balance += t.getAmount();
            } else if (t instanceof Expense) {
                balance -= t.getAmount();
            }
        }
        System.out.println("Total Balance: $" + balance);
    }

    public void createBudget(double annualSalary) {
        budget.put("Rent", annualSalary * 0.30);
        budget.put("Food", annualSalary * 0.15);
        budget.put("Bills", annualSalary * 0.10);
        budget.put("Entertainment", annualSalary * 0.10);
        budget.put("Savings", annualSalary * 0.20);
        budget.put("Miscellaneous", annualSalary * 0.15);

        System.out.println();
        System.out.println("\nRecommended Budget");
        System.out.println("--------------------");

        for (Map.Entry<String, Double> entry : budget.entrySet()) {
            System.out.println(entry.getKey() + ": $" + entry.getValue());
        }
    }

    public void viewExpenseBreakdown() {
        Map<String, Double> expenseSummary = new HashMap<>();

        for (Transaction t : transactions) {
            if (t instanceof Expense) {
                Expense e = (Expense) t;
                expenseSummary.put(e.getCategory(), 
                    expenseSummary.getOrDefault(e.getCategory(), 0.0) + e.getAmount());
            }
        }

        System.out.println();
        System.out.println("Expense Breakdown");
        System.out.println("--------------------");

        if (expenseSummary.isEmpty()) {
            System.out.println("No expenses recorded.");
        } else {
            for (Map.Entry<String, Double> entry : expenseSummary.entrySet()) {
                System.out.println(entry.getKey() + ": $" + entry.getValue());
            }
        }
    }
}
