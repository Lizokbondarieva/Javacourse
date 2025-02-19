package homework5;

import java.util.Arrays;
import java.util.Random;


public class Permutation {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        shuffle(arr);
        String str = Arrays.toString(arr);
        System.out.println(str);
    }

    public static void shuffle(int[] arr) {
        Random random = new Random();
        for (int i = arr.length - 1; i > 0; i--) {
            int j = random.nextInt(i + 1);
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }
}