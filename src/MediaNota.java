import java.util.Scanner;

public class MediaNota {
    public static void main(String[] args) {

        double n1 = 0;
        double n2 = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a primeira nota: ");
        n1 = sc.nextDouble();
        System.out.println("Digite a segunda nota: ");
        n2 = sc.nextDouble();

        double media = (n1 + n2) /2;

        System.out.println("A média das notas é de: " + media);
    }
}
