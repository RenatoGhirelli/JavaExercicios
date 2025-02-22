package Interfaces;

public class PrincipalVendeval {
    public static void main(String[] args) {
        Servico servico1 = new Servico();
        Servico servico2 = new Servico();
        servico1.setPreco(1000);
        servico2.setPreco(1000);



        Produto produto1 = new Produto();
        Produto produto2 = new Produto();
        produto1.setPreco(500);
        produto2.setPreco(500);


        System.out.println("Total Servico 1: " + servico1.aplicaDesconto(5));
        System.out.println("Total Servico 2: " + servico2.aplicaDesconto(10));

        System.out.println("Total Produto 1: " + produto1.aplicaDesconto(5));
        System.out.println("Total Produto 2: " + produto2.aplicaDesconto(10));
    }
}
