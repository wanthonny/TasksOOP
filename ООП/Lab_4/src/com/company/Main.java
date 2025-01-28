package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
	String str = "hello world";
    System.out.println(task1(str));

    List<String> list = new ArrayList<>();
    list.add("Аня");
    list.add("арбуз");
    list.add("аcя");
    System.out.println(task2(list));
    System.out.println(task3(list));
    }

    public static Long task1(String str){
        if(str == null){
        }
        long cnt = str.chars()
                .filter(Character::isLetter)
                .filter(Character::isLowerCase)
                .count();
        return  cnt;
    }

    public static Optional<List<String>> task2(List<String> list){
        List<String> ss = list.stream()
                .filter(x -> x.startsWith("а"))
                .filter(x -> x.length() == 3)
                .collect(Collectors.toList());
        return Optional.of(ss);
    }

    public static Optional<List<String>> task3(List<String> list){
        String list1 = list.stream().map(Object::toString)
                .collect(Collectors.joining(", "));
        if(list == null){
            return Optional.empty();
        }
        List<String> cs = list.stream().map(x-> x.length()==task1(list1.))
                .collect(Collectors.toList());
        return Optional.of(cs);
    }
}
