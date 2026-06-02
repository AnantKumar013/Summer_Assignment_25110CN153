import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        Armstrong armstrong = new Armstrong();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number: ");
        int num = sc.nextInt();

        System.out.println((armstrong.isArmstrong(num) == true) ? num + " is a armstrong number" : num + " is not a armstrong number");

    }
}
