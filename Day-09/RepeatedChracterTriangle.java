
import java.util.Scanner;

public class RepeatedChracterTriangle {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter height: ");
        int height = sc.nextInt();

        char chracter = 'A';

        for (int i = 1; i <= height; i++) {

            for (int j = 1; j <= i; j++) {

                System.out.print(chracter + " ");

            }

            chracter++;
            System.out.println();

        }

    }
    
}
