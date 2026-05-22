
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number: ");
        int num = scanner.nextInt();

        int fact = 1;

        for (int i = num; i >= 1; i--) {

            fact *= i;

        } 

        System.out.println("Factorial = " + fact );

    }
    
}
