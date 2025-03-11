package arrayCollection;

import java.util.ArrayList;

public class FormaPrincipal {
    public static void main(String[] args) {

        int contadorCirculo = 1;
        int contadorQuadrado = 1;

        Circulo c1 = new Circulo();
        Quadrado q1 = new Quadrado();
        Circulo c2 = new Circulo();
        Quadrado q2 = new Quadrado();

        c1.setRaio(3.5);
        q1.setLado(7);
        c2.setRaio(9);
        q2.setLado(5);

        ArrayList<Forma> lista = new ArrayList<Forma>();
        lista.add(c1);
        lista.add(q1);
        lista.add(c2);
        lista.add(q2);

        for (Forma forma : lista) {

            if (forma instanceof Circulo){

                Circulo circulo = (Circulo) forma;
                System.out.println("Círculo " + contadorCirculo);
                System.out.println("Raio: " + circulo.getRaio());
                System.out.println("Area: " + circulo.calcularArea());
                System.out.println();

                contadorCirculo = contadorCirculo + 1;
            } else if (forma instanceof Quadrado){

                Quadrado quadrado = (Quadrado) forma;
                System.out.println("Quadrado " + contadorQuadrado);
                System.out.println("Lados: " + quadrado.getLado());
                System.out.println("Area: " + quadrado.calcularArea());
                System.out.println();
                contadorQuadrado = contadorQuadrado + 1;
            }
        }




    }

}
