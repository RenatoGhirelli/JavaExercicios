package arrayCollection;

import java.util.ArrayList;

public class ProdutoConstructorPrincipal {
    public static void main(String[] args) {

        ProdutoConstructor produto = new ProdutoConstructor();
        ProdutoConstructor produto2 = new ProdutoConstructor();

        produto.setNome("Lápís");
        produto.setPreco(1.0);

        produto2.setNome("Borracha");
        produto2.setPreco(2.0);

        ArrayList <ProdutoConstructor> listaDeProdutos = new ArrayList();

        listaDeProdutos.add(produto);
        listaDeProdutos.add(produto2);

        ProdutoConstructor produto3 = new ProdutoConstructor("Apontador", 1.75);
        listaDeProdutos.add(produto3);

        ProdutoPerecivelConstructor produto4 = new ProdutoPerecivelConstructor("Lanche", 5.00, "31/03/2025");
        listaDeProdutos.add(produto4);

        System.out.println("Tamanho da lista de produtos: " + listaDeProdutos.size());
        System.out.println("Produto perecível: " + listaDeProdutos.get(3));




    }
}
