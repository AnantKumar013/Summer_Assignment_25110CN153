
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class printFactorOfNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        System.out.print("Enter number: ");
        int num = sc.nextInt();

        for (int i = 1; i <= Math.sqrt(num); i++) {

            if (num % i == 0) {

                list.add(i);

                if ((num / i) != i) {

                    list.add((num / i));

                }

            }

        }

        Collections.sort(list);
        System.out.println(list);

    }

}
