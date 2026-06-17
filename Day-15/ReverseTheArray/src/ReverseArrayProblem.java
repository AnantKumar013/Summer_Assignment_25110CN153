

public class ReverseArrayProblem {

    public ReverseArrayProblem() {};

    public int[] reverseArray(int[] arr, int initialPosition, int finalPosition) {

        int i = initialPosition, j = finalPosition;

        while (i < j) {

            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

            i++;
            j--;

        }

        return arr;

    }

}
