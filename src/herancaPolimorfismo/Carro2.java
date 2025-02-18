package herancaPolimorfismo;

public class Carro2 {
    private String modelo;
    private double precoAno1;
    private double precoAno2;
    private double precoAno3;

    public void definirPrecos(double precoAno1, double precoAno2, double precoAno3){
        this.precoAno1 = precoAno1;
        this.precoAno2 = precoAno2;
        this.precoAno3 = precoAno3;
    }

    public void exibirInfo(){
        System.out.println("Modelo: " + modelo);
        System.out.println("Preço Ano 1: " + precoAno1);
        System.out.println("Preço Ano 2: " + precoAno2);
        System.out.println("Preço Ano 3: " + precoAno3);
        System.out.println("Menor preço: " + calcularMenorPreco());
        System.out.println("Maior preço: " + calcularMaiorPreco());
    }

    public double calcularMenorPreco() {
        double menorPreco = 0;

        if (precoAno1 < precoAno2 && precoAno1 < precoAno3) {
            menorPreco = precoAno1;
        }
        else if (precoAno2 < precoAno1 && precoAno2 < precoAno3) {

            menorPreco = precoAno2;
        }
        else if (precoAno3 < precoAno1 && precoAno3 < precoAno2) {
            menorPreco = precoAno3;
        }
        return menorPreco;
    }

    public double calcularMaiorPreco(){
        double maiorPreco = 0;

        if (precoAno1 > precoAno2 && precoAno1 > precoAno3) {
            maiorPreco = precoAno1;
        }
        else if (precoAno2 > precoAno1 && precoAno2 > precoAno3) {

            maiorPreco = precoAno2;
        }
        else if (precoAno3 > precoAno1 && precoAno3 > precoAno2) {
            maiorPreco = precoAno3;
        }
        return maiorPreco;
    }
}
