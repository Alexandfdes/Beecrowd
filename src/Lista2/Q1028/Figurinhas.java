package Lista2.Q1028;

import java.util.Scanner;

public class Figurinhas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numerosCasos = scanner.nextInt();
       
        
        for (int i = 0; i < numerosCasos; i++) {
            int F1 = scanner.nextInt();
            int F2 = scanner.nextInt();
    
        int mdc = calcularMDC(F1, F2);
        System.out.println(mdc);
        }

        
    }
    public static int calcularMDC(int a, int b)
            {while (b != 0) {
            int resto = a % b;
            a = b;
            b = resto;
        }
        return a;

    }

}
