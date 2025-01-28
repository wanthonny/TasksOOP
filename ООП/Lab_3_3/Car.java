package com.company;

public class Car {
    private String name;
    private int startYear;
    private int price;
    private String color;
    private int engineCapacity;

    public Car(String name, int startYear, int price, String color, int engineCapacity) {
        this.name = name;
        this.startYear = startYear;
        this.price = price;
        this.color = color;
        this.engineCapacity = engineCapacity;
    }

    public String getName() {
        return name;
    }

    public int getStartYear() {
        return startYear;
    }

    public int getPrice() {
        return price;
    }

    public String getColor() {
        return color;
    }

    public int getEngineCapacity() {
        return engineCapacity;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", startYear=" + startYear +
                ", price=" + price +
                ", color='" + color + '\'' +
                ", engineCapacity=" + engineCapacity +
                '}';
    }
}
