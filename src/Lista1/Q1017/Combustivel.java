package Lista.Q1017;

import java.util.Scanner;

public class Combustivel {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        double Consumo = 12;
        int Tempo = scanner.nextInt();
        int VelocidadeMedia = scanner.nextInt();
        double Distancia = Tempo * VelocidadeMedia;

        double litros = Distancia / Consumo;

        System.out.println(String.format("%.3f", litros));
    }
}