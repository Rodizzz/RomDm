package com.company;

import java.awt.*;
import java.util.Random;

public abstract class Bird {
    public String name;
    protected Color color;
    protected int x, y, size;
    protected static Random rd = new Random();
    private static int xMin = 0, yMin = 0, xMax = 1680, yMax = 1050, sizeMin = 35, sizeMax = 60;


    Bird() {
        this.x = rd.nextInt(xMax - xMin) + xMin;
        this.y = rd.nextInt(yMax - yMin) + yMin ;
        this.size = rd.nextInt(sizeMax - sizeMax) + sizeMin;
    }

    public abstract void greeting();

    public abstract void fly();

    public abstract String getName();

    public abstract void draw(Graphics g);
}
