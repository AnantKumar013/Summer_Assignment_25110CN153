
import java.util.Scanner;

public class EvenAndOddCount {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int size = sc.nextInt();

        // TAKING INPUT FOR SIZE OF ARRAY FORM USER
        int[] arr = new int[size];

        System.out.println("Enter elements in array: ");

        // LOADING ELEMENTS IN ARRAY USING FOR LOOPS
        for (int i = 0; i < arr.length; i++) {

            arr[i] = sc.nextInt();

        }

        if (size == 0) {

            throw new IllegalArgumentException("Array Size must be grater than 0");

        } else {

            EvenCountAndOddCount(arr);

        }

    }





    public static void EvenCountAndOddCount(int[] arr) {

        int Evensum = 0, Oddsum = 0;

        for (int num : arr) {


            // Here I am treating 0 as neither odd neither even cause it show absence 
            // if we want to include it we can just use (num & 1 == 0) and it will be treated as even 
            if ((num & 1) == 0 && num != 0) {

                Evensum++;

            } else if (num != 0) {

                Oddsum++;

            }

        }

        System.out.println("Number of Even terms = " + Evensum + "\n" + "Number of Odd terms = " + Oddsum);

    }



}
