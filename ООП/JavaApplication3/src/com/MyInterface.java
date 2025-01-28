package com;

@FunctionalInterface
public interface MyInterface<T extends Comparable> {
    T equal(T... a);
}
