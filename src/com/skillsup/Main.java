package com.skillsup;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Введите три целых числа.");
        Scanner in = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int x = in.nextInt();
        System.out.print("Введите второе число: ");
        int y = in.nextInt();
        System.out.print("Введите третье число: ");
        int z = in.nextInt();
    }

    static String a(int x, int y, int z) {
        if (Math.pow(x, 2) + Math.pow(y, 2) == Math.pow(z, 2)) {
            System.out.print("- это Пифагорова тройка");
        } else {
            System.out.print("- это не Пифагорова тройка");
        }
    }
}