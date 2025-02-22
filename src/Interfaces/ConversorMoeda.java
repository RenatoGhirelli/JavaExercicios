package Interfaces;

public class ConversorMoeda implements ConversaoFinanceira {

    private double valorEmDolar;

    public double getValorEmDolar() {
        return valorEmDolar;
    }

    public void setValorEmDolar(double valorEmDolar) {
        this.valorEmDolar = valorEmDolar;
    }

    @Override
    public double ConverterDolarParaReal() {
        return valorEmDolar * 5.73;
    }
}
