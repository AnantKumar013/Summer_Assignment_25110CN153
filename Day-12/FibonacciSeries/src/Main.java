
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        Fibonacci fibonacci = new Fibonacci();

        System.out.print("Enter range: ");
        int range = sc.nextInt();

        fibonacci.printFibonacciSeries(range);
        
    }
}
