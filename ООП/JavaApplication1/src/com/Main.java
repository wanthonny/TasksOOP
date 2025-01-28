package com;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner f = new Scanner(System.in);
        int a,b,c;
        System.out.println("введите первое число (факториала)");
        a = f.nextInt();
        System.out.println("введите второе число(простое?)");
        b = f.nextInt();
        System.out.println("введите третье число");
        c = f.nextInt();
        Operationable<Integer> operation1, operation2, operation3;
        Operationable<Boolean> operation4;
        operation1 = (z)->z[0] + z[1] + z[2];
        operation2 = (z)->z[0] * z[1] * z[2];
        operation3 = (z)->{
            int d = z[0];
            while(z[0]>1){
                d *= (z[0]-1);
                z[0]--;
        }
            return d;};
        operation4 = (z)->{
            boolean is = true;
            for(int i = 2; i<z[0]; i++){
                if(z[0]/i*i == z[0]){
                is = false;
                break;}
            }
            return is;
        };
        int result = operation1.calculate(a, b, c);
        int result2 = operation2.calculate(a, b, c);
        int result3 = operation3.calculate(a);
        boolean result4 = operation4.calculate(b);
        System.out.println("сумма - " + result);
        System.out.println("произведение - " + result2);
        System.out.println("факториал "+a+" - " + result3);
        System.out.println("число "+b+" простое? - " + result4);
    }
}
@FunctionalInterface
interface Operationable<T>{
T calculate(int...z);
}
