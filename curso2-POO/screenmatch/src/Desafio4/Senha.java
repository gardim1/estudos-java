package Desafio4;

import java.util.Scanner;

public class Senha {
    private String senha;

    public Senha() throws SenhaInvalidaException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira o seu senha");
        this.senha = sc.nextLine();

        if(this.senha.length() < 8) {
            throw new SenhaInvalidaException("A senha deve ter pelo menos 8 caracteres");
        }
        System.out.println("Senha definida com sucesso");
    }
}
