package Lista.Q1004;

import java.util.Scanner;
import java.io.IOException;

public class ProdutoSimples {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt(); // Lê o primeiro número inteiro
        int B = scanner.nextInt(); // Lê o segundo número inteiro
        int PROD = A * B; // Calcula o produto dos dois números
        System.out.println("PROD = " + PROD); // Imprime o resultado do produto}
    }

}