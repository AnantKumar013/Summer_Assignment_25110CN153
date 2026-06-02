
import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {

        // STANDARD APPROACH
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter range: ");
        int range = scanner.nextInt();

        int prevOne = 1;
        int prevTwo = 0;

        for (int i = 0; i < range; i++) {

            if (i > 1) {

                int currentVal = prevTwo + prevOne;

                prevTwo = prevOne;
                prevOne = currentVal;
                
                System.out.print(currentVal + " ");

            } else if (i == 0) {

                System.out.print(prevTwo + " ");

            } else if (i == 1) {

                System.out.print(prevOne + " ");

            }

        }

        System.out.println();

        // recusrion
        for (int i = 0; i < range; i++) {

            System.out.print(printFibonacci(i) + " ");

        }


    }

    // RECURSIVE APPROACH

    public static int printFibonacci(int range) {

        if (range == 0) return 0;   // Base case
        if (range == 1) return 1;   // Base case
        return printFibonacci(range - 1) + printFibonacci(range - 2);

    }
    
}
