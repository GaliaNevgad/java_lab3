package com.company;

import java.awt.*;
import java.awt.Graphics;
import com.company.Circle;

public class Main {

    public static void main(String[] args) {

        Shape[] arr = new Shape[] {new Circle(), new Triangle(), new Rectangle()};

        for(int i = 0; i < arr.length; i++){
            arr[0].draw(null);
            /*System.out.println("Круг");
            Graphics2D ga = (Graphics2D) g;
            ga.setPaint(Color.red);
            ga.drawOval(150,150,10,10);*/
            /*arr[0].draw();
            for (i = 2; i < 5; i++){
                for (int j = -5; j < 5; j++){
                    System.out.print("+");
                }
                System.out.println("*");
            }
            arr[1].draw();
            for ( i = 1; i <= 5; ++i){

                for (int j = 5; j > i; --j)
                    System.out.print(" ");

                for (int j = 1; j < 2 * i; ++j)
                    System.out.print("*");

                System.out.println();
            }
            arr[2].draw();
            for (i = 2; i < 5; i++){
                for (int j = -5; j < 5; j++){
                    System.out.print("+");
                }
                System.out.println("*");
            }*/

        }

        for(int i = 0; i < arr.length; i++){
            System.out.println("Площадь: " + arr[i].calcArea());
        }

    }
}

