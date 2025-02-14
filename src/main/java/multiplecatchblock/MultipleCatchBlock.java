package multiplecatchblock;

import java.util.Scanner;

public class MultipleCatchBlock {
    public static void main(String[] args) {
        int[] arr = new int[5];
        int[] nul = null;
        Scanner input = new Scanner((System.in));
        System.out.println("Enter the Array:");
        for(int i= 0; i<5;i++){
            arr[i] = input.nextInt();
        }
        System.out.println("Enter the index:");
        int index = input.nextInt();

        try{
            int element = arr[index];
            System.out.println("Value at "+index+":"+element);
            element = nul[index];
            System.out.println(element);
        }catch(IndexOutOfBoundsException e){
            System.out.println("Invalid index!");
        }catch(NullPointerException e){
            System.out.println("Array is not initialized!");
        }
    }
}
