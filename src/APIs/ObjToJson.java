package APIs;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class ObjToJson {

    String titulo;
    int ano;

    @Override
    public String toString() {
        return "ObjToJson{" +
                "titulo='" + titulo + '\'' +
                ", ano=" + ano +
                '}';
    }

    public static void main(String[] args) {

        Gson gson = new GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE).setPrettyPrinting().create();

        ObjToJson teste = new ObjToJson();

        teste.ano = 2001;
        teste.titulo = "Harry Potter";

        System.out.println(gson.toJson(teste));



    }
}
