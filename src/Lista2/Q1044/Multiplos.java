package Lista2.Q1044;

import java.util.Scanner;

public class Multiplos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int maior = Math.max(A, B);
        int menor = Math.min(A, B);

        if (maior % menor == 0) {
            System.out.println("Sao Multiplos");

        } else { 
            System.out.println("Nao sao Multiplos");

        }
        
    }
}
