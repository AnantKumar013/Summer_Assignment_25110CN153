
import java.util.Scanner;

public class CheckPrime {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number: ");
        int num = sc.nextInt();

        System.out.println((isPrime(num) == true) ? num + " is a prime number" : num + " is not a prime number");



    }

    public static boolean isPrime(int num) {

        // By 6N + 1 and 6n - 1 rule

        if (num < 2) return false;
        if (num <= 3) return true;

        if (num % 2 == 0 || num % 3 == 0) return false;

        for (int i = 5; i * i <= num; i+= 6) {

            if (num % i == 0) {

                return false;

            }

        }

        return true;

    }
    
}
