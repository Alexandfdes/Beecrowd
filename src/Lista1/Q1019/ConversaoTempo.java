package Lista.Q1019;

import java.util.Scanner;

public class ConversaoTempo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt(); // tempo total em segundos

        int Horas = N / 3600;
        int Minutos = (N % 3600) / 60;
        int Segundos = N % 60;

        System.out.println(Horas + ":" + Minutos + ":" + Segundos);
    }
}
