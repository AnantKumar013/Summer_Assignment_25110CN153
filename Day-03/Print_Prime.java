import java.util.Scanner;

public class Print_Prime {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number: ");
        int num = scanner.nextInt();

        for (int i = 2; i <= num; i++) {

            if(checkPrime(i)) {

                System.out.print(i + " ");

            }

        }

    }


    public static boolean checkPrime(int a) {

        boolean isPrime = true;

        for (int i = 2; i <= Math.sqrt(a); i++) {

            if (a % i == 0) {

                isPrime = false;
                break;

            }

        }

        return isPrime;

    }
    
}
