public class ExpenseTester {
        
    public static void main(String[] args) {
        
        // test constructor and getters
        Expense expense = new Expense(200, "Food");

        if (expense.getAmount() == 200 && expense.getCategory().equals("Food")){
            System.out.println("Expense constructor test passed.");
        }else{
            System.out.println("Expense constructor test failed.");
        }

        // test setters and getters
        expense.setAmount(1000);
        expense.setCategory("Rent");

        if (expense.getAmount() == 1000 && expense.getCategory().equals("Rent")){
            System.out.println("Expense setter test passed.");
        }else{
            System.out.println("Expense setter test failed.");
        }

        // test toString
        System.out.println(expense);
    }
}
