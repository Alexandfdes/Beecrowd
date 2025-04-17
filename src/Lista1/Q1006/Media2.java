package Lista1.Q1006;
import java.util.Scanner;

public class Media2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); // Cria um objeto Scanner para ler a entrada do usuário
        double A = scanner.nextDouble(); // Lê o primeiro número
        double B = scanner.nextDouble(); // Lê o segundo número
        double C = scanner.nextDouble(); // Lê o terceiro número
        double media = (A * 2 + B * 3 + C * 5) / 10; // Calcula a média ponderada

        System.out.println("MEDIA = " + String.format("%.1f", media)); // Imprime a média com 1 casa decimal

   
   
    }

}
