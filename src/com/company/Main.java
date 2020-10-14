package com.company;

import javax.swing.*;
import java.awt.*;
import java.util.Comparator;


public class Main {

    public static void main(String[] args) {
        Model model = new Model();
        View view = new View();
        Shape[] shapes = new Shape[9];
        view.printArea();
        view.frame();
    }

    public static class Area1 implements Comparator<Shape> {
        public int compare(Shape a, Shape b) {
            if (a.calcArea() > b.calcArea()) return a.calcArea();
            if (a.calcArea() < b.calcArea()) return b.calcArea();
            else return 0;
        }
    }

    public static class Area2 implements Comparator<Shape>{
        public int compare(Shape b, Shape c){
            if(b.calcArea() > c.calcArea()) return b.calcArea();
            if(b.calcArea() < c.calcArea()) return c.calcArea();
            else return 0;
        }
    }

    public static class Area3 implements Comparator<Shape>{
        public int compare(Shape a, Shape c){
            if(a.calcArea() > c.calcArea()) return a.calcArea();
            if(a.calcArea() < c.calcArea()) return c.calcArea();
            else return 0;
        }
    }
}

