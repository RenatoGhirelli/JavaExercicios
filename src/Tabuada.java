import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero = 0;
        int cont = 1;

        System.out.println("Digite um número: ");
        numero = sc.nextInt();

        while (cont < 1) {
            System.out.println(numero + " * " + cont + " = " + numero * cont);

            cont++;
        }
    }
}
