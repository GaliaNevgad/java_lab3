package com.company;

import java.awt.*;
import java.util.Scanner;

public class Triangle extends Shape{
    public final int sideA, sideB, sideC;

    public Triangle(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter side A for triangle");
        sideA = sc.nextInt();
        System.out.println("Enter side B for triangle");
        sideB = sc.nextInt();
        System.out.println("Enter side C for triangle");
        sideC = sc.nextInt();
        System.out.println("Side A " + sideA + " Side B " + sideB + " Side C " + sideC);
    }

    public Triangle(int sideA, int sideB, int sideC){
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    public void draw(){
        System.out.println("Треугольник");
    };

    @Override
    public int calcArea() {
        int sum = (sideA + sideB + sideC) / 2;
        return (int) Math.sqrt(sum * (sum - sideA)*(sum - sideB)*(sum - sideC));
    }

    @Override
    public String toString() {
        return null;
    }

}