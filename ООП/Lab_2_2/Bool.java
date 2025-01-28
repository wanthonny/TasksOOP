package com.company;

import java.util.function.Predicate;

public class Bool {
    public static double bool(double[] a, Predicate<Double> lm) {
        double sum = 0;
        for (double v : a)
            if (lm.test(v)) {
                sum += v;
            }
        return sum;
    }
}