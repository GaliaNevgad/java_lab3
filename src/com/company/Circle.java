package com.company;

import java.util.Scanner;

public class Circle extends Shape implements Drawable{
    public final int radius;
    final double PI = Math.PI;

    public Circle(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius");
        radius = sc.nextInt();
    }

    public Circle(int radius){
        this.radius = radius;
    }

    public void draw(){
        System.out.println("Круг");
        /*Graphics ga = (Graphics2D)g;
        ga.setColor(Color.red);
        ga.drawOval(100,100,200,200);
        return;*/
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
