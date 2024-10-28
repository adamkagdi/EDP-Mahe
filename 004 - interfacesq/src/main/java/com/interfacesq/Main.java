package com.interfacesq;

interface FerrariCar{
    int horsepower = 1800;
    String name = "Ferrari Car";
    int seats = 2;
}

interface MercedesCar{
    int horsepower = 1500;
    String name = "Mercedes Car";
    int seats = 4;
}

class MercedesEQS580 implements MercedesCar{
    String fullname = "Mercedes EQS 580";
    int price = 100000;
}

class Ferrari550 implements FerrariCar{
    String fullname = "Ferrari 550 Barchetta Pininfarina";
    int price = 150000;
}

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}