package ATMWithdrawal;

public class ATM {
 private int balance = 10_000; // ₹10,000

 public void withdraw(int amount) throws InsufficientFundsException {
     if (amount <= 0) throw new InsufficientFundsException("Amount must be positive.");
     if (amount > balance) {
         throw new InsufficientFundsException("Insufficient funds. Available: ₹" + balance);
     }
     balance -= amount;
     System.out.println("Withdrawal successful. New balance: ₹" + balance);
 }
}
