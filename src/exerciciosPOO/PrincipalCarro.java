import java.util.Calendar;
import java.util.Date;

public class PrincipalCarro {
    public static void main(String[] args) {

        Carro carro = new Carro();

        carro.modelo = "Tipo";
        carro.ano = 1994;
        carro.cor = "Azul";


        carro.fichaTecnica();

        int idade = carro.calculaIdade(carro.ano);

        System.out.println("Esse carro tem " + idade + " anos");

    }
}
