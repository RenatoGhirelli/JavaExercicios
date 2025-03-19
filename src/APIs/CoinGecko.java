/*

Documentação da API:
https://docs.coingecko.com/v3.0.1/reference/introduction

*/

package APIs;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

import static java.lang.String.format;

public class CoinGecko {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a criptomoeda desejada: ");
        String busca = sc.nextLine();

        String endereco = "https://api.coingecko.com/api/v3/coins/" + busca.toLowerCase() + "?x_cg_demo_api_key=CG-y1soy9JSeanBWrkHcDadsUin" ;


        HttpClient client = HttpClient.newHttpClient();

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(endereco))
                .build();

        HttpResponse<String> response = client.
                send(request, HttpResponse.BodyHandlers.ofString());

        System.out.println(response.body());

    }
}
