public class Main {
    public static void main(String[] args) {
        // Домашнее задание 1
        System.out.println("Домашнее задание 1");
// Задание 1
        System.out.println("Задание 1");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
        // Задание 2
        System.out.println("Задание 2");
        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
        }

        // Задание 3
        System.out.println("Задание 3");
        for (int i = 0; i <= 17; i = i + 2) {
            System.out.println(i);

        }
// Задание 4
        System.out.println("Задание 4");
        for (int i = 10; i >= -10; i--) {
            System.out.println(i);
        }

        // Домашнее задание 2
        System.out.println("Домашнее задание 2");

        // Задание 1
        System.out.println("Задание 1");
        for (int i = 1904; i <= 2096; i = i + 4) {
            System.out.println(i + " год является високосным ");
        }

        // Задание 2
        System.out.println("Задание 2");
        for (int i = 7; i <= 98; i = i += 7) {
            System.out.println(i);

        }

        // Задание 3
        System.out.println("Задание 3");
        for (int i = 1; i <= 512; i = i *= 2) {
            System.out.println(i);
        }

        // Домашнее задание 3
        System.out.println("Домашнее задание 3");

        // Задание 1
        System.out.println("Задание 1");

        int deposit = 29000;
        int sum = 0;
        for (int i = 1; i <= 12; i++) {
            sum += deposit;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + sum + " рублей");
        }
        // Задание 2
        System.out.println("Задание 2");
        double sumWithPercent = 0;
        double Percent = 0.01;
        for (int i = 1; i <= 12; i++) {
            sumWithPercent = (sumWithPercent + deposit) * (1 + Percent);
            System.out.println("Месяц " + i + ", сумма накоплений равна " + sumWithPercent + " рублей");
        }

    }
}