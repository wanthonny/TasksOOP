package com.company;

import java.util.Scanner;
import java.util.function.Predicate;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double[] a = new double[]{3, 7, 2, 8, 10, 3};
        Predicate<Double> lambda = a1 -> a1 % 2 == 0;
        System.out.println("Сумма четных чисел: " + Bool.bool(a, lambda));
        lambda = a1 -> a1 % 2 != 0;
        System.out.println("Сумма нечетных чисел: " + Bool.bool(a, lambda) + "\nЗадайте диапозон: ");
        System.out.print("A: ");
        double bg = in.nextDouble();
        System.out.print("B: ");
        double end = in.nextDouble();
        lambda = a1 -> bg <= a1 && end >= a1;
        System.out.print("Сумма чисел, входящих в диапозон от " + bg + " до " + end + ": " + Bool.bool(a, lambda) + "\nЗадайте делитель: ");
        double dev = in.nextDouble();
        lambda = a1 -> a1 % dev == 0;
        System.out.println("Сумма чисел, кратных числу " + dev + ": " + Bool.bool(a, lambda));
    }
}