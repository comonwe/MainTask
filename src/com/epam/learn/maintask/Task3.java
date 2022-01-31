package com.epam.learn.maintask;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        System.out.println("Введите количество чисел:");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for (int i = 0; i < n; i++) {
            int a = (int) (Math.random() * 100);
            System.out.println(a);
        }
        for (int i = 0; i < n; i++) {
            int a = (int) (Math.random() * 100);
            System.out.print(a + " ");
        }
    }
}

