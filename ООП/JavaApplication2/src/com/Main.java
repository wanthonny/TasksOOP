package com;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner f = new Scanner(System.in);
        int[] arr = new int[]{1,2,3,8,4,2,4,3};
        Operation par, npar, range, multiple;
        par = (x)->{
            int sum1 = 0;
            for(int i = 0; i < x[0].length; i++){
                if(x[0][i] % 2 == 0){
                    sum1 += x[0][i];
                }
            }
            return sum1;
        };
        npar = (x)->{
            int sum2 = 0;
            for(int i = 0; i < x[0].length; i++){
                if(x[0][i] % 2 == 0){
                    continue;
                }
                sum2 += x[0][i];
            }
            return sum2;
        };
        range = (x)->{
            int sum3 = 0;
            for(int i = 0; i < x[2].length; i++){
                if(x[0][0]<=x[2][i] && x[2][i]<=x[1][0]){
                sum3 +=x[2][i];
                }
            }
            return sum3;
        };
        multiple = (x)->{
            int sum4 = 0;
            for(int i = 0; i < x[1].length; i++){
                if(x[1][i] % x[0][0] == 0){
                    sum4 += x[1][i];
                }
            }
            return sum4;
        };
        System.out.println("введите диапозон от (+кратное) ");
        int[] a = new int[1];
        a[0] = f.nextInt();
        System.out.println(" до ");
        int[] b = new int[1];
        b[0] = f.nextInt();
        System.out.println("сумма чётных элементов - "+Bool.bool(arr,par));
//        System.out.println("сумма чётных элементов - "+par.Sum(arr));
//        System.out.println("сумма нечётных элементов - "+npar.Sum(arr));
//        System.out.println("сумма элементов от "+a[0]+" до "+b[0]+" - "+range.Sum(a,b,arr));
//        System.out.println("сумма элементов кратных "+a[0]+" - "+multiple.Sum(a,arr));

    }
    
}
interface Operation{
    int Sum(int[]...x);
}