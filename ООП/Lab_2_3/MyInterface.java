package com.company;

import java.util.function.*;
@FunctionalInterface
public interface MyInterface<T extends Comparable> {
    T equal(T... a);
}

