import java.util.Scanner;

public class BinaryToDecimal {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number in binary: ");
        int num = sc.nextInt();

        int temp = num, sum = 0, base = 1;

        while (temp > 0) {

            sum += (temp % 10) * base;

            base *= 2;

            temp /= 10;

        }

        System.out.println(num + " in decimal = " + sum);

    }
    
}
