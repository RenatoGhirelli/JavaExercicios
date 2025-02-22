package Interfaces;

public class Produto implements Vendavel {

    private double preco;

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public double aplicaDesconto(int quantidade) {
        double total = preco * quantidade;

        if (quantidade >= 10) {
            return total - (total * 0.10);
        } else {
            return total;
        }
    }
}
