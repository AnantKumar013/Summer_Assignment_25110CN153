import java.util.Scanner;


public class Product_of_Digit {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number: ");
        int num = scanner.nextInt();

        int product = 1, cpynum = num;

        while (cpynum > 0) {

            product *= cpynum % 10;

            cpynum /= 10;

        }

        System.out.println("Product of digit of " + num + " = " + product);

    }
    
}
