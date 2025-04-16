package Lista.Q1011;


import java.util.Scanner;

public class Esfera {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Double R = scanner.nextDouble();

        final double PI = 3.14159;
        Double volume = (4.0 / 3.0) * PI * Math.pow(R, 3);

        System.out.println("VOLUME = " + String.format("%.3f", volume));

    }

}
