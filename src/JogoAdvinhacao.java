import java.util.Random;
import java.util.Scanner;

public class JogoAdvinhacao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int nSecreto = new Random().nextInt(100);
        int tentativa = 0;
        int contador = 0;

        while (tentativa != nSecreto && contador < 5 ) {

            System.out.println("Advinhe o número secreto: ");
            tentativa = sc.nextInt();

            if (tentativa == nSecreto) {
                System.out.println("Parabéns! O número secreto é " + nSecreto);
                break;
            }
            else if (tentativa < nSecreto) {
                System.out.println("o número secreto é maior");

            } else if (tentativa > nSecreto){
                System.out.println("O número secreto é menor");
            }
            contador++;
        }

        if (contador >= 5) {
            System.out.println("Fim do jogo, o número secreto era " + nSecreto);
        }

    }
}
