package com.company;

import java.util.Scanner;

public class Rectangle extends Shape{
    public final double width, height;

    public Rectangle(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter width for rectangle");
        width = sc.nextInt();
        System.out.println("Enter length for rectangle");
        height = sc.nextInt();
        //System.out.println("Width " + width + " Length " + length);
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
