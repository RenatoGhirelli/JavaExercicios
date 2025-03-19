/*

Documentação da API:
https://developers.google.com/books/docs/overview

*/

package APIs;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class GoogleBooks {
    public static void main(String[] args) throws IOException, InterruptedException {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o nome do livro: ");
        String busca = sc.nextLine();
        String buscaFormat = busca.replace(" ", "+");

        String endereco = "https://www.googleapis.com/books/v1/volumes?q=" + buscaFormat.toLowerCase();

        HttpClient client = HttpClient.newHttpClient();

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(endereco))
                .build();

        HttpResponse<String> response = client.
                send(request, HttpResponse.BodyHandlers.ofString());

        System.out.println(response.body());



    }
}
