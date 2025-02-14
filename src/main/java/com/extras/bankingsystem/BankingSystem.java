package com.extras.bankingsystem;

import java.util.*;

public class BankingSystem {
    public static void main(String[] args) {
        // HashMap to store customer accounts
        Map<Integer, Double> accounts = new HashMap<>();

        // TreeMap to sort customers by balance
        TreeMap<Integer, Double> sortedAccounts = new TreeMap<>(Comparator.comparingDouble(accounts::get));

        // Queue to process withdrawal requests
        Queue<WithdrawalRequest> withdrawalQueue = new LinkedList<>();

        // Adding sample accounts
        addAccount(accounts, 3654, 5000.0);
        addAccount(accounts, 6875, 1500.0);
        addAccount(accounts, 7243, 3000.0);

        // Updating the sorted TreeMap
        sortedAccounts.putAll(accounts);

        // Adding withdrawal requests to the queue
        withdrawalQueue.add(new WithdrawalRequest(3654, 2000.0));
        withdrawalQueue.add(new WithdrawalRequest(6875, 1000.0));
        withdrawalQueue.add(new WithdrawalRequest(7243, 200.0));

        // Displaying accounts and balances
        System.out.println("Accounts: " + accounts);
        System.out.println("Sorted Accounts by Balance: " + sortedAccounts);

        // Processing withdrawal requests
        processWithdrawals(accounts, withdrawalQueue);

        // Displaying updated account balances
        System.out.println("Updated Accounts: " + accounts);
    }

    // Method to add an account
    public static void addAccount(Map<Integer, Double> accounts, int accountNumber, double balance) {
        accounts.put(accountNumber, balance); // Adding account to HashMap
    }

    // Method to process withdrawal requests
    public static void processWithdrawals(Map<Integer, Double> accounts, Queue<WithdrawalRequest> withdrawalQueue) {
        while (!withdrawalQueue.isEmpty()) { // While the queue is not empty
            WithdrawalRequest request = withdrawalQueue.poll(); // Retrieve and remove the next request
            int accountNumber = request.getAccountNumber(); // Get account number from the request
            double amount = request.getAmount(); // Get amount from the request

            // Check if account exists and balance is sufficient
            if (accounts.containsKey(accountNumber) && accounts.get(accountNumber) >= amount) {
                accounts.put(accountNumber, accounts.get(accountNumber) - amount); // Deduct amount from balance
                System.out.println("Withdrawal successful for account " + accountNumber + ": -" + amount);
            } else {
                System.out.println("Withdrawal failed for account " + accountNumber + ": Insufficient balance or account not found");
            }
        }
    }


}
