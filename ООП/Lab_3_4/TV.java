package com.company;

public class TV {
    private String name;
    private int startYear;
    private int price;
    private int diagonal;
    private String manufacturer;

    public TV(String name, int startYear, int price, int diagonal, String manufacturer) {
        this.name = name;
        this.startYear = startYear;
        this.price = price;
        this.diagonal = diagonal;
        this.manufacturer = manufacturer;
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

    public int getDiagonal() {
        return diagonal;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    @Override
    public String toString() {
        return "TV{" +
                "name='" + name + '\'' +
                ", startYear=" + startYear +
                ", price=" + price +
                ", diagonal=" + diagonal +
                ", manufacturer='" + manufacturer + '\'' +
                '}';
    }
}
