public class MissingNumberArray {

    public static int missingElementInArray(int[] arr)  {

        int arrSum = 0;

        int sumOfnthNumbers = (arr.length + 1) * (arr.length + 2) / 2;

        for (int n : arr) {

            arrSum += n;

        }

        return sumOfnthNumbers - arrSum;

    }

}
