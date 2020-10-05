package com.company;

import java.awt.*;

interface Drawable{
    void draw(Graphics g);
}
public abstract class Shape implements Drawable{
    String shapeColor;

    public abstract double calcArea();
    public abstract String toString();

}
