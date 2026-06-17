
import java.util.Arrays;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];

        for (int i = 0; i < arr.length; i++) {

            arr[i] = i;

        }

        int i = 0;

        for (int n : arr) {

            if (n != 0) {

                arr[i++] = n;

            }

        }

        while (i < arr.length) arr[i++] = 0;

        System.out.println(Arrays.toString(arr));

    }
}
