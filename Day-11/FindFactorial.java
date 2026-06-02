
import java.util.Scanner;

public class FindFactorial {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int num = sc.nextInt();

        System.out.println("Factorial of " + num + " = " + fact(num));

    }

    // This is recursion version but for big numbers it can cause stack overflow

    public static int fact(int num) {

        if (num == 0 || num == 1) {

            return 1;

        }

        return num * fact(num - 1);

    }
    
}
