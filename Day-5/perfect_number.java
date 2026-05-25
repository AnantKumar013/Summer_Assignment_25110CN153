import java.util.Scanner;

public class perfect_number {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int num = sc.nextInt();

        int sum = 1;

        for (int i = 2; i <= Math.sqrt(num); i++) {

            if (num % i == 0) {

                sum += i;

                if ((num / i) != num && (num / i) != i) {

                    sum += (num / i);

                }

            }

        }

        System.out.println((sum == num) ? (num + " is a perfect number") : (num + " is not a perfect number"));

    }

}
