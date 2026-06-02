
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        Palindrome palindrome = new Palindrome();

        System.out.print("Enter number: ");
        int num = sc.nextInt();

        System.out.println((palindrome.isPalindrome(num) == true) ? num + " is a palindrome number" : num + " is not a palindrome number");

    }
}
