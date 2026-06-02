
import java.util.Scanner;

public class Sum_of_Digit {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Number: ");
        int num = scanner.nextInt();

        int sum = 0, cpynum = num;

        while (cpynum > 0) {

            sum += cpynum % 10;

            cpynum /= 10;

        }

        System.out.println("Sum of digits of " + num + " = " + sum);



    }
}
