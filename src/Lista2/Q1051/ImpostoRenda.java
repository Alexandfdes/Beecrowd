package Lista2.Q1051;

import java.util.Scanner;

public class ImpostoRenda {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double salario = scanner.nextDouble();

        if (salario <= 2000.00) {
            System.out.println("Isento");

        } else if (salario >= 2000.01 && salario <= 3000) {
           double imposto = ((salario - 2000) * 0.08);
            System.out.println("R$ " + String.format("%.2f", imposto));

        } else if (salario >= 3000.01 && salario <= 4500) {
           double imposto = (1000 * 0.08) + ((salario - 3000) * 0.18);
            System.out.println("R$ " + String.format("%.2f", imposto));
        } else {
            double imposto = (1000 * 0.08) + (1500 * 0.18) + ((salario - 4500.00) * 0.28);
            System.out.println("R$ " + String.format("%.2f", imposto));
        }

    }
}
