

public class SelectionSort {

    public static int[] sort(int[] arr) {

        for (int i = 0; i < arr.length; i++) {

            int minIndex = i;

            for (int j = i + 1; j < arr.length; j++) {

                if (arr[minIndex] > arr[j]) {

                    minIndex = j;

                }

            }

            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;

        }

        return arr;

    }

}
