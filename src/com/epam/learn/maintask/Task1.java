package com.epam.learn.maintask;

import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {
        System.out.println("Name");
        Scanner scan = new Scanner(System.in);
        String name = scan.next();
        System.out.println(" Hello, " + name + "!");
        scan.close();
    }
}
