package com.company;

import java.util.Scanner;

public class Rectangle extends Shape{
    public final double width, height;

    public Rectangle(){
        width = 5;
        height = 6;
    }

    public Rectangle(int width, int height){
        this.width = width;
        this.height = height;
    }

    public void draw(){
        System.out.println("Прямоугольник");
    }

    @Override
    public int calcArea() {
        return (int) (width * height);
    }

    @Override
    public String toString() {
        return null;
    }
}

class Rectangle2 extends Rectangle{
    double width, height;

    public Rectangle2(){
        width = 6;
        height = 7;
    }

    public Rectangle2(double width, double height){
        this.width = width;
        this.height = height;
    }

    @Override
    public int calcArea() {
        return (int) (width * height);
    }
}

class Rectangle3 extends Rectangle{
    double width, height;

    public Rectangle3(){
        width = 7;
        height = 8;
    }

    public Rectangle3(double width, double height){
        this.width = width;
        this.height = height;
    }

    @Override
    public int calcArea() {
        return (int) (width * height);
    }
}