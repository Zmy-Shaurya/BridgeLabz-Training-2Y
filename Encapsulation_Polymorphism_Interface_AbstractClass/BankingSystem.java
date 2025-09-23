abstract class BankAccount {
    private int accountNumber;
    private String holderName;
    private double balance;

    public BankAccount(int accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

    public int getAccountNumber() { return accountNumber; }
    public String getHolderName() { return holderName; }
    public double getBalance() { return balance; }

    public void deposit(double amount) { balance += amount; }
    public void withdraw(double amount) { if (amount <= balance) balance -= amount; }

    public abstract double calculateInterest();
}

interface Loanable {
    void applyForLoan();
    double calculateLoanEligibility();
}

class SavingsAccount extends BankAccount implements Loanable {
    public SavingsAccount(int acc, String name, double bal) { super(acc, name, bal); }

    @Override
    public double calculateInterest() { return getBalance() * 0.04; }

    @Override
    public void applyForLoan() { System.out.println("Savings account loan applied."); }

    @Override
    public double calculateLoanEligibility() { return getBalance() * 0.5; }
}

class CurrentAccount extends BankAccount implements Loanable {
    public CurrentAccount(int acc, String name, double bal) { super(acc, name, bal); }

    @Override
    public double calculateInterest() { return getBalance() * 0.02; }

    @Override
    public void applyForLoan() { System.out.println("Current account loan applied."); }

    @Override
    public double calculateLoanEligibility() { return getBalance() * 0.3; }
}

public class BankingSystem {
    public static void main(String[] args) {
        BankAccount s = new SavingsAccount(101, "Ayush", 50000);
        BankAccount c = new CurrentAccount(102, "Raj", 100000);

        System.out.println(s.getHolderName() + " Interest: " + s.calculateInterest());
        System.out.println(c.getHolderName() + " Interest: " + c.calculateInterest());

        if (s instanceof Loanable) {
            ((Loanable) s).applyForLoan();
            System.out.println("Loan Eligibility: " + ((Loanable) s).calculateLoanEligibility());
        }
    }
}
