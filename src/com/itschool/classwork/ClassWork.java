package com.itschool.classwork;

import java.util.Scanner;

public class ClassWork {
   private static final Scanner scanner = new Scanner(System.in);

   public static void main(String[] args) {
      System.out.println("ClassWork:" + System.lineSeparator());
      task1();
      task2();
      task3();
      task4();
      task5();
   }

   public static void task1() {
      System.out.println("\nTask 1:\n");
      int a = 12345679;
      for (int i = 9; i <= 81; i += 9) {
         System.out.println(a + " x " + i + " = " + a * i);
      }
   }

   public static void task2() {
      System.out.println("\nTask 2:\n");
      for (int i = 1; i <= 10; i++) {
         System.out.println(i + " x " + 7 + " = " + i * 7);
      }
   }

   public static void task3() {
      System.out.println("\nTask 3:\n");
      for (int i = 2; i <= 20; i++) {
         System.out.println("sin(" + i + ") = " + String.format("%5.3f", Math.sin(i)));
      }
   }

   public static void task4() {
      System.out.println("\nTask4 :\n");
      int k = 3, sign = -1;
      double x = Math.random() * 10, result = x, chislitel, znamenatel = 1, drob = x;
      while (k <= 13) {
         chislitel = Math.pow(x, k);

         znamenatel = znamenatel * (k - 1) * k;
         /*
            znamenatel = 1;
            for (int i = 2; i <= k; i++) {
               znamenatel*=i;
            }
         */

         drob = chislitel / znamenatel;

         result = result + sign * drob;
         sign *= -1;

         k = k + 2;
      }

      System.out.printf("x = %.4f, result = %.4f\n", x, result);
      System.out.println("x = " + String.format("%.4f", x) + ", result = " + String.format("%.4f", result));
   }

   public static void task5() {
      System.out.println("\nTask5 :\na)");
      double a = -1, b = 1, h = 0.1, result;

      for (double x = a; x < b; x += h) {
         if (Math.cos(x) != 0) {
            result = Math.tan(x);
            System.out.printf("\n F(%.2f) = %.3f", x, result);
         } else {
            System.out.printf("\n F(%.2f) = no solutions", x);
         }
      }

      a = -1;
      b = 1;
      h = 0.1;

      System.out.println("\nb)\n");
      for (double x = a; x < b; x += h) {
         if (Math.sin(x) != 0) {
            result = 1 / Math.tan(x) + 1;
            System.out.printf("\n F(%.1f) = %.3f", x, result);
         } else {
            System.out.printf("\n F(%.1f) = no solutions", x);
         }
      }
   }
}