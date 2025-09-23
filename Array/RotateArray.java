package Array;

import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int n = 2;

        int len = arr.length;
        for (int i = 0; i < n; i++) {
            int first = arr[0];
            for (int j = 0; j < len - 1; j++) {
                arr[j] = arr[j + 1];
            }
            arr[len - 1] = first;
        }

        System.out.println(Arrays.toString(arr));
    }
}