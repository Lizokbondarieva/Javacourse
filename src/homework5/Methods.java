package homework5;

public class Methods {
    public static void main(String[] args) {
        String text = "Hello";
        int count = 10;
        printLines(text, count);
    }

    public static void printLines(String text, int count) {
        for(int i = 0; i < count; i++) {
            System.out.println(text);
        }
    }

}