package com.company;

import java.util.Scanner;

public class Main {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Flock flock = new Flock();
        MyWindow myWindow = new MyWindow(flock);
    }
}
