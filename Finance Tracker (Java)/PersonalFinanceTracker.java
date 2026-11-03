import java.util.InputMismatchException;
import java.util.Scanner;

public class PersonalFinanceTracker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        FinanceTracker tracker = new FinanceTracker();

        while (true) {
            int choice = -1;
            while (true) {
                try {
                    System.out.println("\nPersonal Finance Tracker");
                    System.out.println("1. Add Income");
                    System.out.println("2. Add Expense");
                    System.out.println("3. View Transactions");
                    System.out.println("4. Get Total Balance");
                    System.out.println("5. Create Budget");
                    System.out.println("6. View Expense Breakdown");
                    System.out.println("7. Exit");
                    System.out.print("Enter choice: ");
                    choice = scanner.nextInt();
                    scanner.nextLine();
                    break;
                } catch (InputMismatchException e) {
                    System.out.println("Invalid input. Please enter a number between 1 and 7.");
                    scanner.nextLine(); 
                }
            }
            
            switch (choice) {
                case 1:
                    double incomeAmount;
                    while (true) {
                        try {
                            System.out.print("Enter income amount: ");
                            incomeAmount = scanner.nextDouble();
                            scanner.nextLine();
                            break;
                        } catch (InputMismatchException e) {
                            System.out.println("Invalid input. Please enter a valid number for income.");
                            scanner.nextLine();
                        }
                    }
                    System.out.print("Enter income source: ");
                    String source = scanner.nextLine();
                    tracker.addIncome(incomeAmount, source);
                    break;
                case 2:
                    double expenseAmount;
                    while (true) {
                        try {
                            System.out.print("Enter expense amount: ");
                            expenseAmount = scanner.nextDouble();
                            scanner.nextLine();
                            break;
                        } catch (InputMismatchException e) {
                            System.out.println("Invalid input. Please enter a valid number for expense.");
                            scanner.nextLine();
                        }
                    }
                    System.out.print("Enter expense category: ");
                    String category = scanner.nextLine();
                    tracker.addExpense(expenseAmount, category);
                    break;
                case 3:
                    tracker.viewTransactions();
                    break;
                case 4:
                    tracker.printTotalBalance();
                    break;
                case 5:
                    double salary;
                    while (true) {
                        try {
                            System.out.print("Enter annual salary: ");
                            salary = scanner.nextDouble();
                            scanner.nextLine();
                            break;
                        } catch (InputMismatchException e) {
                            System.out.println("Invalid input. Please enter a valid number for salary.");
                            scanner.nextLine();
                        }
                    }
                    tracker.createBudget(salary);
                    break;
                case 6:
                    tracker.viewExpenseBreakdown();
                    break;
                case 7:
                    System.out.println("Exiting program...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}
