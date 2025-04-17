package Lista1.Q1014;

import java.util.Scanner;

public class Consumo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double X = scanner.nextDouble();
        double Y = scanner.nextDouble();
        double KM = (X / Y);

        System.out.println(String.format("%.3f", KM) + " km/l" );

    }
    
}
