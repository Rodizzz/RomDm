package com.company;

import javax.swing.*;
import java.awt.*;

public class MyWindow extends JFrame {
    private Flock f;
    public MyWindow(Flock f) {
        this.f = f;
        this.setSize(800, 600);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Окошко");
    }

    @Override
    public void paint(Graphics g) {
        f.draw(g);
    }
}
