package Lista2.Q1046;

import java.util.Scanner;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class TempoJogo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int horaInicio = scanner.nextInt();
        int horaFim = scanner.nextInt();


        int novaHora = horaFim - horaInicio;

        if (novaHora < 0) {
            novaHora += 24;
        }

        if (novaHora == 0) {
            novaHora = 24;
        } 
        System.out.println("O JOGO DUROU " + novaHora + " HORA(S)");
    }
    
}
