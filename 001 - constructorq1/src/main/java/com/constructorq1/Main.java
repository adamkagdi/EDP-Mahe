package com.constructorq1;
import java.util.Scanner;

class Information{
    public Information(String name, int age, String qualification){
        System.out.println("name: "+name);
        System.out.println("age: "+age);
        System.out.println("qualification: "+qualification);
    }
}
public class Main {
    public static void main(String[] args) {
        System.out.println("The program is starting:");
        System.out.println("What is your name?");
        Scanner s1 = new Scanner(System.in);
        String name = s1.nextLine();
        System.out.println("What is your age?");
        Scanner s2 = new Scanner(System.in);
        int age = s2.nextInt();
        System.out.println("What is your Qualification?");
        Scanner s3 = new Scanner(System.in);
        String qualification = s3.nextLine();
        Information i1 = new Information(name, age, qualification);
    }
}