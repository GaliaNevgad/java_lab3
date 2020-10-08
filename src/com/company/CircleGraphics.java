package com.company;

import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;

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
