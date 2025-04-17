package Lista2.Q1043;

import java.util.Scanner;

public class Triangulo {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        final double A = scanner.nextDouble();
        final double B = scanner.nextDouble();
        final double C = scanner.nextDouble();

        if (A + B > C && A + C > B && B + C > A) {
            double perimetroTriangulo = A + B + C;
            System.out.println("Perimetro = " + perimetroTriangulo);

        } else  { 
            double areaTrapezio = ((A + B) * C) / 2;
            System.out.println("Area = " + areaTrapezio);

        }
    }

}
