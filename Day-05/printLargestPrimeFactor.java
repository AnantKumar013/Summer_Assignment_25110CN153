
import java.util.Scanner;

public class printLargestPrimeFactor {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int num = sc.nextInt();

        int largestPrimeFactor = -1;

        for (int i = 1; i <= Math.sqrt(num); i++) {

            if (num % i == 0) {

                if (checkPrime(i)) {

                    largestPrimeFactor = Math.max(largestPrimeFactor, i);

                }

                if (num / i != i) {

                    if (checkPrime(num / i)) {

                        largestPrimeFactor = Math.max(largestPrimeFactor, (num / i));

                    }

                }

            }

        }

        System.out.println("Largest Prime factor of " + num + " = " + largestPrimeFactor);

    }

    public static boolean checkPrime(int num) {

        boolean isPrime = true;

        for (int i = 2; i <= Math.sqrt(num); i++) {

            if (num % i == 0) {

                isPrime = false;
                break;

            }

        }

        return isPrime;

    }

}
