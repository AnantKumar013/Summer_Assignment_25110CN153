package Day-15.ReverseArrayProblem;
import java.util.Arrays;
import java.util.Scanner;

public class RotateLeft {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter array size: ");
        int[] arr = new int[sc.nextInt()];

        for (int i = 0; i < arr.length; i++) {

            arr[i] = i + 1;

        }

        System.out.print("Enter rotating position: ");
        int rotatingPosition = sc.nextInt();

        System.out.println(Arrays.toString(rotateArray(arr, rotatingPosition)));



    }

    public static int[] rotateArray(int[] arr, int rotatingPosition) {

        ReverseArrayProblem reverse = new ReverseArrayProblem();

        reverse.reverseArray(arr, 0, rotatingPosition - 1);
        reverse.reverseArray(arr,rotatingPosition , arr.length - 1);
        reverse.reverseArray(arr, 0, arr.length - 1);

        return arr;

    }

}
