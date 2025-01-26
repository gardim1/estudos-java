package Desafio1;

public class Musica {
    String titulo;
    String artista;
    int anoDeLancamento;
    double avaliacao;
    int numAvaliacoes;


    void fichaTecnica(){
        System.out.println("Nome da musica: " + titulo);
        System.out.println("Artista: " + artista);
        System.out.println("Ano de lancamento: " + anoDeLancamento);
    }

    void avaliar(int nota){
        avaliacao+=nota;
        numAvaliacoes++;
    }

    double calcularMedia(){
        return avaliacao/numAvaliacoes;
    }
}
