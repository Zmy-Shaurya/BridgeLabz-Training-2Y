package BankTransactionManager;

import ATMWithdrawal.InsufficientFundsException;

public class BankMain {
 public static void main(String[] args) {
     BankManager bm = new BankManager();
     try {
         bm.executeTransaction("1234567890", 2000, 3000);
     } catch (AccountNotFoundException e) {
         System.out.println("Failed: " + e.getMessage());
     } catch (InsufficientFundsException e) {
         System.out.println("Failed: " + e.getMessage());
     } catch (Exception e) {
         System.out.println("Unexpected: " + e.getMessage());
     } finally {
         System.out.println("Transaction complete.");
     }
 }
}
