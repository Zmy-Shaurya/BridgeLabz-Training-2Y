package ATMWithdrawal;


import java.util.Scanner;

public class ATMMain {
 public static void main(String[] args) {
     ATM atm = new ATM();
     try (Scanner sc = new Scanner(System.in)) {
         System.out.print("Enter amount to withdraw: ");
         int amt = sc.nextInt();
         try {
             atm.withdraw(amt);
         } catch (InsufficientFundsException e) {
             System.out.println("Withdrawal failed: " + e.getMessage());
         }
     }
 }
}
