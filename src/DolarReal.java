import java.util.Scanner;

public class DolarReal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double dolar;
        double valorEmDolares  = 0;


        System.out.println("Quanto vale o dólar atual?: $");
        dolar = sc.nextDouble();
        System.out.println("Quantos dólares você tem?: $");
        valorEmDolares = sc.nextDouble();

        double convert =  dolar * valorEmDolares;

        System.out.println("$" + valorEmDolares + " equivalem a R$" + convert);


    }
}
