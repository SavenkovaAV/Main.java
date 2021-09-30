package ru.vsu.cs.savenkova_a_v;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main (String[] args) {
        Locale.setDefault(Locale.ROOT);

        System.out.println("Введите длины сторон треугольника:");

        System.out.print("a=");
        double a = readLength();

        System.out.print("b=");
        double b = readLength();

        System.out.print("c=");
        double c = readLength();

        double P = findHalfPerimetr(a, b, c);

        double ha = findHeight(a, a, b, c, P);
        double hb = findHeight(b, a, b, c, P);
        double hc = findHeight(c, a, b, c, P);

        printAnswer(ha);
        printAnswer(hb);
        printAnswer(hc);
    }

    private static double readLength() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextDouble();
    }

    private static double findHalfPerimetr (double a, double b, double c) {
        return (a + b + c) / 2;
    }

    private static double findHeight (double x, double a, double b, double c, double P) {
        return (2 / x) * (Math.sqrt(P * (P - a) * (P - b) * (P - c)));
    }

    private static void printAnswer (double x) {
        System.out.printf("%.03f%n", x);
    }
}
