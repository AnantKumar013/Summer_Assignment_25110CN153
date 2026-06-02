import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number: ");
        int num = scanner.nextInt();

        int cpynum = num, revnum = 0;

        while (cpynum > 0) {

            revnum = (revnum *  10) + (cpynum % 10);

            cpynum /= 10;

        }

        System.out.println(revnum == num ? num + " is palindrome." : num + " is not palindrome");

    }
    
}
