import java.util.Scanner;



public class printArmstrong {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter range: ");
        int range = sc.nextInt();

        for (int i = 0; i <= range; i++) {

            if (IsArmStrong(i)) {

                System.out.print(i + " ");

            }

        }



    }

    public static boolean IsArmStrong(int a) {

        int cpynum = a, numberOfDigits = 0, num = 0;

        while (cpynum > 0) {

            cpynum /= 10;

            numberOfDigits++;


        }

        cpynum = a;

        while (cpynum > 0) {

            num += Math.pow((cpynum % 10), numberOfDigits);

            cpynum /= 10;

        }

        return (num == a);

    }
    
}
