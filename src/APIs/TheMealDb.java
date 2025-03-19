/*

Documentação da API:
https://www.themealdb.com/api.php

*/


package APIs;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class TheMealDb {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o nome de uma receita: ");
        String busca = sc.nextLine();
        String buscaFormat = busca.replace(" ", "_");

        String endereco = "https://www.themealdb.com/api/json/v1/1/search.php?s=" + buscaFormat;

        HttpClient client = HttpClient.newHttpClient();

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(endereco))
                .build();

        HttpResponse<String> response = client.
                send(request, HttpResponse.BodyHandlers.ofString());

        System.out.println(response.body());

    }
}
