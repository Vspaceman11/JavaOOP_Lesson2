package com.java.vladyslavpushkarov.l2task3;

public class Car {
    private int year;
    private double speed;
    private int weight;
    private String color;
    public Car(){
        this(10);
    }

    public Car(int year) {
        this(year, 200.1);
    }

    public Car(int year, double speed) {
        this(year,speed, 100);
    }

    public Car(int year, double speed, int weight) {
        this(year, speed, weight, "Red");
    }

    public Car(int year, double speed, int weight, String color) {
        this.year = year;
        this.speed = speed;
        this.weight = weight;
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public double getSpeed() {
        return speed;
    }

    public int getWeight() {
        return weight;
    }

    public String getColor() {
        return color;
    }
}
