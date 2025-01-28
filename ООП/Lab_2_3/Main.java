package com.company;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;

public class Main {

    public static void main(String[] args) {
        Person max = new Person("Max", 19);
        Person pasha = new Person("Pasha", 18);
        Person vitalya = new Person("Vitalya", 22);
        Person tema = new Person("Tema", 20);

        BinaryOperator<Person> older = (person1, person2) -> {
            if (person1.getAge() > person2.getAge()) {
                return person1;
            } else if (person1.getAge() < person2.getAge()) {
                return person2;
            } else {
                return null;
            }
        };

        Person p1 = older.apply(max, pasha);
        System.out.println(p1);

        BinaryOperator<Person> yonger = (person1, person2) -> {
            if (person1.getAge() < person2.getAge()) {
                return person1;
            } else if (person1.getAge() > person2.getAge()) {
                return person2;
            } else {
                return null;
            }
        };

        Person p2 = yonger.apply(vitalya, tema);
        System.out.println(p2);

        MyInterface<Person> olderV2 = (person) -> {
            Person result = person[0];
            for (Person value : person) {
                if (value.getAge() > result.getAge()) {
                    result = value;
                }
            }
            return result;
        };

        Person p3 = olderV2.equal(max, pasha, vitalya, tema);
        System.out.println(p3);

        MyInterface<Person> yongerV2 = (person) -> {
            Person result = person[0];
            for (Person value : person) {
                if (value.getAge() < result.getAge()) {
                    result = value;
                }
            }
            return result;
        };
        Person p4 = yongerV2.equal(max, pasha, vitalya, tema);
        System.out.println(p4);
    }
}
