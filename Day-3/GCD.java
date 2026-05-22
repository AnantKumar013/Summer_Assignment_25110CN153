import java.util.Scanner;

public class GCD {
    

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = scanner.nextInt();

        System.out.print("Enter second number: ");
        int b = scanner.nextInt();

        System.out.println("GCD of " + " (" + a + ", " + b + ") " + " = " + findGCD(a, b));

        

    }

    // Here we are using Euclidean Algorithm

    public static int findGCD(int a , int b) {


        if (b == 0 ) return a;

        return findGCD(b, a % b);


    }

}
