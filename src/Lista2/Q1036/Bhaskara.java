package Lista2.Q1036;

import java.util.Scanner;

public class Bhaskara {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        double R1, R2;

        double delta = (b * b) + -4 * a * c;

        if (a == 0 || delta < 0) {
            System.out.println("Impossivel calcular");

        } else {
            R1 = (-b + Math.sqrt(delta)) / (2 * a);
            R2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("R1 = " + String.format("%.5f", R1));
            System.out.println("R2 = " + String.format("%.5f", R2));

        }

    }

}
