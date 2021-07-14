package com.itschool.homework;

public class HomeWork {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task8();
        task9();
        task10();
        task11();
    }

    public static void task1() {
        System.out.println("Task 1:" + System.lineSeparator());
        final double A = -5, B = 7, H = 0.75;

        System.out.printf("%4s%10s%10s%10s\n-----------------------------------\n", "X", "а)", "б)", "в)");
        for (double x = A; x < B; x += H) {
            System.out.printf("%5.2f%10.2f%10.2f%10.2f\n", x, (x - Math.sin(x)), Math.pow(Math.sin(x), 2), 2 * Math.cos(x) - 1);
        }
    }

    public static void task2() {
        System.out.println("Task 2:" + System.lineSeparator());
    }

    public static void task3() {
        System.out.println("Task 3:" + System.lineSeparator());
    }

    public static void task4() {
        System.out.println("Task 4:" + System.lineSeparator());
    }

    public static void task5() {
        System.out.println("Task 5:" + System.lineSeparator());
    }

    public static void task6() {
        System.out.println("Task 6:" + System.lineSeparator());
    }

    public static void task7() {
        System.out.println("Task 7:" + System.lineSeparator());
    }

    public static void task8() {
        System.out.println("Task 8:" + System.lineSeparator());
    }

    public static void task9() {
        System.out.println("Task 9:" + System.lineSeparator());
    }

    public static void task10() {
        System.out.println("Task 10:" + System.lineSeparator());
    }

    public static void task11() {
        System.out.println("Task 11:" + System.lineSeparator());
    }
}
