
import java.util.Scanner;

public class MultiplicationTabel {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number: ");
        int num = scanner.nextInt();

        for (int i = 1; i <= 10; i++) {

            System.out.println(num + " X " + i + " = " + (num * i));

        }

    }
    
}
