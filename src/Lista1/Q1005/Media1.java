package Lista1.Q1005;
import java.util.Scanner;
import java.io.IOException;
import java.util.Locale;

public class Media1 {

    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       scanner .useLocale(Locale.US); // Define o locale para usar ponto como separador decimal
       double A = scanner.nextDouble(); // Lê o primeiro número
       double B = scanner.nextDouble(); // Lê o segundo número
       double Media = (A * 3.5 + B * 7.5) / 11; // Calcula a média ponderada
         // A média ponderada é calculada multiplicando cada número pelo seu peso, somando os resultados e dividindo pela soma dos pesos
         System.out.println("MEDIA = " + String.format ("%.5f", Media)); // Imprime a média com 5 casas decimais
         // String.format("%.5f", Media) formata o número para 5 casas decimais;
            // System.err.println() imprime a mensagem de erro, mas aqui é usado para imprimir a média
            // %.5f formata o número para 5 casas decimais
            // \n adiciona uma nova linha após a impressão
    }
    
}
