package Interfaces;

public class CalculadoraSalaRetangular implements CalculoGeometrico {

    private double altura;
    private double largura;

    @Override
    public double calculaArea(double altura, double largura) {
        return altura * largura;
    }

    @Override
    public double calculaPerimetro(double altura, double largura) {
        return 2 * (altura + largura);
    }

}
