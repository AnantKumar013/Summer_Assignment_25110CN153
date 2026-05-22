

import java.util.Scanner;

public class Find_Digits_in_number {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number: ");
        int num = scanner.nextInt();

        int cpynum = num, digit = 0;

        while (cpynum > 0) {

            cpynum /= 10;
            digit++;

        }

        System.out.println("Number of digits in " + num + " = " + digit);

    }
    

}