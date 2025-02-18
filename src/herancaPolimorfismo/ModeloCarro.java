package herancaPolimorfismo;

public class ModeloCarro extends Carro2{

    String cor;
    String marca;

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public void exibirInfo() {
        super.exibirInfo();
        System.out.println("Cor: " + cor);
        System.out.println("Marca: " + marca);
    }
}