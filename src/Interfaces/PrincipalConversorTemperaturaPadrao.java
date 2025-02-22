package Interfaces;

public class PrincipalConversorTemperaturaPadrao {
    public static void main(String[] args) {

        ConversorTemperaturaPadrao conversor = new ConversorTemperaturaPadrao();


        System.out.println(conversor.fahrenheitParaCelsius(79));
        System.out.println(conversor.celsiusParaFahrenheit(30));

    }
}
