import java.util.Scanner;

public class igualDiferente {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1 = 0;
        int n2 = 0;

        System.out.println("Digite o primeiro número: ");
        n1 = sc.nextInt();

        System.out.println("Digite o segundo número: ");
        n2 = sc.nextInt();

        if (n1 > n2) {
            System.out.println("Os números são diferentes, " + n1 + " é maior do que " + n2);
        } else if (n2 > n1) {
            System.out.println("Os números são diferentes, " + n2 + " é maior do que " + n1);
        } else {
            System.out.println("Os números são iguais");
        }
    }
}
