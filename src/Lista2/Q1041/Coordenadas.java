package Lista2.Q1041;

import java.util.Scanner;

public class Coordenadas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();
        double y = scanner.nextDouble();

        if (x == 0 && y == 0) {
            System.out.println("Origem");
        }
        if (x > 0 && y > 0) {
            System.out.println("Q1");

        }
        if (x < 0 && y > 0) {
            System.out.println("Q2");
        }
        if (x < 0 && y < 0) {
            System.out.println("Q3");
        }
        if (x > 0 && y < 0) {
            System.out.println("Q4");
        }
        if (x > 0 && y == 0 || x < 0 && y == 0) {
            System.out.println("Eixo X");
        }
        if (y > 0 && x == 0 || y < 0 && x == 0) {
            System.out.println("Eixo Y");
        }

    }
}