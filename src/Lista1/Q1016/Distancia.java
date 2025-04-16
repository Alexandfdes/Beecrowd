package Lista.Q1016;

import java.util.Scanner;

public class Distancia {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      int Distancia = scanner.nextInt();
      
        final int constanteX = 60;
        final int constanteY = 90;

      int Minutos = (Distancia * 60) / (constanteY - constanteX);

      System.out.println(Minutos + " minutos");



    }
}
