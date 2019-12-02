package com.company;

import java.awt.*;
import java.util.ArrayList;

public class Flock {
    ArrayList<Bird> birds;
    int numberOfMacaws = 0, numberOfPenguins = 0;

    public Flock() {
        this.birds = new ArrayList<>();
        System.out.println("Введите число птиц");
        for (int i = 0; i < Main.sc.nextInt(); i++)
        {
            System.out.println("Какую птицу создаём? 1 - Попугай, 2 - Пингвин");
            switch (Main.sc.nextInt())
            {
                case 1:
                {
                    System.out.println("Введите имя Попугая");
                    birds.add(new Macaw(Main.sc.nextLine()));
                    numberOfMacaws++;
                    break;
                }
                case 2:
                 {
                    System.out.println("Введите имя Пингвин");
                    birds.add(new Penguin(Main.sc.nextLine()));
                    numberOfPenguins++;
                    break;
                 }
                default:{
                    System.out.println("Некорректное число");
                    i--;
                    break;
                }
            }
        }

        speak();
    }

    void speak() {
        for (Bird b : birds) {
            b.greeting();
            b.fly();
        }
    }

    void draw(Graphics g) {
        for (int i = 0; i < birds.size(); i++) {
            birds.get(i).draw(g);
        }
    }
}
