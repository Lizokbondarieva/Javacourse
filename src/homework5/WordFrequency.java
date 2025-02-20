package homework5;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class WordFrequency {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите текст:");
        String text = scanner.nextLine();
        text = text.toLowerCase();
        String[] words = text.split("\\W+");
        Map<String, Integer> arr = new HashMap<>();

        for (String word : words) {
            if (word.isEmpty()) {
                continue;
            }
            arr.put(word, arr.getOrDefault(word, 0) + 1);
        }

        for (Map.Entry<String, Integer> entry : arr.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
