package Desafio3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class OredenacaoTitulos {
    public static void main(String[] args) {
        List<Integer> listaInteiros = new ArrayList<>();

        listaInteiros.add(3);
        listaInteiros.add(5);
        listaInteiros.add(1);
        listaInteiros.add(4);
        listaInteiros.add(2);
        System.out.println(listaInteiros);
        Collections.sort(listaInteiros);
        System.out.println(listaInteiros);

        List<Titulo> titulos = new ArrayList<>();
        titulos.add(new Titulo("Dogville"));
        titulos.add(new Titulo("O poderoso chefao"));
        titulos.add(new Titulo("Avatar"));
        titulos.add(new Titulo("Lost"));
        System.out.println(titulos);

        Collections.sort(titulos);
        System.out.println(titulos);

        //Crie uma lista utilizando a interface List e instancie-a tanto como ArrayList quanto como LinkedList. Adicione elementos e imprima a lista, mostrando que é possível trocar facilmente a implementação.

//        List<String> titulos1 = new ArrayList<>();
//        titulos1.add("Homem aranha");
//        titulos1.add("Clube da luta");
//        titulos1.add("Scarface");
//        System.out.println(titulos1);
//        List<String> titulos2 = new LinkedList<>();
//        titulos2.add("Homem aranha");
//        titulos2.add("Clube da luta");
//        titulos2.add("Scarface");
//        System.out.println(titulos2);

        //Modifique o Exercício 4 para declarar a variável de lista como a interface List, demonstrando o uso de polimorfismo.

        List<String> lista;

        lista = new ArrayList<>();
        lista.add("Homem aranha");
        lista.add("Clube da luta");
        lista.add("Scarface");
        System.out.println(lista);
        lista = new LinkedList<>();
        lista.add("Homem aranha");
        lista.add("Clube da luta");
        lista.add("Scarface");
        System.out.println(lista);
    }
}
