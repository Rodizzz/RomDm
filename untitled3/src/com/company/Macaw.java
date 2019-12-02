package com.company;

import java.awt.*;

public class Macaw extends Bird {

    public Macaw(String name) {
        this.name = name;
        this.color = Color.RED;
    }

    @Override
    public void greeting() {
        System.out.print("Привет! Я попугай. Меня зовут " + getName() + ".");
    }

    @Override
    public void fly() {
        System.out.println(" Я умею летать :)");
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(this.color);
        g.fillOval(this.x, this.y, this.size, this.size);
    }
}
