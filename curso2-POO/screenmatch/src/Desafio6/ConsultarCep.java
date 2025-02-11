package Desafio6;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class ConsultarCep {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira seu CEP: ");
        String cep = sc.nextLine();
        String endereco = "https://viacep.com.br/ws/" + cep + "/json/";

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().uri(URI.create(endereco)).build();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        String resposta = response.body();

        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String json  = response.body();

        FileWriter meuEndereco = new FileWriter(cep + ".json");
        meuEndereco.write(json);
        meuEndereco.close();


        System.out.println("Arquivo salvo com sucesso! Nome: " + cep + ".json");
    }
}
