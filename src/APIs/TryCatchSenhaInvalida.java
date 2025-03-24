package APIs;

import java.util.Scanner;

public class TryCatchSenhaInvalida {
    public static void main(String[] args) {

        String senha;

        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Digite o seu senha: ");
            senha = sc.nextLine();

            if (senha.length() < 8) {
                throw new SenhaInvalidaException("A senha deve ter ao menos 8 caracteres");
            }

        } catch (SenhaInvalidaException e) {
            System.out.println(e.getMessage());
        }

    }
}
