import java.util.Scanner;

public class SomaIntDouble {
    public static void main(String[] args) {
        int n1 = 0;
        double n2 = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o número int: ");
        n1 = sc.nextInt();
        System.out.println("Digite o número double: ");
        n2 = sc.nextDouble();

        int soma = (int) (n1 + n2);

        System.out.println(n1 + " + " + n2 + " = " + soma);

    }
}
