import java.util.Scanner;

public class FrequencyOfElement {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        

    }

    public static int FrequencyofElements(int[] nums) {

        byte[] freq = new byte[101];

        byte max = 0, res = 0;

        for (int n : nums) {

            byte f = ++freq[n];

            if (f > max) {

                max = f; res = f;

            } else if (f == max) {

                res += f;

            }

        }

        return res;
        
    }

}
