package homework5;

import java.util.Arrays;

public class Duplicate {
    public static void main(String[] args) {
        int[] arr = {4, 2, 2, 8, 4, 6, 8, 1};
        Arrays.sort(arr);
        int[] arr2 = Arrays.copyOf(arr, 8);
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i == 0 || arr[i] != arr[i - 1]) {
                arr2[j] = arr[i];
                j++;
            }
        }
        int[] arr3 = Arrays.copyOf(arr2, j);
        String str1 = Arrays.toString(arr3);
        System.out.println(str1);
    }
}





