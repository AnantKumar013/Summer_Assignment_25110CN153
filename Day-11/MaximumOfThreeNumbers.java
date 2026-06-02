
import java.util.Scanner;

public class MaximumOfThreeNumbers {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter first number: ");
        int numOne = sc.nextInt();

        System.out.print("Enter second number: ");
        int numTwo = sc.nextInt();

        System.out.print("Enter third number: ");
        int numThree = sc.nextInt();

        System.out.println(MaxOf(numOne, numTwo, numThree));

    }

    public static int MaxOf(int a, int b, int c) {

        if (a > b && a > c) return a;
        else if (b > a && b > c) return b;
        else return c;

    }

}