package ru.vsu.cs.savenkova_a_v;

import java.util.Locale;
import java.util.Scanner;

//2. Известны длины сторон a, b, c треугольника.
//Вычислить высоты этого треугольника.

public class Main {

    public static void main(String[] args) {
        Locale.setDefault(Locale.ROOT);

        Scanner scanner = new Scanner(System.in);
        //
        System.out.println("Введите длины сторон треугольника:");
        System.out.print("a=");
        double a = scanner.nextInt();
        System.out.print("b=");
        double b = scanner.nextInt();
        System.out.print("c=");
        double c = scanner.nextInt();

        //Вычисляем полуперимерт треугольника
        double p = (a + b + c) / 2;
        //Находим высоты по формулам
        double ha = (2 / a) * (Math.sqrt(p * (p - a) * (p - b) * (p - c)));
        double hb = (2 / b) * (Math.sqrt(p * (p - a) * (p - b) * (p - c)));
        double hc = (2 / c) * (Math.sqrt(p * (p - a) * (p - b) * (p - c)));

        System.out.printf("ha = %.03f%n", ha);
        System.out.printf("hb = %.03f%n", hb);
        System.out.printf("hc = %.03f%n", hc);
    }
}



