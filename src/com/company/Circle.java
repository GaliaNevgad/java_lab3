package com.company;
import java.awt.*;
import java.awt.Rectangle;
import java.awt.geom.AffineTransform;
import java.awt.geom.PathIterator;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import java.awt.Graphics;
import javax.swing.JFrame;

public class Circle extends Shape implements java.awt.Shape {
    public final double radius;
    final double PI = Math.PI;

    public Circle(){
        this(1);
    }

    public Circle(double radius){
        this.radius = radius;
    }

    public void draw(Graphics g){
        System.out.println("Круг");
        Graphics ga = (Graphics2D) g;
        ga.setColor(Color.red);
        ga.drawOval(100,100,200,200);
    };

    @Override
    public double calcArea() {
        return PI * Math.pow(radius, 2);
    }

    @Override
    public String toString() {
        return "Square: " + radius;
    }

    @Override
    public Rectangle getBounds() {
        return null;
    }

    @Override
    public Rectangle2D getBounds2D() {
        return null;
    }

    @Override
    public boolean contains(double x, double y) {
        return false;
    }

    @Override
    public boolean contains(Point2D p) {
        return false;
    }

    @Override
    public boolean intersects(double x, double y, double w, double h) {
        return false;
    }

    @Override
    public boolean intersects(Rectangle2D r) {
        return false;
    }

    @Override
    public boolean contains(double x, double y, double w, double h) {
        return false;
    }

    @Override
    public boolean contains(Rectangle2D r) {
        return false;
    }

    @Override
    public PathIterator getPathIterator(AffineTransform at) {
        return null;
    }

    @Override
    public PathIterator getPathIterator(AffineTransform at, double flatness) {
        return null;
    }
}
