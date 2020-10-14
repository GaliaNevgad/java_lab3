package com.company;

import java.awt.*;
import java.util.Scanner;

public class Triangle extends Shape{
    public final int sideA, sideB, sideC;

    public Triangle(){
        sideA = 3;
        sideB = 4;
        sideC = 5;
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

class Triangle2 extends Triangle{
    int sideA, sideB, sideC;

    public Triangle2(){
        sideA = 6;
        sideB = 6;
        sideC = 6;
    }

    public Triangle2(int sideA, int sideB, int sideC){
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    @Override
    public int calcArea() {
        int sum = (sideA + sideB + sideC) / 2;
        return (int) Math.sqrt(sum * (sum - sideA)*(sum - sideB)*(sum - sideC));
    }
}

class Triangle3 extends Triangle{
    int sideA, sideB, sideC;

    public Triangle3(){
        sideA = 12;
        sideB = 16;
        sideC = 20;
    }

    public Triangle3(int sideA, int sideB, int sideC){
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    @Override
    public int calcArea() {
        int sum = (sideA + sideB + sideC) / 2;
        return (int) Math.sqrt(sum * (sum - sideA)*(sum - sideB)*(sum - sideC));
    }
}
