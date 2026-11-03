public class IncomeTester {
    
    public static void main(String[] args) {
        
        // test constructor and getters
        Income income = new Income(2000, "Work");

        if (income.getAmount() == 2000 && income.getSource().equals("Work")){
            System.out.println("Income constructor test passed.");
        }else{
            System.out.println("Income constructor test failed.");
        }

        // test setters and getters
        income.setAmount(1000);
        income.setSource("Investment");

        if (income.getAmount() == 1000 && income.getSource().equals("Investment")){
            System.out.println("Income setter test passed.");
        }else{
            System.out.println("Income setter test failed.");
        }

        // test toString
        System.out.println(income);
    }
}