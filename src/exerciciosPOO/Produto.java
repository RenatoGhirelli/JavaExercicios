package exerciciosPOO;

import java.util.Scanner;

public class Produto {

    private String nome;
    private double preco;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }



    public void aplicarDesconto() {

        double desconto;

        Scanner sc = new Scanner(System.in);

        System.out.println("Qual é o valor do desconto?: ");
        desconto = sc.nextDouble();

        desconto = (preco * desconto) / 100;

        preco = preco - desconto;

        System.out.println("O novo preco do " + nome + " é: " + preco);

    }
}
