

import java.util.Arrays;

public class ArraySort {
    public static void main(String[] args) {
        int[] arr = {9,7,8,15,3,2};
        System.out.println("Original array: "+ Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println("Ascending array: "+ Arrays.toString(arr));
    }
}
