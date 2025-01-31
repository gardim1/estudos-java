package Desafio3;

import java.util.ArrayList;

public class Principal2 {
    public static void main(String[] args) {
        ArrayList<Pessoa> listaDePessoas = new ArrayList<>();

        Pessoa pessoa1 = new Pessoa("Vinicius", 19);
        Pessoa pessoa2 = new Pessoa("Monique", 21);
        Pessoa pessoa3 = new Pessoa("Theo", 9);

        listaDePessoas.add(pessoa1);
        listaDePessoas.add(pessoa2);
        listaDePessoas.add(pessoa3);

        System.out.println("Tamanho da lista: " + listaDePessoas.size());
        System.out.println("Primeira pessoa da lista: " + listaDePessoas.get(0).toString());
        System.out.println("Lista completa: " + listaDePessoas.toString());
        System.out.println("Lista de pessoas: ");
        for (Pessoa pessoa: listaDePessoas){
            System.out.println(pessoa);
        }
    }
}
