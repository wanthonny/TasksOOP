package com.company;

@FunctionalInterface
public interface Calculate<T> {
    T calculate(T... x);
}
