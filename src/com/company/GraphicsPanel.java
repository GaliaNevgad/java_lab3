package com.company;

import javax.swing.*;
import java.awt.*;

public class GraphicsPanel extends JPanel {
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

    @Override
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
