package com.epam.learn.maintask;

public class Task2 {
    public static void main(String[] args) {
        for (int i = args.length - 1; i > -1; i--) {
            System.out.print(args[i] + " ");
        }
        System.out.println();
    }
}