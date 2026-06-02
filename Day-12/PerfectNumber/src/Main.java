
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);

        Perfect perfect = new Perfect();

        System.out.print("Enter number: ");
        int num = sc.nextInt();

        System.out.println((perfect.isPerfectNumber(num) == true) ? num + " is a perfect number" : num + " is not a perfect number");
        
    }
}
