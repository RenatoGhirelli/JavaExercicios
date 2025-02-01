import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero = 0;
        int resultado = 0;
        int cont = 0;

        System.out.println("Digite um numero: ");
        numero = sc.nextInt();

        resultado = numero;

        for (cont = numero - 1; cont > 0; cont--) {
            resultado = resultado * cont;
        }

        System.out.println("O fatorial de " + numero + " é " + resultado);
    }
}
