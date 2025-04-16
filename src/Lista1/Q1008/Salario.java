package Lista.Q1008;
import java.util.Scanner;

public class Salario {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int numero = scanner.nextInt();
        int horas = scanner.nextInt();
        double valor = scanner.nextDouble();
        double salario = (valor * horas);
        
        System.out.println("NUMBER = " + numero);
        System.out.println("SALARY = U$ " + String.format("%.2f", salario));





    }
}
