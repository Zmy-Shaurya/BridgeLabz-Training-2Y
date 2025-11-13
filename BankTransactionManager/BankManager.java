package BankTransactionManager;

import ATMWithdrawal.InsufficientFundsException;

public class BankManager {
 public void verifyAccount(String accountNo) throws AccountNotFoundException {
     if (accountNo == null || !accountNo.matches("\\d{10}")) {
         throw new AccountNotFoundException("Account not found: " + accountNo);
     }
 }

 public void processTransaction(int balance, int amount) throws InsufficientFundsException {
     if (amount > balance) throw new InsufficientFundsException("Insufficient funds for ₹" + amount);
 }

 public void executeTransaction(String accountNo, int balance, int amount) throws Exception {
     verifyAccount(accountNo);
     processTransaction(balance, amount);
     System.out.println("Transaction executed successfully!");
 }
}
