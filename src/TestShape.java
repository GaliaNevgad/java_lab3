import com.company.Circle;
import com.company.Rectangle;
import com.company.Triangle;

import java.awt.*;

public class TestShape {
    public static void main(String[] args){
        double width = 5, length = 7;
        Shape rectangle = new Rectangle(width, length);
        System.out.println("Rectangle width: " + width + " and length: " + length
                + "\nResulting area: " + ((Rectangle) rectangle).calcArea());

        double radius = 5;
        Shape circle = new Circle(radius);
        System.out.println("Circle radius: " + radius + "\nResulting Area: " + ((Circle) circle).calcArea());

        double sideA = 5, sideB = 3, sideC = 4;
        Shape triangle = new Triangle(sideA, sideB, sideC);
        System.out.println("Triangle sides lengths: " + sideA + ", " + sideB + ", " + sideC
                + "\nResulting Area: " + ((Triangle) triangle).calcArea());
    }


}
