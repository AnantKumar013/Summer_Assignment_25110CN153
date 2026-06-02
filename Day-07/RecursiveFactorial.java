
import java.util.Scanner;

public class RecursiveFactorial {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number: ");
        int num = scanner.nextInt();

        System.out.println(factorial(num));



    }

    public static int factorial(int num) {

        int fact = 1;

        if (num == 1 || num == 0) {

            return fact;

        }

        return num * factorial(num - 1);

    }
    
}
