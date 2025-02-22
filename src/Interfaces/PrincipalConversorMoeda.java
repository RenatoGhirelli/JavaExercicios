package Interfaces;

public class PrincipalConversorMoeda {
    public static void main(String[] args) {

        ConversorMoeda conversor = new ConversorMoeda();
        conversor.setValorEmDolar(100);

        System.out.println("Valor em Dolar: " + conversor.getValorEmDolar() + " Valor em real após a conversão: " + conversor.ConverterDolarParaReal());


    }
}
