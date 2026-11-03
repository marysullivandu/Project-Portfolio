public class FinanceTrackerTester {
    public static void main(String[] args) {

        FinanceTracker financeTracker = new FinanceTracker();

        // functions before adding transactions
        System.out.println("Check Functions' outputs before adding transactions.");
        financeTracker.viewTransactions();
        financeTracker.printTotalBalance();
        financeTracker.createBudget(0);
        financeTracker.viewExpenseBreakdown();

        // add transactions
        financeTracker.addExpense(200,"Food");
        financeTracker.addIncome(2000,"Work");
        financeTracker.addExpense(100,"Clothes");
        financeTracker.addIncome(1000,"Investment");

        // functions after adding transactions
        System.out.println("Check Functions' outputs after adding transactions.");
        financeTracker.viewTransactions();
        financeTracker.printTotalBalance();
        financeTracker.createBudget(70000);
        financeTracker.viewExpenseBreakdown();
    }
}
