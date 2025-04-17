package Lista2.Q1042;

import java.util.Arrays;
import java.util.Scanner;

public class SortSimples {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();

        int[] numeros = { A, B, C };
        Arrays.sort(numeros);

        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);

        }
        System.out.println("\n" + A);
        System.out.println(B);
        System.out.println(C);

    }

}
