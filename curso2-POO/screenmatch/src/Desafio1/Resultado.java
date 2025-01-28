package Desafio1;

import Desafio2.CalculadoraSalaRetangular;
import Desafio2.ConversorMoeda;
import Desafio2.TabuadaMultiplicacao;

public class Resultado {
    public static void main(String[] args) {
        Calculadora meuCalculo = new Calculadora();

        System.out.println(meuCalculo.dobraNumero(8));

        Musica minhaMusica = new Musica();


        minhaMusica.titulo = "Bound 2";
        minhaMusica.artista = "Kanye West";
        minhaMusica.anoDeLancamento = 2000;
        minhaMusica.fichaTecnica();

        minhaMusica.avaliar(10);
        minhaMusica.avaliar(8);
        minhaMusica.avaliar(9);

        System.out.println(minhaMusica.calcularMedia());

        ContaBancaria conta = new ContaBancaria();

        conta.setNumeroConta(123);
        conta.setSaldo(1000);
        conta.titular = "João";

        System.out.println("Número da Conta: " + conta.getNumeroConta());
        System.out.println("Saldo: " + conta.getSaldo());
        System.out.println("Titular: " + conta.titular);

        conta.setSaldo(1500);
        System.out.println("Novo Saldo: " + conta.getSaldo());


        idadePessoa idadePessoa = new idadePessoa();

        idadePessoa.setNome("Vinicius");
        idadePessoa.setIdade(19);

        System.out.println("Nome: "+idadePessoa.getNome());
        System.out.println("Idade: "+ idadePessoa.getIdade());

        idadePessoa.verificarIdade(idadePessoa.getIdade());

        System.out.println("-------------------------------------------------------------------");
        System.out.println("-------------------------------------------------------------------");
        System.out.println("-------------------------------------------------------------------");
        System.out.println("-------------------------------------------------------------------");

        ConversorMoeda conversorMoeda = new ConversorMoeda(6.11);

        double valorEmDolar = 100.0;
        double valorEmReais = conversorMoeda.converterDolarParaReal(valorEmDolar);

        System.out.println(valorEmReais);

        System.out.println("-------------------------------------------------------------------");
        System.out.println("-------------------------------------------------------------------");
        System.out.println("-------------------------------------------------------------------");

        CalculadoraSalaRetangular salaRetangular = new CalculadoraSalaRetangular();
        double areaFinal = salaRetangular.calcularArea(3,5);
        double perimetroFinal = salaRetangular.calcularPerimetro(3,5);

        System.out.println(areaFinal);
        System.out.println(perimetroFinal);

        System.out.println("-------------------------------------------------------------------");
        System.out.println("-------------------------------------------------------------------");
        System.out.println("-------------------------------------------------------------------");

        TabuadaMultiplicacao tabuadaMultiplicacao = new TabuadaMultiplicacao();
        tabuadaMultiplicacao.mostrarTabuada(5);

    }
}
