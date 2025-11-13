package BankTransaction;

import javax.naming.InsufficientResourcesException;

public class TransactionMain {
    public static void main(String[] args) {
        Transaction t = new Transaction();
        try {
            t.run(1200);
        } catch (NegativeAmountException e) {
            System.out.println("Transaction failed: " + e.getMessage());
        } catch (InsufficientResourcesException e) {
            System.out.println("Transaction failed: " + e.getMessage());
        } catch (NetworkFailureException e) {
            System.out.println("Transaction failed: " + e.getMessage());
        }
    }
}