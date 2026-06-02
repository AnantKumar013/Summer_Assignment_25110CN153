
import java.util.Scanner;

public class FindFactorial {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int num = sc.nextInt();

        System.out.println("Factorial of " + num + " = " + fact(num));

    }

    public static long fact(int num) {

        if (num == 0 || num == 1) {

            return 1;

        }

        return num * fact(num - 1);

    }
    
}
