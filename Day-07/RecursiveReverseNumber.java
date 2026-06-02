
import java.util.Scanner;

public class RecursiveReverseNumber {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int num = sc.nextInt();

        System.out.println(reverse(num, 0));

    }

    public static int reverse(int num, int rev) {

        if (num == 0) return rev;

        int digit = num % 10;

        rev = rev * 10 + digit;

        return reverse (num / 10, rev);

        
    }
    
}
