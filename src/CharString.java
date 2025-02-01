import java.util.Scanner;

public class CharString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String palavra;
        char palavra2;

        System.out.println("Digite a primeira palavra: ");
        palavra = sc.nextLine();
        System.out.println("Digite a segunda palavra: ");
        palavra2 = sc.next().charAt(0);

        System.out.println((String) palavra + palavra2);

    }
}
