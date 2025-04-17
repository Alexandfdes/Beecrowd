package Lista2.Q1038;

import java.util.Scanner;

class Produto {
    String nome = "cachorroQuente";
    int codigo = 1;
    double valor = 5.0;

    public Produto(int codigo, double valor) {
        this.codigo = codigo;
        this.valor = valor;
    }

}

public class Lanche {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Produto cachorroQuente = new Produto(1, 4.00);
        Produto x_Salada = new Produto(2, 4.50);
        Produto x_Bacon = new Produto(3, 5.00);
        Produto torradaSimples = new Produto(4, 2.00);
        Produto refrigerante = new Produto(5, 1.50);

        int codigoProduto = scanner.nextInt();
        int quantidade = scanner.nextInt();

        Produto produtoSelecionado = null;
        double valorTotal;

        if (codigoProduto == cachorroQuente.codigo) {
            produtoSelecionado = cachorroQuente;
        } else if (codigoProduto == x_Salada.codigo) {
            produtoSelecionado = x_Salada;
        } else if (codigoProduto == x_Bacon.codigo) {
            produtoSelecionado = x_Bacon;
        } else if (codigoProduto == torradaSimples.codigo) {
            produtoSelecionado = torradaSimples;
        } else if (codigoProduto == refrigerante.codigo) {
            produtoSelecionado = refrigerante;
        }

        if (produtoSelecionado != null) {
            valorTotal = produtoSelecionado.valor * quantidade;
            System.out.println("Total: R$ " + String.format("%.2f", valorTotal));

        }

    }

}
