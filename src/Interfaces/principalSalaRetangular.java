package Interfaces;

public class principalSalaRetangular {
    public static void main(String[] args) {

        CalculadoraSalaRetangular sala = new CalculadoraSalaRetangular();

        System.out.println(sala.calculaArea(10, 20) + "\n" + sala.calculaPerimetro(10, 20));
    }
}
