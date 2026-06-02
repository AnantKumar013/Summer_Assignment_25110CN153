
import java.util.Scanner;

public class LargestAndSmallestElements {

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

            throw new IllegalArgumentException("Array Must not be empty");

        } else {

            System.out.println("Largest Element: " + largestElement(arr));
            System.out.println("Smallest Element: " + smallestElement(arr));

        }

    }

    // Method for calculating largest value in array

    public static int largestElement(int[] arr) {

        int largestElement = Integer.MIN_VALUE;

        for (int num : arr) {

            if (num > largestElement) {

                largestElement = num;

            }

        }

        return largestElement;

    }

    // Method for calculating smallest element in array
    public static int smallestElement(int[] arr) {

        int smallestElement = Integer.MAX_VALUE;

        for (int num : arr) {

            if (num < smallestElement) {

                smallestElement = num;

            }

        }

        return smallestElement;

    }

}
