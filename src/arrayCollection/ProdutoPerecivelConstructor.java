package arrayCollection;

public class ProdutoPerecivelConstructor extends ProdutoConstructor {

    private String dataValidade;

    ProdutoPerecivelConstructor(String nome, double preco, String dataValidade) {
        super(nome, preco);
        this.dataValidade = dataValidade;
    }

    @Override
    public String toString() {
        return "\nProduto: " + this.getNome() + "\nPreco: " + this.getPreco() + "\nData de Validade: " + this.dataValidade;
    }


}
