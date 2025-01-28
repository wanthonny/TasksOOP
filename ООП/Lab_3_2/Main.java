package com.company;

import java.util.*;
import java.util.stream.*;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] towns = new String[]{"Vitebsk", "Polotsk", "Minsk", "Grodno", "Mogilev", "Pinsk", "Gomel", "Pinsk"};
        List<String> list = Arrays.stream(towns)
                .collect(Collectors.toList());
        System.out.println("Список городов: " + list);

        System.out.print("Введите название города: ");
        String town = in.next();
        List<String> char6 = Arrays.stream(towns)
                .filter(x -> x.length() > 6)
                .collect(Collectors.toList());
        System.out.println("Города, у которых в названии больше 6 букв: " + char6);

        long equal = Arrays.stream(towns)
                .filter(x -> x.equalsIgnoreCase(town))
                .count();
        System.out.println("Кол-во городов с введенным названием: " + equal);

        System.out.print("Введите символ(если введете слово, будет выбрана первая буква): ");
        String a = in.next();
        char c = a.toLowerCase().charAt(0);
        List<String> charEqual = Arrays.stream(towns)
                .filter(x -> x.toLowerCase().charAt(0) == c)
                .collect(Collectors.toList());
        System.out.print("Города, первые символы которых совпадают: " + charEqual);
    }
}
