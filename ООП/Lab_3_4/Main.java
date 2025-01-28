package com.company;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        TV tv1 = new TV("M240", 1999, 500, 12, "Sony");
        TV tv2 = new TV("S530", 2010, 1200, 25, "Samsung");
        TV tv3 = new TV("A202S", 2019, 2000, 28, "Samsung");
        TV tv4 = new TV("Mi 10", 2022, 1500, 26, "Xiaomi");
        TV[] tv = new TV[]{tv1, tv2, tv3, tv4};

        List<TV> list = Arrays.stream(tv)
                .collect(Collectors.toList());
        System.out.println("Список телевизоров: " + list);

        System.out.print("Введите диагональ: ");
        int diagonal = in.nextInt();
        List<TV> diagonalList = Arrays.stream(tv)
                .filter(x -> x.getDiagonal() == diagonal)
                .collect(Collectors.toList());
        System.out.println("Телевизоры с заданной диагональю: " + diagonalList);

        System.out.print("Введите производителя: ");
        String manufacturer = in.next();
        List<TV> manufacturerList = Arrays.stream(tv)
                .filter(x -> x.getManufacturer().equalsIgnoreCase(manufacturer))
                .collect(Collectors.toList());
        System.out.println("Телевизоры с заданной диагональю: " + manufacturerList);

        Calendar calendar = Calendar.getInstance();
        List<TV> thisYearList = Arrays.stream(tv)
                .filter(x -> x.getStartYear() == calendar.get(Calendar.YEAR))
                .collect(Collectors.toList());
        System.out.println("Телевизоры, выпущенные в этом году: " + thisYearList);

        System.out.print("Введите цену: ");
        int price = in.nextInt();
        List<TV> priceList = Arrays.stream(tv)
                .filter(x -> x.getPrice() > price)
                .collect(Collectors.toList());
        System.out.println("Телевизоры дороже заданной цены: " + priceList);

        List<TV> priceUpList = Arrays.stream(tv)
                .sorted(Comparator.comparingInt(TV::getPrice))
                .collect(Collectors.toList());
        System.out.println("Телевизоры, отсортированные по цене по возрастанию: " + priceUpList);

        List<TV> priceDownList = Arrays.stream(tv)
                .sorted(Comparator.comparingInt(TV::getPrice).reversed())
                .collect(Collectors.toList());
        System.out.println("Телевизоры, отсортированные по цене по убыванию: " + priceDownList);

        List<TV> diagonalUpList = Arrays.stream(tv)
                .sorted(Comparator.comparingInt(TV::getDiagonal))
                .collect(Collectors.toList());
        System.out.println("Телевизоры, отсортированные по диагонали по возрастанию: " + diagonalUpList);

        List<TV> diagonalDownList = Arrays.stream(tv)
                .sorted(Comparator.comparingInt(TV::getDiagonal).reversed())
                .collect(Collectors.toList());
        System.out.print("Телевизоры, отсортированные по диагонали по убыванию: " + diagonalDownList);
    }
}