package arrayCollection;

import java.util.ArrayList;
import java.util.Collections;

public class NumerosSort {
    public static void main(String[] args) {

        ArrayList<Integer> numeros = new ArrayList<>();

        numeros.add(1);
        numeros.add(123);
        numeros.add(56);
        numeros.add(4);
        numeros.add(8);

        Collections.sort(numeros);

        System.out.println(numeros);

    }

}
