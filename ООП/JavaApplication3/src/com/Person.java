package com;

public class Person implements Comparable<Person> {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    @Override
    public int compareTo(Person o) {
        if (this.getAge() > o.getAge()) {
            return 1;
        } else if (this.getAge() < o.getAge()) {
            return -1;
        }
        return 0;
    }

    public static Person older(Person... a) {
        Person result = a[0];
        for (int i = 0; i < a.length; i++) {
            if (a[i].getAge() > result.getAge()) {
                result = a[i];
            }
        }
        return result;
    }

    public static Person yonger(Person... a) {
        Person result = a[0];
        for (int i = 0; i < a.length; i++) {
            if (a[i].getAge() < result.getAge()) {
                result = a[i];
            }
        }
        return result;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}