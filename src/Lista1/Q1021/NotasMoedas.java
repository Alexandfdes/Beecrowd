package Lista.Q1021;

import java.util.Scanner;

public class NotasMoedas {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double valor = scanner.nextDouble();
        int centavos = (int) Math.round(valor * 100); // converte tudo para centavos para evitar erro com ponto
                                                      // flutuante

        int[] notas = { 10000, 5000, 2000, 1000, 500, 200 };
        int[] moedas = { 100, 50, 25, 10, 5, 1 };

        System.out.println("NOTAS:");
        for (int nota : notas) {
            int qtd = centavos / nota;
            System.out.println(qtd + " nota(s) de R$ " + String.format("%.2f", nota / 100.0));
            centavos %= nota;
        }

        System.out.println("MOEDAS:");
        for (int moeda : moedas) {
            int qtd = centavos / moeda;
            System.out.println(qtd + " moeda(s) de R$ " + String.format("%.2f", moeda / 100.0));
            centavos %= moeda;

        }
    }
}