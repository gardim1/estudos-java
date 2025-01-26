package Desafio1;

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

    }
}
