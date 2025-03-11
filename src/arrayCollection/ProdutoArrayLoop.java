package arrayCollection;

import java.util.ArrayList;

public class ProdutoArrayLoop {
    private String nome;
    private double preco;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ProdutoArrayLoop(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }


    public static void main(String[] args) {

        double soma = 0;


        ProdutoArrayLoop p1 = new ProdutoArrayLoop("Lápis", 1.5);
        ProdutoArrayLoop p2 = new ProdutoArrayLoop("Borracha", 6.0);
        ProdutoArrayLoop p3 = new ProdutoArrayLoop("Apontador", 4.75);
        ProdutoArrayLoop p4 = new ProdutoArrayLoop("Caderno", 10);

        ArrayList<ProdutoArrayLoop> lista = new ArrayList<ProdutoArrayLoop>();
        lista.add(p1);
        lista.add(p2);
        lista.add(p3);
        lista.add(p4);


        for (ProdutoArrayLoop p : lista) {

            System.out.println(p.nome);
            System.out.println(p.preco);
            System.out.println();

            soma = soma + p.preco;
        }

        System.out.println("Preço medio dos produtos: " + soma / lista.size());



    }

}
