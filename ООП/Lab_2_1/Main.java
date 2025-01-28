package com.company;

import java.util.Scanner;
import java.util.function.*;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("1: ");
        int a = in.nextInt();
        System.out.print("2: ");
        int b = in.nextInt();
        System.out.print("3: ");
        int c = in.nextInt();
        Calculate<Integer> sum = (x) -> x[0] + x[1] + x[2];
        int sumResult = sum.calculate(a, b, c);
        Calculate<Integer> multi = (x) -> x[0] * x[1] * x[2];
        int multiResult = multi.calculate(a, b, c);
        UnaryOperator<Integer> fact = (x) -> {
            int result = 1;
            for (int i = 1; i <= x; i++) {
                result *= i;
            }
            return result;
        };
        Predicate<Integer> simpleNumber = (x) -> {
            int dev = 2;
            while (x != dev) {
                if (x % dev == 0) {
                    return false;
                }
                dev++;
            }
            return true;
        };
        System.out.println("Сумма " + a + " + " + b + " + " + c + ": " + sumResult);
        System.out.println("Произведение " + a + " * " + b + " * " + c + ": " + multiResult);
        System.out.println("Факториал числа: " + a + " = " + fact.apply(a));
        System.out.print("Число " + a + " простое(true) или нет(false)?: " + simpleNumber.test(a));
    }
}