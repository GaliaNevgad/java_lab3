package com.company;

import javax.swing.*;
import javax.xml.transform.Source;
import java.awt.*;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) {
        Shape[] arr = new Shape[] {new Circle(), new Triangle(), new Rectangle()};

        JFrame jFrame = new JFrame("Figure");
        jFrame.setSize(400, 400);
        jFrame.setLocationRelativeTo(null);
        jFrame.setLayout(new GridBagLayout());
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        System.out.println("Площадь круга: " + arr[0].calcArea());
        System.out.println("Площадь треугольника: " + arr[1].calcArea());
        System.out.println("Площадь прямоугольника: " + arr[2].calcArea());

        GraphicsPanel graphicsPanel = new GraphicsPanel();

        jFrame.add(graphicsPanel, new GridBagConstraints(0, 0, 1, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.BOTH,
                new Insets(2, 2, 2, 2), 0, 0));
        jFrame.setVisible(true);

        Area1 area1 = new Area1();
        Area2 area2 = new Area2();
        Area3 area3 = new Area3();
        //System.out.println(area1);
        //System.out.println(area2);
        //System.out.println(area3);
    }

    public static class Area1 implements Comparator<Shape> {
        public int compare(Shape a, Shape b) {
            if (a.calcArea() > b.calcArea()) return a.calcArea();
            if (a.calcArea() < b.calcArea()) return b.calcArea();
            else return 0;
            //return a.calcArea() - b.calcArea();
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

