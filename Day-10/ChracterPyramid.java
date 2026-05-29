import java.util.Scanner;

public class ChracterPyramid {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter height: ");
        int height = sc.nextInt();

        for (int i = 1; i <= height; i++) {

            char chracter = 'A';

            for (int j = i; j < height; j++) {

                System.out.print("  ");

            }

            for (int l = 1; l <= i; l++) {

                System.out.print(chracter + " ");
                chracter++;
                
            }

            chracter -= 2;

            for (int k = i - 1; k >= 1; k--) {

                System.out.print(chracter + " ");
                chracter--;

            }

            System.out.println();

        }


    }
    
}
