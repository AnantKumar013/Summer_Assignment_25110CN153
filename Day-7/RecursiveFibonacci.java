
import java.util.Scanner;

public class RecursiveFibonacci {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter range: ");
        int range = sc.nextInt();


        for (int i = 0; i < range; i++) {

            System.out.print(fibonacci(i) + " ");

        }


    }

    public static int fibonacci(int range) {

        if (range == 0) {

            return 0;

        } else if (range == 1) {

            return 1;

        }

        return fibonacci(range - 1) + fibonacci(range - 2);

    }
    
}
