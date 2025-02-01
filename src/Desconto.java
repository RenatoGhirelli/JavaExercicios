import java.util.Scanner;

public class Desconto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double precoOriginal = 0;
        double percentualDesconto = 0;

        System.out.println("Digite o valor do produto: ");
        precoOriginal = sc.nextDouble();
        System.out.println("Digite o valor do desconto: ");
        percentualDesconto = sc.nextInt();

        double resultado = precoOriginal - (precoOriginal / percentualDesconto);

        System.out.println("Novo preço com o desconto: R$" + resultado);


    }
}
