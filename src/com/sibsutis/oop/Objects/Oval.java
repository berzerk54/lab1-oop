package com.sibsutis.oop.Objects;

import java.awt.*;

import static com.sibsutis.oop.TheGame.SCALE;
import static com.sibsutis.oop.TheGame.SHIFT;

public class Oval extends Shape {

    public Oval(int x, int y) {
        super(x, y);
    }

    public void paint(Graphics g) {
        g.setColor(Color.orange);
        g.fillOval(this.posX , this.posY , SCALE - 8, SCALE - 8);
    }
}
