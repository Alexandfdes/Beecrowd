package Lista1.Q1012;

import java.util.Scanner;

public class Area {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double A = scanner.nextDouble();
        double B = scanner.nextDouble();
        double C = scanner.nextDouble();
        double pi = 3.14159;
        double areatriangulo = (A * C) /2;
        double areacirculo = (pi * Math.pow(C, 2));
        double areatrapezio = ((A + B) * C) / 2;
        double areaquadrado = (B * B);
        double arearetangulo = (A * B);

        System.out.println("TRIANGULO: " + String.format("%.3f", areatriangulo));
        System.out.println("CIRCULO: " + String.format("%.3f", areacirculo));
        System.out.println("TRAPEZIO: " + String.format("%.3f", areatrapezio));
        System.out.println("QUADRADO: " + String.format("%.3f", areaquadrado));
        System.out.println("RETANGULO: " + String.format("%.3f", arearetangulo));

    }
}
