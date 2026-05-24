import java.util.Scanner;

public class perfect_number {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int num = sc.nextInt();

        int sum = 0;

        for (int i = 1; i <= (num / 2); i++) {

            if (num % i == 0) {

                sum += i;

            }

        }

        System.out.println((sum == num) ? (num + " is a perfect number") : (num + " is not a perfect number"));



    }
    
}
