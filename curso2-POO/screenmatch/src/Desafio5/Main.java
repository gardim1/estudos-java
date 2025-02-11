package Desafio5;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
//        Titulo titulo = new Titulo();
//
//        titulo.setTitulo("Naruto: the last");
//        titulo.setGenero("Anime, Aventura");
//        titulo.setDuracaoMin(150);

        Veiculo v1 = new Veiculo();
        v1.setMarca("BMW");
        v1.setTipo("Carro");
        v1.setAno(2020);

        Gson gson = new GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE).setPrettyPrinting().create();
        String json = gson.toJson(v1);
        System.out.println(json);

        FileWriter escrever = new FileWriter("veiculo.txt");
        escrever.write(json);
        escrever.close();





    }
}
