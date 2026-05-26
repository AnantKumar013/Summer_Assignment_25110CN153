import java.util.Scanner;

public class CountSetBit {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int num = sc.nextInt();

        // NAIVE APPROACH

        int temp = num, count = 0;

        while (temp > 0)  {

            count += (temp & 1);
             
            temp >>= 1;

        }


        // Brian karnighens algo

        temp = num;
        count = 0;

        while (temp > 0) {

            temp = temp & (temp - 1);

            count++;

        }

        System.out.println("Number of set bits in " + num  + " = " + count);

    }
    
}
