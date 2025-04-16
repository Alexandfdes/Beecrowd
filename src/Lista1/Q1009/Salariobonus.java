package Lista.Q1009;
import java.util.Scanner;

public class Salariobonus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String vendedor = scanner.nextLine();
        Double salario = scanner.nextDouble();
        Double vendas = scanner.nextDouble();
        Double total = ((vendas * 0.15 )+ (salario));
        //Sabendo que este vendedor ganha 15% de comissão sobre suas vendas efetuadas, 
       // informar o total a receber no final do mês, com duas casas decimais

       System.out.println("TOTAL = R$ " + String.format("%.2f", total));
    }

    
    
}
