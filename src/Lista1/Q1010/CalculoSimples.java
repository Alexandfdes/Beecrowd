package Lista.Q1010;

import java.util.Scanner;

public class CalculoSimples {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        Double codigopeca1 = scanner.nextDouble();
        Double numeropeca1 = scanner.nextDouble();
        Double valorunit1 = scanner.nextDouble();
        Double codigopeca2 = scanner.nextDouble();
        Double numeropeca2 = scanner.nextDouble();
        Double valorunit2 = scanner.nextDouble();

        Double valorapagar = (numeropeca1 * valorunit1) + (numeropeca2 * valorunit2);

        System.out.println("VALOR A PAGAR: R$ " + String.format("%.2f", valorapagar));

    }
    
}
