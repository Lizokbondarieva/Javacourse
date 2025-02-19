package homework5;

import java.util.Arrays;

public class subarray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int[] arr2 = {3, 4, 5};
        boolean a = containsSubarray(arr, arr2);

        if (a) {
            System.out.println("Массив 2 содержится в массиве 1.");
        } else {
            System.out.println("Массив 2 НЕ содержится в массиве 1.");
        }
    }

    public static boolean containsSubarray(int[] arr, int[] arr2) {
        if (arr2.length > arr.length) {
            return false;
        }
        for (int i = 0; i <= arr.length - arr2.length; i++) {
            int[] arr3 = Arrays.copyOfRange(arr, i, i + arr2.length);
            if (Arrays.equals(arr3, arr2)) {
                return true;
            }
        }
        return false;
    }
}

