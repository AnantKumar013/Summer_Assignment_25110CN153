
import java.util.Scanner;



public class LCM {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = scanner.nextInt();

        System.out.print("Enter second number: ");
        int b = scanner.nextInt();

        // Using formula 
        // GCD(A,B) * LCM(A,B) = A * B 
        // LCM(A,B) = A * B / GCD(A,B)

        int LCM = (a * b) / (findGCD(a, b));

        System.out.println("LCM of " + " (" + a + ", " + b + ") " + " = " + LCM);



    }

    public static int findGCD(int a, int b) {


        if (b == 0) return a;

        return findGCD(b, a % b);

    }
    
}
