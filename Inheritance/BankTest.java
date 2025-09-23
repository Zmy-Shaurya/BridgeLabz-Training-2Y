class BankAccount {
    int accountNumber;
    double balance;

    BankAccount(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
}

class SavingsAccount extends BankAccount {
    double interestRate;

    SavingsAccount(int accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    void displayAccountType() {
        System.out.println("Savings Account | Interest Rate: " + interestRate + "%");
    }
}

class CheckingAccount extends BankAccount {
    double withdrawalLimit;

    CheckingAccount(int accountNumber, double balance, double withdrawalLimit) {
        super(accountNumber, balance);
        this.withdrawalLimit = withdrawalLimit;
    }

    void displayAccountType() {
        System.out.println("Checking Account | Withdrawal Limit: " + withdrawalLimit);
    }
}

class FixedDepositAccount extends BankAccount {
    int lockPeriod;

    FixedDepositAccount(int accountNumber, double balance, int lockPeriod) {
        super(accountNumber, balance);
        this.lockPeriod = lockPeriod;
    }

    void displayAccountType() {
        System.out.println("Fixed Deposit Account | Lock Period: " + lockPeriod + " months");
    }
}

public class BankTest {
    public static void main(String[] args) {
        SavingsAccount s = new SavingsAccount(1001, 5000, 4.5);
        CheckingAccount c = new CheckingAccount(1002, 10000, 2000);
        FixedDepositAccount f = new FixedDepositAccount(1003, 20000, 12);

        s.displayAccountType();
        c.displayAccountType();
        f.displayAccountType();
    }
}
