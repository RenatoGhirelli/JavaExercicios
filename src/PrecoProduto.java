import java.util.Scanner;

public class PrecoProduto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double precoProduto = 0;
        int quantidade = 0;
        double total = 0;

        System.out.println("Preço do produto: ");
        precoProduto = sc.nextDouble();
        System.out.println("Quantidade do produto: ");
        quantidade = sc.nextInt();

        total = precoProduto * quantidade;

        System.out.println("Total R$" + total);

    }
}
