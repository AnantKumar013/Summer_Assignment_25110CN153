import java.util.Scanner;


public class ReverseStarPattern {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter height: ");
        int height = sc.nextInt();

        for (int i = height; i >= 1; i--) {

            for (int j = 1; j <= i; j++) {

                System.out.print("* ");

            }
            
            System.out.println();

        }

    }
    
}
