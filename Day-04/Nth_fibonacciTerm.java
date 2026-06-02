
import java.util.Scanner;

public class Nth_fibonacciTerm {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter term: ");
        int term = scanner.nextInt();

        int prevOne = 1;
        int prevTwo = 0;
        int currentval = 0;

        if (term == 1) {

            System.out.println(prevTwo);

        } else if (term == 2) {

            System.out.println(prevOne);

        } else {

            for (int i = 2; i < term; i++) {

                currentval = prevOne + prevTwo;

                prevTwo = prevOne;
                prevOne = currentval;

            }

            System.out.println(currentval);

            
        }

        System.out.println(Nth_term(term));

    }

    // RECURSIVE APPROACH

    public static int Nth_term(int term) {

        if (term == 1 || term == 0) return 0;
        if (term == 2) return 1;

        return Nth_term(term - 1) + Nth_term(term - 2);

    }
    
}
