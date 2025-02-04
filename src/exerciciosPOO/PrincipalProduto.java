package exerciciosPOO;

public class PrincipalProduto {

    public static void main(String[] args) {

        Produto produto = new Produto();

        produto.setNome("Celular");
        produto.setPreco(56984);

        produto.aplicarDesconto();

    }
}
