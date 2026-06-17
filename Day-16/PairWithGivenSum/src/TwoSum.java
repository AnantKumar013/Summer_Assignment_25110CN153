
import java.util.Arrays;

public class TwoSum {
    
    public int[] twoSum(int[] arr, int targetSum) {

        Arrays.sort(arr);

        int i = 0, j = arr.length - 1;

        while (i < j) {

            if (arr[i] + arr[j] == targetSum) {

                return new int[] {i, j};

            } else if (arr[i] + arr[j] > targetSum) {

                j--;

            } else {

                i++;

            }

        }

        return new int[] {};

    }

}
