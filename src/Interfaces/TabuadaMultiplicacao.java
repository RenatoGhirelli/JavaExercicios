package Interfaces;

public class TabuadaMultiplicacao implements Tabuada {

    private int numero;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void mostrarTabuada() {
        for (int i =1; i<=10; i++ ) {
            System.out.println(numero + " x " + i + " = " + (numero*i));
        }
    }

}
