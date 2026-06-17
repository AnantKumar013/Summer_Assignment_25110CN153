import java.util.Scanner;

public class SecondLargest {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        

    }

    public static int findSecondLargestElement(int[] arr) {

        int largestNumber = Integer.MIN_VALUE, secondLargestNumber = Integer.MIN_VALUE;

        for (int n : arr) {

            if (n > largestNumber) {

                secondLargestNumber = largestNumber;
                largestNumber = n;

            } else if (n > secondLargestNumber && n != largestNumber) {

                secondLargestNumber = n;

            }

        }

        return secondLargestNumber;

    }

}
