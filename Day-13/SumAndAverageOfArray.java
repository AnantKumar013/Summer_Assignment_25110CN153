
import java.util.Scanner;

public class SumAndAverageOfArray {

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

        // PRINTING REQUIRED SUM AND AVERAGE
        System.out.println("Sum = " + sumOfElementsOfArray(arr));
        System.out.println("Average = " + averageOfElementsOfArray(arr));

    }


    // METHOD FOR CALCULATING SUM OF ELEMENTS OF ARRAY USING FOR- EACH LOOP
    public static int sumOfElementsOfArray(int[] arr) {

        int sum = 0;

        for (int num : arr) {

            sum += num;

        }

        return sum;

    }


// METHOD FOR CALCULATING AVERAGE OF ELEMENTS IN ARRAY USING PREVIOUS METHOD FUNCTIONALITY
    public static double averageOfElementsOfArray(int[] arr) {

        if (arr.length == 0) return 0.0;

        return (sumOfElementsOfArray(arr) * 1.0 / arr.length);

    }

}
