package com.itschool.classwork;

public class ClassWork {
   public static void main(String[] args) {
      System.out.println("ClassWork:" + System.lineSeparator());
      task1();
      task2();
      task3();
      task4();
      task5();
   }

   public static void task1() {

   }

   public static void task2() {

   }

   public static void task3() {

   }

   public static void task4() {
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

   }
}
