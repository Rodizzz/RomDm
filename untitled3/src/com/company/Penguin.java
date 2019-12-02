package com.company;

import java.awt.*;

public class Penguin extends Bird {

    Penguin(String name) {
        this.name = name;
        this.color = Color.GRAY;
    }

    @Override
    public void greeting() {
        System.out.print("Привет! Я пингвин. Меня зовут " + getName() + ".");
    }

    @Override
    public void fly() {
        System.out.println(" Пингвины не летают ;)");
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(this.color);
        g.fillOval(this.x, this.y,this.size, this.size);
    }
}
