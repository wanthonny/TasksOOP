package com.company;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = IntStream.range(0, 10)
                .map(i -> (int) (Math.random() * 10))
                .toArray();
        System.out.print(Arrays.toString(arr));

        System.out.print("\nВведите целочисленное число: ");
        int a = in.nextInt();
        long even = Arrays.stream(arr)
                .filter(x -> x % 2 == 0).count();
        System.out.println("Кол-во четных чисел: " + even);

        long odd = Arrays.stream(arr)
                .filter(x -> x % 2 != 0).count();
        System.out.println("Кол-во нечетных чисел: " + odd);

        long zero = Arrays.stream(arr)
                .filter(x -> x == 0).count();
        System.out.println("Кол-во чисел равных 0: " + zero);

        long equal = Arrays.stream(arr)
                .filter(x -> x == a).count();
        System.out.print("Кол-во чисел равных " + a + ": " + equal);
    }
}