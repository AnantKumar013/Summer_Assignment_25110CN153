
import java.util.Arrays;
import java.util.Scanner;

public class InputAndPrintArray {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter " + size + " elements:-");


        // Putting elements in array
        for (int i = 0; i < arr.length; i++) {

            arr[i] = sc.nextInt();

        }

        System.out.println("Required array:-");
        // Two methods for Printing array

        // FIRST METHOD BY LOOP

        for (int i = 0; i < arr.length; i++) {

            System.out.print(arr[i] + " ");

        }

        System.out.println();

        // SECOND METHOD 
        // Use built in java function called Arrays

        System.out.print(Arrays.toString(arr));



    }

}
