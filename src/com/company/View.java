package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;

public class View {
    public void frame(){
        JFrame jFrame = new JFrame("Figure");
        jFrame.setSize(400, 400);
        jFrame.setLocationRelativeTo(null);
        jFrame.setLayout(new GridBagLayout());
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        GraphicsPanel graphicsPanel = new GraphicsPanel();

        jFrame.add(graphicsPanel, new GridBagConstraints(0, 0, 1, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.BOTH,
                new Insets(2, 2, 2, 2), 0, 0));
        jFrame.setVisible(true);

        class GraphicsPanel extends JPanel{
            private final RectangleGraphics rectangleGraphics1, rectangleGraphics2, rectangleGraphics3;
            private final CircleGraphics circleGraphics1, circleGraphics2, circleGraphics3;
            private final TriangleGraphics triangleGraphics1, triangleGraphics2, triangleGraphics3;

            public GraphicsPanel(){
                rectangleGraphics1 = new RectangleGraphics(170, 210, 10, 15);
                rectangleGraphics2 = new RectangleGraphics(170, 200, 10, 15);
                rectangleGraphics3 = new RectangleGraphics(170, 200, 10, 15);
                circleGraphics1 = new CircleGraphics(100, 100, 75, 75);
                circleGraphics2 = new CircleGraphics(100, 100, 75, 75);
                circleGraphics3 = new CircleGraphics(100, 100, 75, 75);
                triangleGraphics1 = new TriangleGraphics(150, 150, 78, 2);
                triangleGraphics2 = new TriangleGraphics(150, 150, 78, 2);
                triangleGraphics3 = new TriangleGraphics(150, 150, 78, 2);
            }

            public void paintComponent(Graphics g){
                Graphics g2 = (Graphics2D) g;

                g2.setColor(Color.GREEN);
                g2.drawRect(30, 30, 50, 60);
                g2.drawRect(30, 110, 60, 70);
                g2.drawRect(30, 200, 70, 80);
                g2.setColor(Color.BLUE);
                g2.drawOval(120, 30, 60, 60);
                g2.drawOval(120, 110, 70, 70);
                g2.drawOval(120, 200, 80, 80);
                g2.setColor(Color.red);
                g2.drawLine(220, 90, 260, 20);
                g2.drawLine(260, 20, 300, 90);
                g2.drawLine(220, 90, 300, 90);

                g2.drawLine(220, 190, 260, 100);
                g2.drawLine(260, 100, 300, 190);
                g2.drawLine(220, 190, 300, 190);

                g2.drawLine(220, 280, 260, 200);
                g2.drawLine(260, 200, 300, 280);
                g2.drawLine(220, 280, 300, 280);
            }
        }
    }

    public void printArea(){
        Shape[] arr = new Shape[] {new Model.Circle(), new Model.Circle2(), new Model.Circle3(),
                new Model.Triangle(), new Model.Triangle2(), new Model.Triangle3(),
                new Model.Rectangle(), new Model.Rectangle2(), new Model.Rectangle3()};


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

    }

    public class GraphicsPanel extends JPanel{
        private final RectangleGraphics rectangleGraphics1, rectangleGraphics2, rectangleGraphics3;
        private final CircleGraphics circleGraphics1, circleGraphics2, circleGraphics3;
        private final TriangleGraphics triangleGraphics1, triangleGraphics2, triangleGraphics3;

        public GraphicsPanel(){
            rectangleGraphics1 = new RectangleGraphics(170, 210, 10, 15);
            rectangleGraphics2 = new RectangleGraphics(170, 200, 10, 15);
            rectangleGraphics3 = new RectangleGraphics(170, 200, 10, 15);
            circleGraphics1 = new CircleGraphics(100, 100, 75, 75);
            circleGraphics2 = new CircleGraphics(100, 100, 75, 75);
            circleGraphics3 = new CircleGraphics(100, 100, 75, 75);
            triangleGraphics1 = new TriangleGraphics(150, 150, 78, 2);
            triangleGraphics2 = new TriangleGraphics(150, 150, 78, 2);
            triangleGraphics3 = new TriangleGraphics(150, 150, 78, 2);
        }

        public void paintComponent(Graphics g){
            Graphics g2 = (Graphics2D) g;

            g2.setColor(Color.GREEN);
            g2.drawRect(30, 30, 50, 60);
            g2.drawRect(30, 110, 60, 70);
            g2.drawRect(30, 200, 70, 80);
            g2.setColor(Color.BLUE);
            g2.drawOval(120, 30, 60, 60);
            g2.drawOval(120, 110, 70, 70);
            g2.drawOval(120, 200, 80, 80);
            g2.setColor(Color.red);
            g2.drawLine(220, 90, 260, 20);
            g2.drawLine(260, 20, 300, 90);
            g2.drawLine(220, 90, 300, 90);

            g2.drawLine(220, 190, 260, 100);
            g2.drawLine(260, 100, 300, 190);
            g2.drawLine(220, 190, 300, 190);

            g2.drawLine(220, 280, 260, 200);
            g2.drawLine(260, 200, 300, 280);
            g2.drawLine(220, 280, 300, 280);
        }
    }

    public class Point extends Point2D {

        public double x, y;
        public Point(){

        }

        public Point(double x, double y){
            this.x = x;
            this.y = y;
        }

        @Override
        public double getX() {
            return x;
        }

        @Override
        public double getY() {
            return y;
        }

        @Override
        public void setLocation(double x, double y) {
            this.x = x;
            this.y = y;
        }
    }

    public class RectangleGraphics extends Rectangle2D {

        private final Point point;
        public double width, height;

        public RectangleGraphics(){
            point = new Point();
        }

        public RectangleGraphics(int x, int y, double width, double height){
            point = new Point(x, y);
            this.width = width;
            this.height = height;
        }

        @Override
        public void setRect(double x, double y, double width, double height) {
            point.setLocation(x, y);
            this.width = width;
            this.height = height;
        }

        @Override
        public int outcode(double x, double y) {
            return 0;
        }

        @Override
        public Rectangle2D createIntersection(Rectangle2D r) {
            return null;
        }

        @Override
        public Rectangle2D createUnion(Rectangle2D r) {
            return null;
        }

        @Override
        public double getX() {
            return point.getX();
        }

        @Override
        public double getY() {
            return point.getY();
        }

        @Override
        public double getWidth() {
            return width;
        }

        @Override
        public double getHeight() {
            return height;
        }

        @Override
        public boolean isEmpty() {
            if((width <= 0) || (height <=0)) return false;
            return true;
        }
    }

    public class TriangleGraphics extends Line2D {

        private Point p1;
        private Point p2;

        public TriangleGraphics(){
            p1 = new Point();
            p2 = new Point();
        }

        public TriangleGraphics(double x1, double y1, double x2, double y2) {
            p1 = new Point(x1, y1);
            p2 = new Point(x2, y2);
        }

        @Override
        public double getX1() {
            return p1.getX();
        }

        @Override
        public double getY1() {
            return p1.getY();
        }

        @Override
        public Point2D getP1() {
            return p1;
        }

        @Override
        public Point2D getP2() {
            return p2;
        }
        @Override
        public double getX2() {
            return p2.getX();
        }

        @Override
        public double getY2() {
            return p2.getY();
        }

        @Override
        public void setLine(double x1, double y1, double x2, double y2) {
            p1.setLocation(x1, y2);
            p1.setLocation(x2, y2);
        }

        @Override
        public Rectangle2D getBounds2D() {
            return null;
        }
    }

    public class CircleGraphics extends Ellipse2D {

        private final Point point;
        public double width, height;

        public CircleGraphics(){
            point = new Point();
        }

        public CircleGraphics(int x, int y, double width, double height) {
            point = new Point(x, y);
            this.width = width;
            this.height = height;
        }

        @Override
        public double getX() {
            return point.getX();
        }

        @Override
        public double getY() {
            return point.getY();
        }

        @Override
        public double getWidth() {
            return width;
        }

        @Override
        public double getHeight() {
            return height;
        }

        @Override
        public boolean isEmpty() {
            return false;
        }

        @Override
        public void setFrame(double x, double y, double width, double height) {
            point.setLocation(x, y);
            this.width = width;
            this.height = height;
        }

        @Override
        public Rectangle2D getBounds2D() {
            return null;
        }
    }

    public void Graphics () {
        RectangleGraphics rectangleGraphics1, rectangleGraphics2, rectangleGraphics3;
        CircleGraphics circleGraphics1, circleGraphics2, circleGraphics3;
        TriangleGraphics triangleGraphics1, triangleGraphics2, triangleGraphics3;
    }

}
