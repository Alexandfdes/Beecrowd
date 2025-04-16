package Lista.Q1007;

import java.util.Scanner;

public class Diferenca {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in); // Cria um objeto Scanner para ler a entrada do usuário
        int A = scanner.nextInt(); // Lê o primeiro número
        int B = scanner.nextInt(); // Lê o segundo número
        int C = scanner.nextInt(); // Lê o terceiro número
        int D = scanner.nextInt(); // Lê o quarto número
        int diferenca = (A * B - C * D); // Calcula a diferença entre o produto de A e B e o produto de C e D
        // A diferença é calculada multiplicando A por B e subtraindo o produto de C por D

        System.out.println("DIFERENCA = " + diferenca); // Imprime a diferença
    }
    
}
