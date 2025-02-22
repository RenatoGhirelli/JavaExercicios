package Interfaces;

public class ConversorTemperaturaPadrao implements ConversorTemperatura {



    @Override
    public int celsiusParaFahrenheit(int temperatura) {
        return temperatura * 9 / 5 + 32;
    }

    @Override
    public int fahrenheitParaCelsius(int temperatura) {
        return (temperatura - 32) * 5 / 9;
    }
}
