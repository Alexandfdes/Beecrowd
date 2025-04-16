import java.io.IOException;
import java.util.Scanner;
 
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class Area {
 
    public static void main(String[] args) throws IOException {
 
        Scanner scanner = new Scanner(System.in);
        double R = scanner.nextDouble();
        double pi = 3.14159;
        double A = pi * Math.pow(R, 2); // Calcula a área do círculo usando a fórmula A = π * R^2
        // Math.pow(R, 2) eleva R ao quadrado
        System.out.printf("A=%.4f\n", A); // Imprime o resultado com 4 casas decimais
        // %.4f formata o número para 4 casas decimais
        // \n adiciona uma nova linha após a impressão
    }
 
}