import java.util.Scanner;

public class CalculaArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int opcao = 0;
        double area = 0;

        System.out.println("1 - Calcular área do quadrado" +
                "\n2 - Calcular área do circulo");
        opcao = sc.nextInt();

        if (opcao == 1) {
            double lado = 0;

            System.out.println("Qual o tamanho do lado do quadrado:");
            lado = sc.nextDouble();

            area = lado * lado;

            System.out.println("A área do quadrado é de: " + area);
        }
        else if (opcao == 2) {

            double raio = 0;

            System.out.println("quanto mede o raio do circulo?: ");
            raio = sc.nextDouble();

            area = Math.PI * Math.pow(raio, 2);

            System.out.println("A área do circulo é de: " + area);
        } else {
            System.out.println("Por favor reinicie o programa e digite uma opção valida");
        }
    }
}
