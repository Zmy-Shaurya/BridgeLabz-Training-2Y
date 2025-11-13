package BankTransaction;

import java.util.Random;

import javax.naming.InsufficientResourcesException;

public class Transaction {
    private int balance = 5000;
    private final Random rnd = new Random();

    public void run(int amount) throws NegativeAmountException, InsufficientResourcesException, NetworkFailureException {
        int r = rnd.nextInt(3);
        if (amount < 0) throw new NegativeAmountException("Amount cannot be negative.");
        if (r == 0) throw new InsufficientResourcesException("Insufficient balance for ₹" + amount);
        if (r == 1) throw new NetworkFailureException("Network error. Please try again.");
        if (amount > balance) throw new InsufficientResourcesException("Insufficient balance. Available: ₹" + balance);
        balance -= amount;
        System.out.println("Transaction successful. New balance: ₹" + balance);
    }
}
