package Lista2.Q1048;

import java.util.Scanner;

public class AumentoSalario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double salario = scanner.nextDouble();

        if (salario > 0 && salario <= 400) {
            double salarioFinal = salario * 1.15;
            double ganho = salario * 0.15;
            System.out.println("Novo salario: " + String.format("%.2f", salarioFinal));
            System.out.println("Reajuste ganho: " + String.format("%.2f", ganho));
            System.out.println("Em percentual: 15 %");
        }
        if (salario >= 400.01 && salario <= 800) {
            double salarioFinal = salario * 1.12;
            double ganho = salario * 0.12;
            System.out.println("Novo salario: " + String.format("%.2f", salarioFinal));
            System.out.println("Reajuste ganho: " + String.format("%.2f", ganho));
            System.out.println("Em percentual: 12 %");

        }
        if (salario >= 800.01 && salario <= 1200) {
            double salarioFinal = salario * 1.10;
            double ganho = salario * 0.10;
            System.out.println("Novo salario: " + String.format("%.2f", salarioFinal));
            System.out.println("Reajuste ganho: " + String.format("%.2f", ganho));
            System.out.println("Em percentual: 10 %");

        }
        if (salario >= 1200.01 && salario <= 2000) {
            double salarioFinal = salario * 1.07;
            double ganho = salario * 0.07;
            System.out.println("Novo salario: " + String.format("%.2f", salarioFinal));
            System.out.println("Reajuste ganho: " + String.format("%.2f", ganho));
            System.out.println("Em percentual: 7 %");
        }
        if (salario > 2000) {
            double salarioFinal = salario * 1.04;
            double ganho = salario * 0.04;
            System.out.println("Novo salario: " + String.format("%.2f", salarioFinal));
            System.out.println("Reajuste ganho: " + String.format("%.2f", ganho));
            System.out.println("Em percentual: 4 %");
        }
    }
}