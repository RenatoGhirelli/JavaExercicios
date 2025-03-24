package APIs;

import java.util.Scanner;

public class TryCatchDivid0 {

    public static void main(String[] args) {

        int n1 = 0;
        int n2 = 0;

        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Digite o primeiro número: ");
            n1 = sc.nextInt();

            System.out.println("Digite o segundo número: ");
            n2 = sc.nextInt();

            System.out.println(n1/n2);

        } catch (ArithmeticException e) {
            System.out.println("Impossível realizar divisão por 0");
        }



    }

}
