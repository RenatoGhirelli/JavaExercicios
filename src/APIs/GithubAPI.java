package APIs;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class GithubAPI {
    public static void main(String[] args) throws IOException, InterruptedException {

        String username;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your username: ");
        username = sc.nextLine();

        String buscaAPI = "https://api.github.com/users/" + username;

        try {
            HttpClient client = HttpClient.newHttpClient();

            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(buscaAPI))
                    .build();

            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());

            if (response.statusCode() == 404) {
                throw new ErroConsultaGitHubException("Usuário não encontrado no Github");
            }

            System.out.println(response.body());

        } catch (ErroConsultaGitHubException e) {
            System.out.println("Aconteceu um erro");
            System.out.println(e.getMessage());

        }


    }
}
