import java.util.Scanner;

public class Check_Armstrong {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int num = sc.nextInt();

        int cpyNum = num, NumberOfDigits = 0, resultantNum = 0;

        while (cpyNum > 0) {

            cpyNum /= 10;

            NumberOfDigits++;

        }

        cpyNum = num;


        // performing while loop
        while (cpyNum > 0) {

            resultantNum += Math.pow((cpyNum % 10), NumberOfDigits);

            cpyNum /= 10;

        }


        System.out.println((resultantNum == num) ? (num + " is a Armstrong number") : (num + " is not a Armstrong number"));

    }
    
}
