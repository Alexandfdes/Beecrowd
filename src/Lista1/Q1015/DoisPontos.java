package Lista1.Q1015;

import java.util.Scanner;

public class DoisPontos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();

        String x1Str = Double.toString(x1);
        String y1Str = Double.toString(y1);
        String x2Str = Double.toString(x2);
        String y2Str = Double.toString(y2);

        double Distancia = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow(y2 - y1, 2));

        System.out.println(String.format("%.4f", Distancia));

    }

}
