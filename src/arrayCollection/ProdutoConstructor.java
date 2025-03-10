package arrayCollection;

public class ProdutoConstructor {

    private String nome;
    private double preco;

    public String getNome() {
        return nome;
    }

    public ProdutoConstructor() {}

    public ProdutoConstructor(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
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

    @Override
    public String toString() {
        return "\nProduto: " + this.getNome() + "\nPreco: " + this.getPreco();
    }
}
