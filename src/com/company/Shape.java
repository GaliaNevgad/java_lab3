package com.company;

import java.awt.*;

interface Drawable{
    void draw();
}
public abstract class Shape implements Drawable{
    String shapeColor;

    public abstract int calcArea();
    public abstract String toString();

}
