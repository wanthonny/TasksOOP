package com.company;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Car car1 = new Car("BMW", 2000, 5000, "Black", 1000);
        Car car2 = new Car("Bugatti", 2015, 1000000, "White", 2000);
        Car car3 = new Car("Lamborgini", 2011, 500000, "Yellow", 1800);
        Car car4 = new Car("Ford", 2010, 200000, "Blue", 1500);
        Car[] cars = new Car[]{car1, car2, car3, car4};

        List<Car> list = Arrays.stream(cars)
                .collect(Collectors.toList());
        System.out.println("Список автомобилей" + list);

        System.out.print("Введите цвет: ");
        String color = in.next();
        List<Car> colorList = Arrays.stream(cars)
                .filter(x -> x.getColor().equalsIgnoreCase(color))
                .collect(Collectors.toList());
        System.out.println("Автомобили с таким цветом: " + colorList);

        System.out.print("Введите объем двигателя: ");
        int engineCapacity = in.nextInt();
        List<Car> engineCapacityList = Arrays.stream(cars)
                .filter(x -> x.getEngineCapacity() == engineCapacity)
                .collect(Collectors.toList());
        System.out.println("Автомобили с таким объемом двигателя: " + engineCapacityList);

        System.out.print("Введите цену: ");
        int price = in.nextInt();
        List<Car> priceList = Arrays.stream(cars)
                .filter(x -> x.getPrice() > price)
                .collect(Collectors.toList());
        System.out.println("Автомобили дороже заданной цены: " + priceList);

        System.out.println("Введите диапозон года выпуска: ");
        System.out.print("Begin: ");
        int bg = in.nextInt();
        System.out.print("End: ");
        int end = in.nextInt();
        List<Car> startYearList = Arrays.stream(cars)
                .filter(x -> x.getStartYear() >= bg && x.getStartYear() <= end)
                .collect(Collectors.toList());
        System.out.println("Автомобили, годы выпуска которых находятся на заданом диапозоне: " + startYearList);
    }
}
