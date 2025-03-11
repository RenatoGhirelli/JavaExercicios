package arrayCollection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayLinked {
    public static void main(String[] args) {
        List<String> lista;

        lista = new ArrayList<>();
        lista.add("Elemento 1");
        lista.add("Elemento 2");

        lista = new LinkedList<>();
        lista.add("Elemento A");
        lista.add("Elemento B");

        System.out.println("ArrayList: " + lista);
        System.out.println("LinkedList: " + lista);
    }
}
