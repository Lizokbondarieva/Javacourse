package homework5;

import java.util.Arrays;

public class Practice {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 5, 6, 8, 1, 9, 4, 6, 19, -30};
        int[] arr1 = new int[10];
//        System.out.println(Arrays.toString(sortArray(arr)));
        fillArray(arr1);
//        System.out.println(Arrays.toString(arr1));
//        System.out.println(Arrays.toString(copyArray(arr)));
//        checkEquals(arr, arr1);
        System.out.println(searchElement(arr, 19));
    }

    public static int[] sortArray(int[] arr) {
        return sortArray(arr);
    }

    public static void fillArray(int[] arr) {
        Arrays.fill(arr, 5);
    }

    public static int[] copyArray(int[] src) {
        return Arrays.copyOf(src, 5);
    }

    public static void checkEquals(int[] arr1, int[] arr2) {
        if (Arrays.equals(arr1, arr2)) {
            System.out.println("Массивы равны.");
        } else {
            System.out.println("Массивы не равны.");
        }
    }

    public static boolean checkEqualsWithTF(int[] arr1, int[] arr2) {
        if (Arrays.equals(arr1, arr2)) {
            System.out.println("Массивы равны.");
            return true;
        } else {
            System.out.println("Массивы не равны.");
            return false;
        }
    }

    public static int searchElement(int[] arr, int target) {
        return Arrays.binarySearch(arr, target);
    }
}
