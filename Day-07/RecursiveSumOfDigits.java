import java.util.Scanner;

public class RecursiveSumOfDigits {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter range: ");
        int range = sc.nextInt();

        System.out.println(sumOfRange(range));



    }

    public static int sumOfRange(int range) {


        if (range == 0) {

            return 0;

        }

        return range + sumOfRange(range - 1);

    }
    
}
