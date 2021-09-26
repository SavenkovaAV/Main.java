package ru.vsu.cs.savenkova_a_v;

import java.util.Locale;
import java.util.Scanner;

//2. Известны длины сторон a, b, c треугольника.
//Вычислить высоты этого треугольника.

public class Main {
    //Метод для нахождения полупериметра треугольника
    private static double poluperimetr (double a, double b, double c) {
        return (a + b + c) / 2;
    }
    //Методы для нахождения высот треугольника
    public static double heighta (double a, double b, double c, double P) {
        return (2 / a) * (Math.sqrt(P * (P - a) * (P - b) * (P - c)));
    }

    public static double heightb (double a, double b, double c, double P) {
        return (2 / b) * (Math.sqrt(P * (P - a) * (P - b) * (P - c)));
    }

    public static double heightc (double a, double b, double c, double P) {
        return (2 / c) * (Math.sqrt(P * (P - a) * (P - b) * (P - c)));
    }

    public static void main (String[] args) {
        Locale.setDefault(Locale.ROOT);

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите длины сторон треугольника:");
        System.out.print("a=");
        double a = scanner.nextDouble();
        System.out.print("b=");
        double b = scanner.nextDouble();
        System.out.print("c=");
        double c = scanner.nextDouble();
        double P = poluperimetr(a, b, c);
        double ha = heighta(a, b, c, P);
        double hb = heightb(a, b, c, P);
        double hc = heightc(a, b, c, P);

        System.out.printf("ha = %.03f%n", ha);
        System.out.printf("hb = %.03f%n", hb);
        System.out.printf("hc = %.03f%n", hc);
    }
}

