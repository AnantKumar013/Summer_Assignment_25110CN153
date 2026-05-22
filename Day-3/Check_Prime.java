
import java.util.Scanner;

public class Check_Prime {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number: ");
        int num = scanner.nextInt();

        boolean prime = true;

        for (int i = 2; i <= Math.sqrt(num); i++) {

            if (num % i == 0) {

                prime = false;
                break;

            }

        }

        System.out.println(prime == true ? num + " is a prime number." : num + " is not a prime number");

    }
    
}
