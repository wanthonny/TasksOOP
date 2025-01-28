package com.company;

import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

public class Main {

    public static void main(String[] args) {
        int[][] arr = new int[][]{
                {9, 10, 11, 12},
                {5, 6, 7, 8},
                {1, 2, 3, 4}
        };


        AtomicInteger p = new AtomicInteger();
        for (int j = 0; j < arr[0].length; j++) {
            int fin = j;

            Runnable r = () -> {
                boolean isSorted = false;
                while (!isSorted) {
                    isSorted = true;
                    for (int k = 1; k < arr.length; k++) {
                        if (arr[k][fin] < arr[k - 1][fin]) {
                            int temp = arr[k][fin];
                            arr[k][fin] = arr[k - 1][fin];
                            arr[k - 1][fin] = temp;
                            isSorted = false;
                            p.getAndIncrement();
                        }
                    }
                }
            };

            Thread t = new Thread(r);
            t.start();

            for (int[] row : arr) {
                for (int elem : row) {
                    System.out.print(elem + "\t");
                }
                System.out.println();
            }
            System.out.println();
        }

        Scanner sc = new Scanner(System.in);
        String l = sc.nextLine();

        for (int[] row : arr) {
            for (int elem : row) {
                System.out.print(elem + "\t");
            }
            System.out.println();
        }
        System.out.println("p = " + p);
    }
}