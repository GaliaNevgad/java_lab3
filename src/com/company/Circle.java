package com.company;

import java.util.Scanner;

public class Circle extends Shape implements Drawable{
    public final int radius;
    final double PI = Math.PI;

    public Circle(){
        radius = 5;
    }

    public Circle(int radius){
        this.radius = radius;
    }

    public void draw(){
        System.out.println("Круг");
    };

    @Override
    public int calcArea() {
        return (int) Math.round(PI * Math.pow(radius, 2));
    }

    @Override
    public String toString() {
        return "Square: " + radius;
    }

}

class Circle2 extends Circle{
    int radius;
    final double PI = Math.PI;

    public Circle2(){
        radius = 6;
    }

    public  Circle2(int radius){
        this.radius = radius;
    }

    @Override
    public int calcArea() {
        return (int) Math.round(PI * Math.pow(radius, 2));
    }
}

class Circle3 extends Circle{
    int radius;
    final double PI = Math.PI;

    public Circle3(){
        radius = 7;
    }

    public  Circle3(int radius){
        this.radius = radius;
    }

    @Override
    public int calcArea() {
        return (int) Math.round(PI * Math.pow(radius, 2));
    }
}
