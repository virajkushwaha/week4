package exceptionpropogation;

import java.util.Scanner;

public class InterestCalculator {

    // Method to calculate interest
    public static double calculateInterest(double amount, double rate, int years) throws IllegalArgumentException {
        if (amount < 0 || rate < 0) {
            throw new IllegalArgumentException("Amount and rate must be non-negative");
        }
        return amount * Math.pow((1 + rate / 100), years);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter amount: ");
        double amount = scanner.nextDouble();

        System.out.print("Enter rate: ");
        double rate = scanner.nextDouble();

        System.out.print("Enter years: ");
        int years = scanner.nextInt();

        try {
            double result = calculateInterest(amount, rate, years);
            System.out.println("Final amount after " + years + " years: " + result);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        scanner.close();
    }
}
