
import java.util.Scanner;

public class ReversePyramid {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter height: ");
        int height = sc.nextInt();

        for (int i = height; i >= 1; i--) {

            for (int j = i; j < height; j++) {

                System.out.print("  ");

            }

            for (int k = 1; k <= 2 * i - 1; k++) {

                System.out.print("* ");

            }

            System.out.println();

        }

    }
    
}
