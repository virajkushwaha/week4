package uncheckedexception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class UncheckedException {
    public static void main(String[] args) {
        try{
            //Taking user input
            Scanner input = new Scanner(System.in);
            int n1 = input.nextInt();
            int n2 = input.nextInt();
            System.out.println(n1/n2);
            //Catching if user divide the number with zero
        } catch (ArithmeticException e) {
            System.out.println("We can not divide anything with zero.");
        }
        //Catching if user enter the wrong input
        catch(InputMismatchException e){
            System.out.println("Input should be integer");
        }
    }
}
