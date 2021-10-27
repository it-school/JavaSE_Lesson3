package com.itschool.homework;

import java.util.Random;

public class HomeWork {
   public static void main(String[] args) {
      task1();
      task2();
      task3();
      task4();
      task5();
      task6();
      task7();
      task8();
      task9();
      task10();
      task11();
   }

   public static void task1() {
      System.out.println("\nTask 1:" + System.lineSeparator());
      final double A = -5, B = 7, H = 0.75;
      System.out.printf("%4s%10s%10s%10s\n-----------------------------------\n", "X", "а)", "б)", "в)");
      for (double x = A; x <= B; x += H) {
         System.out.printf("%5.2f%10.2f%10.2f%10.2f\n", x, (x - Math.sin(x)), Math.pow(Math.sin(x), 2), 2 * Math.cos(x) - 1);
      }
   }

   public static void task2() {
      System.out.println("\nTask 2: " + System.lineSeparator());
      // todo
   }

   public static void task3() {
      System.out.println("\nTask 3: Дано натуральное число. Верно ли, что цифра а встречается в нем реже, чем\n" +
              "цифра b?" + System.lineSeparator());

      int number = 1232262855, a = 2, b = 5, digits = (int) Math.ceil(Math.log10(number)), mod = 0,
              counterA = 0, counterB = 0;
      int number1 = number;

      System.out.println(digits);
      for (int i = 0; i < digits; i++) {
         System.out.print(" " + (mod = number % 10));
         number /= 10;
         if (mod == a)
            counterA++;
         else if (mod == b)
            counterB++;
      }
      System.out.printf("\n%sВерно, что цифра %d встречается в нем реже, чем цифра %d\n\n", (counterA < counterB ? "" : "НЕ "), a, b);

      counterA = counterB = 0;
      do {
         System.out.print(" " + (mod = number1 % 10));
         if (mod == a)
            counterA++;
         else if (mod == b)
            counterB++;
         number1 /= 10;
      } while (number1 > 0);
      System.out.printf("\n%sВерно, что цифра %d встречается в нем реже, чем цифра %d", (counterA < counterB ? "" : "НЕ "), a, b);
   }

   public static void task4() {
      System.out.println("\nTask 4: Вычислить значение функции" + System.lineSeparator());
      final int I = 20, N = 20;
      Random r = new Random();

      int k, f;
      double x = 0, z = 0, y = 0;

      for (int i = 1; i <= I; i++) {
         y = 0;
         f = 1;
         x = r.nextDouble() * 100;
         for (k = 1; k <= N; k++) {
            f *= k;
            y += Math.pow(x, k) / f;
         }
         z += y;
      }

      System.out.println("Z = " + z);

   }

   public static void task5() {
      System.out.println("\nTask 5: Вычислить значение функции" + System.lineSeparator());
      // todo
   }

   public static void task6() {
      System.out.println("\nTask 6: Составить программу для нахождения всех натуральных решений (х и у)\n" +
              "уравнения х2 + у2 = k2, где х, у и k лежат в интервале от 1 до 30. Решения, которые\n" +
              "получаются, перестановкой х и у, считать совпадающими" + System.lineSeparator());
      final int MAX_VALUE = 100;
      int x, y, k, n = 0;

      for (x = 1; x <= MAX_VALUE; x++) {
         for (y = 1; y <= MAX_VALUE; y++) {
            for (k = 1; k <= MAX_VALUE; k++) {
               n++;
               if (x * x + y * y == k * k)
                  System.out.printf("%3d^2 + %3d^2 = %3d^2\n", x, y, k);
            }
         }
      }
      System.out.println(n);
   }

   public static void task7() {
      System.out.println("\nTask 7: Найти 15 первых натуральных чисел, делящихся нацело на 19 и больших 100" + System.lineSeparator());
      final int DIVIDER = 19, COMPARER = 100;
      int number = COMPARER + 1;
      for (int n = 0; n < 15; ) {
         if (number % DIVIDER == 0) {
            System.out.print(number + " ");
            n++;
         }
         number++;
      }

      System.out.println();
      number = COMPARER + 1;
      int n = 0;
      while (n < 15) {
         if (number % DIVIDER == 0) {
            System.out.print(number + " ");
            n++;
         }
         number++;
      }
   }

   public static void task8() {
      System.out.println("\nTask 8: Найти 20 первых натуральных чисел, делящихся нацело на 13 или на 17 и больших 500" + System.lineSeparator());
      // todo
   }

   public static void task9() {
      System.out.println("\nTask 9: Дана арифметическая прогрессия с параметрами а = 2, b = 4. Сколько нужно\n" +
              "взять членов прогрессии, начиная с первого, чтобы их сумма превысила\n" +
              "заданную величину Z. Написать программу решения задачи. Вывести искомое\n" +
              "число слагаемых, величину суммы и последнее слагаемое" + System.lineSeparator());
      final int Z = 12;
      int n = 1, a = 2, b = 4, number = a;

      do {
         number += b;
         n++;
      } while (number <= Z);
      System.out.println("нужно взять членов прогрессии: " + n);
   }

   public static void task10() {
      System.out.println("\nTask 10: Дана арифметическая прогрессия 1, 5, 9, 13, ... Написать программу\n" +
              "определения суммы первых десяти ее членов. Вывести значение суммы и всех ее\n" +
              "слагаемых" + System.lineSeparator());
      // todo
   }

   public static void task11() {
      System.out.println("\nTask 11: Напишите программы, которые выводят на экран :" + System.lineSeparator());

      System.out.println("\nпрямоугольнник" + System.lineSeparator());
      // todo

      System.out.println("\nпрямоугольный треугольник\n");
      final int N = 10;
      for (int row = 0; row < N; row++) {
         for (int column = 0; column < N - row; column++) {
            System.out.print("* ");
         }
         System.out.println();
      }

      System.out.println("\nравносторонний треугольник" + System.lineSeparator());
      for (int column = 0; column < N; column++) {
         System.out.print(" ");
      }
      System.out.println("*");
      for (int row = 0; row < N; row++) {
         for (int column = 0; column < N - row; column++) {
            System.out.print(" ");
         }
         for (int column = 0; column < (row + 1) * 2; column++) {
            System.out.print("*");
         }
         System.out.println();
      }
      System.out.println("\nромб" + System.lineSeparator());
   }
}