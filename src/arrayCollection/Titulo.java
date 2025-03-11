package arrayCollection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Titulo implements Comparable<Titulo>{
    String nome;

    public Titulo(String nome) {
        this.nome = nome;
    }

    @Override
    public int compareTo(Titulo outroTitulo) {
        return this.nome.compareTo(outroTitulo.nome);
    }

    @Override
    public String toString() {
        return "Titulo: " + nome;
    }

    public static void main(String[] args) {
        Titulo titulo1 = new Titulo("O Silmarillion");
        Titulo titulo2 = new Titulo("Harry Potter");
        Titulo titulo3 = new Titulo("The Witcher");
        Titulo titulo4 = new Titulo("Nárnia");

        ArrayList<Titulo> titulos = new ArrayList<Titulo>();

        titulos.add(titulo1);
        titulos.add(titulo2);
        titulos.add(titulo3);
        titulos.add(titulo4);

        Collections.sort(titulos);

        System.out.println(titulos);

    }

}
