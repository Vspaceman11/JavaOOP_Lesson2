package com.java.vladyslavpushkarov.l2task3;

public class Main {
    public static void main(String[] args) {
        Car defaultCar = new Car();
        Car CarWithTwoParameters = new Car();
        Car CarWithThreeParameters = new Car();
        Car CarWithFourParameters = new Car();

        System.out.println(defaultCar.getYear());
        System.out.println(defaultCar.getSpeed());
        System.out.println(defaultCar.getWeight());
        System.out.println(defaultCar.getColor());
    }
}
