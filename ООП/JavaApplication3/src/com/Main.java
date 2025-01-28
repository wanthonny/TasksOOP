package com;

import java.beans.Expression;

public class Main {

    public static void main(String[] args) {
        Person max = new Person("Max", 19);
        Person pasha = new Person("Pasha", 18);
        Person vitalya = new Person("Vitalya", 22);

        MyInterface<Person> older = (person) -> {
            if (person[0].compareTo(person[1]) < 0) {
                return person[1];
            } else if (person[0].compareTo(person[1]) > 0) {
                return person[0];
            } else {
                return null;
            }
        };

        Person p1 = older.equal(max, pasha);
        System.out.println(p1);

        MyInterface<Person> yonger = (person) -> {
            if (person[0].compareTo(person[1]) < 0) {
                return person[0];
            } else if (person[0].compareTo(person[1]) > 0) {
                return person[1];
            } else {
                return null;
            }
        };

        Person p2 = yonger.equal(vitalya, pasha);
        System.out.println(p2);

        MyInterface<Person> olderV2 = (person) -> Person.older(person);

        Person p3 = olderV2.equal(max, pasha, vitalya);
        System.out.println(p3);

        MyInterface<Person> yongerV2 = (person) -> Person.yonger(person);
        Person p4 = yongerV2.equal(max, pasha, vitalya);
        System.out.println(p4);
    }
}
