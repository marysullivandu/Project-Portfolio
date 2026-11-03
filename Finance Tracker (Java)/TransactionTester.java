public class TransactionTester {
    public static void main(String[] args) {
        
        // test constructor and getters
        Transaction transaction = new Transaction(100);

        if (transaction.getAmount() == 100){
            System.out.println("Transaction constructor test passed.");
        }else{
            System.out.println("Transaction constructor test failed.");
        }

        // test setters and getters
        transaction.setAmount(-20);

        if (transaction.getAmount() == -20){
            System.out.println("Transaction setter test passed.");
        }else{
            System.out.println("Transaction setter test failed.");
        }

        // test toString
        System.out.println(transaction);
    }
}
