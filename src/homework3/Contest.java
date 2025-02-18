package homework3;

import java.util.ArrayList;
import java.util.Scanner;

public class Contest {
    String name;
    int age;
    String country;
    String num;

    public Contest(String name, int age, String country, String num) {
        this.name = name;
        this.age = age;
        this.country = country;
        this.num = num;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите возраст участника: ");
        int age = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Введите гражданство участника: ");
        String country = scanner.nextLine();

        System.out.print("Введите номер заявки: ");
        String num = scanner.nextLine();

        System.out.print("Введите фамилию участника: ");
        String name = scanner.nextLine();

        if (age < 18) {
            System.out.println("Участник не допущен");
        } else {
            if (country.equals("Россия") || country.equals("Казахстан")) {
                System.out.println("Участник не допущен");
            } else {
                if (num == null || num.trim().isEmpty()) {
                    System.out.println("Участник не допущен");
                } else {
                    if (name.equals("Путин")) {
                        System.out.println("Участник не допущен");
                    } else {
                        System.out.println("Участник допущен");
                    }

                }
            }

        }
    }
}
