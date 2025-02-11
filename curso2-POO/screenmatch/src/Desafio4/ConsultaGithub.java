package Desafio4;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;


public class ConsultaGithub {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o nome do Github: ");
        String username = sc.nextLine();
        sc.close();

        try {
            consultarUsuarioGitHub(username);
        } catch (ErroConsultaGitHubException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }

    public static void consultarUsuarioGitHub(String username) {
        String endereco = "https://api.github.com/users/" + username;
        try {
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(endereco))
                    .header("User-Agent", "Java-App")
                    .build();
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            if (response.statusCode() == 404) {
                throw new ErroConsultaGitHubException("Usuário não encontrado no GitHub.");
            }

            System.out.println("Resposta da API: " + response.body());
        } catch (Exception e) {
            throw new RuntimeException("Erro ao consultar a API: " + e.getMessage());
        }
    }
}
