package Interfaces;

public class ProdutoFisico implements Calculavel {

    private double preco;

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public double PrecoFinal(double preco) {
        return preco + (preco * 0.05);
    }
}
