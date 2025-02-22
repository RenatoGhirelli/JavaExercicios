package Interfaces;

public class PrincipalLivroProduto {
    public static void main(String[] args) {
        ProdutoFisico pf = new ProdutoFisico();
        pf.setPreco(100);
        Livro livro = new Livro();
        livro.setPreco(100);

        System.out.println("Preço do Produto Físico: " + pf.PrecoFinal(pf.getPreco()));
        System.out.println("Preço final do Livro: " + livro.PrecoFinal(livro.getPreco()));
    }
}
