package Lista1.Q1018;

import java.util.Scanner;

public class Cedulas {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int Nori = N;
        int N100 = N / 100;  
        N = N % 100;

        int N50 = N / 50; 
        N = N % 50;

        int N20 = N / 20; 
        N = N % 20;

        int N10 = N / 10; 
        N = N % 10;

        int N5 = N / 5; 
        N = N % 5;

        int N2 = N / 2;
        N = N % 2;

        int N1 = N / 1; 
        N = N % 1;

        System.out.println(Nori);
        System.out.println(N100 + " nota(s) de R$ 100,00");
        System.out.println(N50 + " nota(s) de R$ 50,00");
        System.out.println(N20 + " nota(s) de R$ 20,00");
        System.out.println(N10 + " nota(s) de R$ 10,00");
        System.out.println(N5 + " nota(s) de R$ 5,00");
        System.out.println(N2 + " nota(s) de R$ 2,00");
        System.out.println(N1 + " nota(s) de R$ 1,00");
        


    }
    
}
