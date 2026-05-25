
import java.util.Scanner;

public class StrongNumber {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number: ");

        int num = scanner.nextInt();

        int cpynum = num, sum = 0;

        // My approach

        // while (cpynum > 0) {

        // sum += factorial(cpynum % 10);

        // cpynum /= 10;

        // }

        // APPROACH I LEARNED

        int[] fact = predefinedFactorial();

        while (cpynum > 0) {

            sum += fact[(cpynum % 10)]; // look for factorial instead of calculating every time

            cpynum /= 10;

        }

        System.out.println((num == sum) ? (num + " is a Strong number") : (num + " is not a Strong number"));

    }

    public static int factorial(int num) {

        int fact = 1;

        for (int i = num; i >= 1; i--) {

            fact *= i;

        }

        return fact;

    }

    // There is another approach I learnerd

    public static int[] predefinedFactorial() {

        int[] fact = new int[10];

        fact[0] = 1;

        for (int i = 1; i < 10; i++) {

            fact[i] = fact[i - 1] * i;

        }

        return fact;

    }

}
