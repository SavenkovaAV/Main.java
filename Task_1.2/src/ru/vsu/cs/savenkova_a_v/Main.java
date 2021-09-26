package ru.vsu.cs.savenkova_a_v;

import java.util.Locale;
import java.util.Scanner;

//2. Известны длины сторон a, b, c треугольника.
//Вычислить высоты этого треугольника.

public class Main {

    public static void main (String[] args) {
        Locale.setDefault(Locale.ROOT);

        System.out.println("Введите длины сторон треугольника:");
        double x = 0;
        System.out.print("a=");
        double a = readlength(x);
        System.out.print("b=");
        double b = readlength(x);
        System.out.print("c=");
        double c = readlength(x);
        double P = poluperimetr(a, b, c);
        double ha = heighta(a, b, c, P);
        double hb = heightb(a, b, c, P);
        double hc = heightc(a, b, c, P);

        answera(ha);
        answerb(hb);
        answerc(hc);
    }
    private static double readlength (double l) {
        Scanner scanner = new Scanner(System.in);
        l = scanner.nextDouble();
        return l;
        }
  
    //Метод для нахождения полупериметра треугольника
    private static double poluperimetr (double a, double b, double c) {
        return (a + b + c) / 2;
    }
  
    //Методы для нахождения высот треугольника
    private static double heighta (double a, double b, double c, double P) {
        return (2 / a) * (Math.sqrt(P * (P - a) * (P - b) * (P - c)));
    }

    private static double heightb (double a, double b, double c, double P) {
        return (2 / b) * (Math.sqrt(P * (P - a) * (P - b) * (P - c)));
    }

    private static double heightc (double a, double b, double c, double P) {
        return (2 / c) * (Math.sqrt(P * (P - a) * (P - b) * (P - c)));
    }

    private static void answera (double ha) {
        System.out.printf("ha = %.03f%n", ha);
    }

    private static void answerb (double hb) {
        System.out.printf("hb = %.03f%n", hb);
    }

    private static void answerc (double hc) {
        System.out.printf("hc = %.03f%n", hc);
    }
}

