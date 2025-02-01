import java.util.Scanner;

public class positivoNegativo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero = 0;

        System.out.println("Digite um número: ");
        numero = entrada.nextInt();

        if (numero < 0) {
            System.out.println("Número negativo");

        } else if (numero == 0) {
            System.out.println("0");

        } else {
                System.out.println("Número positivo");
        }
    }
}
