package com.company;

import javax.swing.*;
import java.awt.*;
import java.util.Comparator;


public class Main {

    public static void main(String[] args) {
        Shape[] arr = new Shape[] {new Circle(), new Circle2(), new Circle3(),
                new Triangle(), new Triangle2(), new Triangle3(),
                new Rectangle(), new Rectangle2(), new Rectangle3()};

        JFrame jFrame = new JFrame("Figure");
        jFrame.setSize(400, 400);
        jFrame.setLocationRelativeTo(null);
        jFrame.setLayout(new GridBagLayout());
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        System.out.println("Площадь первого круга: " + arr[0].calcArea());
        System.out.println("Площадь второго круга: " + arr[1].calcArea());
        System.out.println("Площадь третьего круга: " + arr[2].calcArea());
        int sumCircle = arr[0].calcArea() + arr[1].calcArea() + arr[2].calcArea();
        System.out.println("Площадь всех кругов: " + sumCircle);

        System.out.println("\nПлощадь первого треугольника: " + arr[3].calcArea());
        System.out.println("Площадь второго треугольника: " + arr[4].calcArea());
        System.out.println("Площадь третьего треугольника: " + arr[5].calcArea());
        int sumTriangle = arr[3].calcArea() + arr[4].calcArea() + arr[5].calcArea();
        System.out.println("Площадь всех треугольников: " + sumTriangle);

        System.out.println("\nПлощадь первого прямоугольника: " + arr[6].calcArea());
        System.out.println("Площадь второго прямоугольника: " + arr[7].calcArea());
        System.out.println("Площадь третьего прямоугольника: " + arr[8].calcArea());
        int sumRec = arr[6].calcArea() + arr[7].calcArea() + arr[8].calcArea();
        System.out.println("Площадь всех прямоугольников: " + sumRec);
        int sumAll = sumCircle + sumRec + sumTriangle;
        System.out.println("\nПлощадь всех фигур: " + sumAll);

        GraphicsPanel graphicsPanel = new GraphicsPanel();

        jFrame.add(graphicsPanel, new GridBagConstraints(0, 0, 1, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.BOTH,
                new Insets(2, 2, 2, 2), 0, 0));
        jFrame.setVisible(true);

        Area1 area1 = new Area1();
        Area2 area2 = new Area2();
        Area3 area3 = new Area3();
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

