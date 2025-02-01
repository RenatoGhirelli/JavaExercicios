import java.util.Scanner;

public class ConversorTemperatura {
    public static void main(String[] args) {
        double C = 0;
        double F = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a temperatura em C°: ");
        C = sc.nextDouble();

        F = (int) (C * 1.8) + 32;
        System.out.println("C°" + C + " equivalem a F°" + F);
    }
}
