import java.util.Date;

public class Carro {

    String modelo;
    int ano;
    String cor;

    void fichaTecnica(){

        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
        System.out.println("Cor: " + cor);

    }

    int calculaIdade(int ano){

        Date anoAtual = new Date();

        return  anoAtual.getYear() + 1900 - ano;
    }

}
