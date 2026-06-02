
import java.util.Scanner;

public class convertDecimalToBinary {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        StringBuilder binary = new StringBuilder();

        System.out.print("Enter number: ");
        int num = sc.nextInt();

        int temp = num;

        while (temp > 0) {

            binary.append(temp % 2);

            temp /= 2; 

        }


        System.out.println(num + " in binary = " + binary.reverse());

    }

}
