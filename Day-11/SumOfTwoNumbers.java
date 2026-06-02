import java.util.Scanner;


public class SumOfTwoNumbers {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int firstNumber = sc.nextInt();

        System.out.print("Enter second number: ");
        int secondNumber = sc.nextInt();

        System.out.println(firstNumber +  " + " +  secondNumber + " = " + sum(firstNumber, secondNumber));


        
    }

    public static int sum(int a, int b) {

        return (a + b);

    }
    
}
