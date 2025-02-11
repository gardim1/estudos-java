package Desafio5;

import java.io.FileWriter;
import java.io.IOException;

public class Ex1 {
    public static void main(String[] args) throws IOException {
        FileWriter escrever = new FileWriter("arquivo.txt");
        escrever.write("Conteudo a ser gravado no arquivo");
        escrever.close();
    }
}
