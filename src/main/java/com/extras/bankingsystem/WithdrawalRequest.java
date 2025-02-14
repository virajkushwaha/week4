package com.extras.bankingsystem;

// Withdrawal request class
public class WithdrawalRequest {
    //Private Instance vaiables
    private final int accountNumber;
    private final double amount;

    //Constructor to initialize values
    public WithdrawalRequest(int accountNumber, double amount) {
        this.accountNumber = accountNumber;
        this.amount = amount;
    }

    // Getter for account number
    public int getAccountNumber() {
        return accountNumber;
    }

    // Getter for amount
    public double getAmount() {
        return amount;
    }
}
