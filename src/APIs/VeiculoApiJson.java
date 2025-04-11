package APIs;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class VeiculoApiJson {

    String modelo;
    String marca;
    String cor;
    int ano;

    @Override
    public String toString() {
        return "VeiculoApiJson{" +
                "modelo='" + modelo + '\'' +
                ", marca='" + marca + '\'' +
                ", cor='" + cor + '\'' +
                ", ano=" + ano +
                '}';
    }

    public static void main(String[] args) {

        Gson gson = new GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE).setPrettyPrinting().create();

        VeiculoApiJson teste = new VeiculoApiJson();

        teste.ano = 1994;
        teste.modelo = "Tipo";
        teste.marca = "Fiat";
        teste.cor = "Azul";

        System.out.println(gson.toJson(teste));



    }
}