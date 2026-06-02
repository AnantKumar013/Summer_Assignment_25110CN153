import java.util.Scanner;



public class FindXToPowerN {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int num = sc.nextInt();
        
        System.out.print("Enter Power: ");
        int pow = sc.nextInt();

        int val = 1;

        for (int i = 1; i <= pow; i++) {

            val *= num;

        }

        System.out.println(num + " ^ " + pow + " = " + val);



    }
    
}
