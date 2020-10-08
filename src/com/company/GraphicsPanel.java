package com.company;

import javax.swing.*;
import java.awt.*;

public class GraphicsPanel extends JPanel {
    private final RectangleGraphics rectangleGraphics;
    private final CircleGraphics circleGraphics;
    private final TriangleGraphics triangleGraphics;

    public GraphicsPanel(){
        rectangleGraphics = new RectangleGraphics(170, 210, 10, 15);
        circleGraphics = new CircleGraphics(100, 100, 75, 75);
        triangleGraphics = new TriangleGraphics(150, 150, 78, 2);
    }

    @Override
    public void paintComponent(Graphics g){
        Graphics g2 = (Graphics2D) g;

        g2.setColor(Color.GREEN);
        g2.drawRect(30, 30, 50, 60);
        g2.setColor(Color.BLUE);
        g2.drawOval(120, 30, 60, 60);
        g2.setColor(Color.red);
        g2.drawLine(220, 90, 260, 20);
        g2.drawLine(260, 20, 300, 90);
        g2.drawLine(220, 90, 300, 90);
    }
}
