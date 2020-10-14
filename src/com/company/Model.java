package com.company;

public class Model {

    interface Drawable{
        void draw();
    }

    public abstract class Shape implements Drawable {
        String shapeColor;

        public abstract int calcArea();
        public abstract String toString();
    }

    static class Rectangle extends com.company.Shape {
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
            System.out.println("The first rectangle");
        }

        @Override
        public int calcArea() {
            return (int) (width * height);
        }

        @Override
        public String toString() {
            return "Square of the first rectangle: " + (int) (width * height);
        }
    }

    static class Rectangle2 extends com.company.Shape  {
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

        @Override
        public String toString() {
            return "Square of the second rectangle: " + (int) (width * height);        }

        @Override
        public void draw() {
            System.out.println("The second rectangle");
        }
    }

    static class Rectangle3 extends com.company.Shape  {
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

        @Override
        public String toString() {
            return "Square of the third rectangle: " + (int) (width * height);        }

        @Override
        public void draw() {
            System.out.println("The third rectangle");
        }
    }

    public static class Triangle extends com.company.Shape {
        public final int sideA, sideB, sideC;

        public Triangle(){
            sideA = 3;
            sideB = 4;
            sideC = 5;
        }

        public Triangle(int sideA, int sideB, int sideC){
            this.sideA = sideA;
            this.sideB = sideB;
            this.sideC = sideC;
        }

        public void draw(){
            System.out.println("The first triangle");
        };

        @Override
        public int calcArea() {
            int sum = (sideA + sideB + sideC) / 2;
            return (int) Math.sqrt(sum * (sum - sideA)*(sum - sideB)*(sum - sideC));
        }

        @Override
        public String toString() {
            int sum = (sideA + sideB + sideC) / 2;
            return "Square of the first triangle: " + (int) Math.sqrt(sum * (sum - sideA)*(sum - sideB)*(sum - sideC));        }
    }

    static class Triangle2 extends com.company.Shape {
        int sideA, sideB, sideC;

        public Triangle2(){
            sideA = 6;
            sideB = 6;
            sideC = 6;
        }

        public Triangle2(int sideA, int sideB, int sideC){
            this.sideA = sideA;
            this.sideB = sideB;
            this.sideC = sideC;
        }

        @Override
        public int calcArea() {
            int sum = (sideA + sideB + sideC) / 2;
            return (int) Math.sqrt(sum * (sum - sideA)*(sum - sideB)*(sum - sideC));
        }

        @Override
        public String toString() {
            int sum = (sideA + sideB + sideC) / 2;
            return "Square of the second triangle: " + (int) Math.sqrt(sum * (sum - sideA)*(sum - sideB)*(sum - sideC));            }

        @Override
        public void draw() {
            System.out.println("The second triangle");
        }
    }

    static class Triangle3 extends com.company.Shape {
        int sideA, sideB, sideC;

        public Triangle3(){
            sideA = 12;
            sideB = 16;
            sideC = 20;
        }

        public Triangle3(int sideA, int sideB, int sideC){
            this.sideA = sideA;
            this.sideB = sideB;
            this.sideC = sideC;
        }

        @Override
        public int calcArea() {
            int sum = (sideA + sideB + sideC) / 2;
            return (int) Math.sqrt(sum * (sum - sideA)*(sum - sideB)*(sum - sideC));
        }

        @Override
        public String toString() {
            int sum = (sideA + sideB + sideC) / 2;
            return "Square of the third triangle: " + (int) Math.sqrt(sum * (sum - sideA)*(sum - sideB)*(sum - sideC));            }

        @Override
        public void draw() {
            System.out.println("The third triangle");
        }
    }

    public static class Circle extends com.company.Shape implements com.company.Drawable {
        public final int radius;
        final double PI = Math.PI;

        public Circle(){
            radius = 5;
        }

        public Circle(int radius){
            this.radius = radius;
        }

        public void draw(){
            System.out.println("The first circle");
        };

        @Override
        public int calcArea() {
            return (int) Math.round(PI * Math.pow(radius, 2));
        }

        @Override
        public String toString() {
            return "Square of the first circle: " + (int) Math.round(PI * Math.pow(radius, 2));
        }

    }

    static class Circle2 extends com.company.Shape implements com.company.Drawable {
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

        @Override
        public String toString() {
            String s = "Square of the second circle: " + (int) Math.round(PI * Math.pow(radius, 2));
            return s;
        }

        @Override
        public void draw() {
            System.out.println("The second circle");
        }
    }

    static class Circle3 extends com.company.Shape implements com.company.Drawable  {
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

        @Override
        public String toString() {
            return "Square of the third circle: " + (int) Math.round(PI * Math.pow(radius, 2));
        }

        @Override
        public void draw() {
            System.out.println("The third circle");
        }
    }


}
