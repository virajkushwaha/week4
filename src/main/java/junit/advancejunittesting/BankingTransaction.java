package junit.advancejunittesting;

public class BankingTransaction {
    private double balance;
    // constructor to initialize the account
    public BankingTransaction(double initialBalance) {
        this.balance = initialBalance;
    }
    // method to deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }
    // method to withdraw money
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        } else {
            throw new IllegalArgumentException("insufficient funds");
        }
    }
    // method to get the current balance
    public double getBalance() {
        return balance;
    }
    public static void main(String[] args) {
        // create a bank account object
        BankingTransaction account = new BankingTransaction(90000);
        account.deposit(5600);
        account.withdraw(900);

        //Method call to print the balance
        System.out.println("current balance: " + account.getBalance());
    }
}
