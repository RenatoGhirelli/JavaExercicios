package herancaPolimorfismo;

public class TesteCarro {
    public static void main(String[] args) {
        ModeloCarro carro= new ModeloCarro();

        carro.definirPrecos(45998.56, 78562.88, 99.999);
        carro.marca = "Fiat";
        carro.cor = "Azul marinho";
        carro.exibirInfo();


    }
}
