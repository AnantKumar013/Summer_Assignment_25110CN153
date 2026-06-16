import java.util.Scanner;

public class LinearSearch {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter elements in array: ");

        for (int i = 0; i < size; i++) {

            arr[i] = sc.nextInt();

        }

        System.out.print("Enter target element: ");
        int target = sc.nextInt();

        System.out.println(target + " is at index " + linearSearch(arr, target));



    }

    public static int linearSearch(int[] arr, int target) {

        int index = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == target) {

                index = i;
                break;

            }

        }

        return index;

    }

}
