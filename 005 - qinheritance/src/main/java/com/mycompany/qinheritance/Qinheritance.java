/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.qinheritance;

/**
 *
 * @author adamhuzefa
 */

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


public class Qinheritance {

    public static void main(String[] args) {
        MercedesEQS580 c1 = new MercedesEQS580();
        System.out.println(c1.fullname);
                
    }
}
