package junit.basicjunittesting;

//Create class calculator to perform operations
public class Calculator {
    //Method for addition
    public int add(int a, int b) {
        return a + b;
    }
    //Method for subtraction
    public int subtract(int a, int b) {
        return a - b;
    }
    //Method for multiplication
    public int multiply(int a, int b) {
        return a * b;
    }
    //Method for division
    public int divide(int a, int b) {
        //exception if division by 0 is performed
        if (b == 0) {
            throw new ArithmeticException("Division by zero.");
        }
        return a / b;
    }
    public static void main(String[] args) {
        //create object of Calculator class to access methods
        Calculator calculator = new Calculator();
        //Variables to store sample values
        int a = 10;
        int b = 5;
        //Display the result through method call
        System.out.println("Addition: " + calculator.add(a, b));
        System.out.println("Subtraction: " + calculator.subtract(a, b));
        System.out.println("Multiplication: " + calculator.multiply(a, b));
        System.out.println("Division: " + calculator.divide(a, b));

        //try and catch block to catch and handle exception
        try {
            calculator.divide(1, 0);
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
