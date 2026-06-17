
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

        int i = 0, j = arr.length - 1;
        
        while (i < j) {
            
            if (arr[i] == 0 && arr[j] != 0) {
                
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                
                i++;
                j--;
                
            }
            
            i++;
            j--;
            
        }

        System.out.println(Arrays.toString(arr));

    }
}
